package com.example.projetodesoftwaretrabalho1.repository;

import com.example.projetodesoftwaretrabalho1.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


}