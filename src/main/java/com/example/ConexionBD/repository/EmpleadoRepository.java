package com.example.ConexionBD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ConexionBD.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

}
