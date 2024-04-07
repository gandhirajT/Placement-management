package com.tnsif.collegeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Collegeservice {
	@Autowired
	private CollegeRepository repo;
	
public List<College> listAll(){
return repo.findAll();	
}
public void save(College coll){
	repo.save(coll);
}
public College get(Integer id) {
	return repo.findById(id).get();
}
public void delete(Integer id){
	repo.deleteById(id);

}
public void pudate(College coll){
	repo.save(coll);
}
}