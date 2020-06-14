package com.mario.capas.labo5.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mario.capas.labo5.dao.*;
import com.mario.capas.labo5.domain.Estudiante;
import com.mario.capas.labo5.repositories.EstudianteRepo;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	EstudianteRepo estudianteRepo;
	//EstudianteDAO estudianteDAO;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteRepo.findAll();
	}

	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteRepo.getOne(code);
	}

	@Override
	@Transactional
	public void save(Estudiante estudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteRepo.save(estudiante);
	}

	@Override
	@Transactional
	public void delete(Integer codigoEstudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteRepo.deleteById(codigoEstudiante);

	}

	@Override
	public List<Estudiante> filtrarPor(String cadena) throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteRepo.findByNombre(cadena);

	}
	
	@Transactional
	public void update(Estudiante estudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteRepo.save(estudiante);
	}
	
}
