package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {

	@Override
	public void createCliente(Cliente c) {
		
		String sql = "insert into customers (customer_id, name, address, website, credit_limit) values (" + 
				c.getId() + ", " + c.getNombre() + ", " + c.getDireccion() + 
				", " + c.getWebsite() + ", " + c.getCredito() + ")";
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			cn.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método createCliente");
			e.printStackTrace();
		}
		
		
	}
	
	
	

	@Override
	public List<Cliente> readAll() {
		List<Cliente> lista = new ArrayList<Cliente>();
		
		try {
			
			//establecemos conexión con objeto Singleton
			Connection c = Conexion.getConnection();
			//
			Statement s = c.createStatement();
			String sql = "select customer_id, name, address, website, credit_limit from customers";
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				
				/*
				Cliente cli = new Cliente();
				cli.setId(rs.getInt("customer_id"));
				cli.setId(rs.getInt("name"));
				...
				lista.add(cli);*/
				
				//creo una instancia de cliente, le paso los datos del resultset, y lo agrego a la lista.
				lista.add(new Cliente(rs.getInt("customer_id"), rs.getString("name"), rs.getString("address"), rs.getString("website"), rs.getDouble("credit_limit")));
			}
			
			//s.close();
			//rs.close();
			//c.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método readAll");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public void updateCliente(Cliente c) {
		String sql = "update customers set (name ='" + c.getNombre() + "', address ='" + c.getDireccion() + "', website='" + c.getWebsite() + "', credit_limit=" + c.getCredito() + ")"; 
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			cn.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método updateCliente");
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteCliente(Cliente c) {
		String sql = "delete from customers where customer_id =" + c.getId(); 
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			cn.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método updateCliente");
			e.printStackTrace();
		}
		
		
	}




	@Override
	public Cliente readOne(int id) {
		
		Cliente cli = null;
		
		try {
			
			//establecemos conexión con objeto Singleton
			Connection c = Conexion.getConnection();
			//
			Statement s = c.createStatement();
			String sql = "select customer_id, name, address, website, credit_limit from customers where customer_id=" + id;
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				//creo una instancia de cliente, le paso los datos del resultset, y lo agrego a la lista.
				cli = new Cliente(rs.getInt("customer_id"), rs.getString("name"), rs.getString("address"), rs.getString("website"), rs.getDouble("credit_limit"));
			}
			
			//s.close();
			//rs.close();
			//c.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método readAll");
			e.printStackTrace();
		}
		
		return cli;
		
		
	}


}
