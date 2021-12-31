package com.example.ConexionBD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConexionBD.entity.Empleado;
import com.example.ConexionBD.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	public List<Empleado> getAllEmpleados(){
		return empleadoRepository.findAll();
	}
}
