package com.telecomeducacionit.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telecomeducacionit.entidades.Usuario;

@Repository
public interface IUsuarioDAO extends CrudRepository<Usuario, Integer> {

}
