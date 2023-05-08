package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.pojoclass;
import com.example.demo.Service.serviceclass;
@RestController

public class Controller {
	@Autowired
	serviceclass cusservice;
	
	@PostMapping("")
	public String create(@RequestBody pojoclass customer)
	{
		return cusservice.addCustomer(customer);
	}
	@GetMapping("")
	public List<pojoclass> read()
	{
		return cusservice.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional<pojoclass>readById(@PathVariable int id)
	{
		return cusservice.getCustomerById(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody pojoclass customer)
	{
		return cusservice.updateCustomer(customer);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("cid") int id)
	{
		cusservice.deleteByRequestParam(id);
		return "deleted";
	}
}




