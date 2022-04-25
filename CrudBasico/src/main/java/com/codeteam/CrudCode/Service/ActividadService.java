/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codeteam.CrudCode.Service;

import com.codeteam.CrudCode.Model.Actividad;
import java.util.List;

/**
 *
 * @author yonder
 */
public interface ActividadService {
    public List<Actividad> findAll();
    public Actividad save(Actividad tarea);
    public Actividad findById(Integer id);
    public void delete(Integer id);
    
}
