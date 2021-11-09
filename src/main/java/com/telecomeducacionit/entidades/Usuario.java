package com.telecomeducacionit.entidades;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Clientes")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false)
	private Integer id;
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String apellido;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String usuario;
	@Column(nullable=false)
	private String contraseña;
	@Column(nullable=false)
	private String domicilio;
	@Column(nullable=false)
	private String tipo;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="usuarios_productos"
			,joinColumns=@JoinColumn(name="usuario_id")
			,inverseJoinColumns=@JoinColumn(name="producto_id"))
	private List<Producto> productos;
	


	public Usuario() {
		
	}

	public Usuario(Integer id, String nombre, String apellido, String email, String usuario, String contraseña,
			String domicilio, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.domicilio = domicilio;
		this.tipo = tipo;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	

	

}
