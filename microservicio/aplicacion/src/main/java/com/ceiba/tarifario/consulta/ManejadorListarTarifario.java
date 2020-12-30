package com.ceiba.tarifario.consulta;


import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.tarifario.modelo.dto.DtoTarifa;
import com.ceiba.tarifario.puerto.dao.DaoTarifario;

@Component
public class ManejadorListarTarifario {

	private final DaoTarifario daoTarifario;
	
	public ManejadorListarTarifario (DaoTarifario daoTarifario) {
		this.daoTarifario = daoTarifario;		
	}
	
	public List<DtoTarifa> ejecutar() {		
		return daoTarifario.listarComoObjetos();
	}
	
}
