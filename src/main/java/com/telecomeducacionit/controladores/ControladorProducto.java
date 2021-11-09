package com.telecomeducacionit.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecomeducacionit.entidades.Producto;
import com.telecomeducacionit.servicios.ProductoServiceImpl;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class ControladorProducto {
	
	@Autowired
	private ProductoServiceImpl productoServiceImpl;
	
	@PostMapping("/productos")
	public Producto guardarProducto(@RequestBody Producto producto) {
		
		return productoServiceImpl.guardarProducto(producto);
	}
	
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		
		return productoServiceImpl.ListarProductos();
	}
	
	@GetMapping("/productos/{id}")
	public Producto buscarProducto(@PathVariable Integer id) {
		
		return productoServiceImpl.buscarProducto(id);
	}
	
	@PutMapping("/productos/{id}")
	public Producto actualizarProducto(@RequestBody Producto producto, @PathVariable Integer id) {
		
		Producto productoActual = productoServiceImpl.buscarProducto(id);
		
		productoActual.setNombre(producto.getNombre());
		productoActual.setDescripcion(producto.getDescripcion());
		productoActual.setCantidad(producto.getCantidad());
		productoActual.setPrecio(producto.getPrecio());
		productoActual.setImagen(producto.getImagen());
		
		return productoServiceImpl.guardarProducto(productoActual);
	}
	
	@DeleteMapping("/productos/{id}")
	public void eliminarProducto(@PathVariable Integer id) {
		
		productoServiceImpl.eliminaProducto(id);
	}
	

}

