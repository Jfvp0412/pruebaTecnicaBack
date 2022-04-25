/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Controller;

import com.codeteam.CrudCode.Model.Actividad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codeteam.CrudCode.Service.ActividadService;

/**
 *
 * @author yonder
 */
@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class ActividadController {
    @Autowired
    private ActividadService actividadService;
    
    //listar
    @GetMapping("/actividades")
    public List<Actividad> listar()
    {
        return actividadService.findAll();
    }
    
    //guardar
    @PostMapping("/actividades")
    public  Actividad guardar(@RequestBody Actividad actividad)
    {
        return actividadService.save(actividad);
    }
    
    //get una tarea
    @GetMapping("/actividades/{id}")
    public Actividad getUnaTarea(@PathVariable Integer id)
    {
        return actividadService.findById(id);
    }
    
    //Modeficar
    @PutMapping("/actividades/{id}")
    public Actividad modificar(@RequestBody Actividad actividad,@PathVariable Integer id)
    {
        Actividad actividadActual = actividadService.findById(id);
        actividadActual.setDiasRetraso(actividad.getDiasRetraso());
        actividadActual.setEstado(actividad.getEstado());
        actividadActual.setFechaEjecucion(actividad.getFechaEjecucion());
        actividadActual.setId(actividad.getId());
        actividadActual.setIdEmpleado(actividad.getIdEmpleado());
        actividadActual.setNombre(actividad.getNombre());
        return actividadService.save(actividadActual);
    }
    
    @DeleteMapping("/actividades/{id}")
    public void eliminar(@PathVariable Integer id)
    {
        actividadService.delete(id);
    }
    
}
