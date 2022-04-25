/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Service;

import com.codeteam.CrudCode.Model.Actividad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.codeteam.CrudCode.Dao.ActividadDao;

/**
 *
 * @author yonder
 */
@Service
public class ActividadServiceImplement  implements ActividadService{
    @Autowired
    private ActividadDao tareaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Actividad> findAll()
    {
        return (List<Actividad>) tareaDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Actividad save(Actividad tarea)
    {
        return tareaDao.save(tarea);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Actividad findById(Integer id)
    {
        return tareaDao.findById(id).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        tareaDao.deleteById(id);
    }
    
}
