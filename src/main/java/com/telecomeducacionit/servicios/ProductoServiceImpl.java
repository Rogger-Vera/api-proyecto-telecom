package com.telecomeducacionit.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.telecomeducacionit.DAO.IProductoDAO;
import com.telecomeducacionit.entidades.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoDAO iProductoDao;
	
	@Override
	@Transactional(readOnly = false)
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return iProductoDao.save(producto);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> ListarProductos() {
		// TODO Auto-generated method stub
		return (List<Producto>) iProductoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto buscarProducto(Integer id) {
		// TODO Auto-generated method stub
		return iProductoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public void eliminaProducto(Integer id) {
		// TODO Auto-generated method stub
		iProductoDao.deleteById(id);
		
	}

}
