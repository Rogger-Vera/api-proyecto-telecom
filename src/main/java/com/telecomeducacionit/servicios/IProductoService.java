package com.telecomeducacionit.servicios;

import java.util.List;

import com.telecomeducacionit.entidades.Producto;

public interface IProductoService {
	
	public Producto guardarProducto(Producto producto);
	
	public List<Producto> ListarProductos();
	
	public Producto buscarProducto(Integer id);
	
	public void eliminaProducto(Integer id);
	
	
}
