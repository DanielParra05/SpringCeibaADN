package com.ceiba.tarifario.adaptador.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.tarifario.puerto.dao.DaoTarifario;

@Component
public class DaoTarifarioMySql implements DaoTarifario {

	private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

	@SqlStatement(namespace = "tarifario", value = "listar")
	private static String sqlListar;

	public DaoTarifarioMySql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
		this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
	}

	@Override
	public HashMap<String, Double> listar() {
		return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar,
				new ResultSetExtractor<HashMap<String, Double>>() {
					@Override
					public HashMap<String, Double> extractData(ResultSet rs) throws SQLException {
						HashMap<String, Double> mapRet = new HashMap<>();
						while (rs.next()) {
							mapRet.put(rs.getString("llave"), rs.getDouble("valor"));
						}
						return mapRet;
					}
				});
	}
}
