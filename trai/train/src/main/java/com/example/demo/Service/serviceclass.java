package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.pojoclass;
import com.example.demo.Repo.repo;

@Service
public class serviceclass {
	@Autowired
	repo repository;
	
	public String addCustomer(pojoclass customer)
	{
		repository.save(customer);
		return "Added";
	}
	public List<pojoclass> getCustomer()
	{
		return repository.findAll();
	}
	public Optional<pojoclass> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(pojoclass customer)
	{
		repository.save(customer);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}
	
}


