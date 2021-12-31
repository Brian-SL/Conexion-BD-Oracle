package com.example.ConexionBD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ConexionBD.entity.Empleado;
import com.example.ConexionBD.service.EmpleadoService;

@RestController
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/listaempleados")
	private List<Empleado> getAllEmpleados(Model model){
		return empleadoService.getAllEmpleados();
	}
}
