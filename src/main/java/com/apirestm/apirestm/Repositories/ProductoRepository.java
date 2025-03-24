package com.apirestm.apirestm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirestm.apirestm.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long> {

}
