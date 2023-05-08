package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.pojoclass;

@Repository
public interface repo extends JpaRepository<pojoclass, Integer>{

}
