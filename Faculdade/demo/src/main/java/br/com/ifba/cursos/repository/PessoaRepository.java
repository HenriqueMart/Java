/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.cursos.repository;

import br.com.ifba.cursos.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hmart
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}