package model;

import java.util.List;

public interface IClienteDAO {

	public void createCliente(Cliente c);
	public List<Cliente> readAll();
	public Cliente readOne(int id);
	public void updateCliente(Cliente c);
	public void deleteCliente(Cliente c);
	
	
}
