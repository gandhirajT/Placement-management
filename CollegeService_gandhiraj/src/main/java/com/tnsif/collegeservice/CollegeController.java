package com.tnsif.collegeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class CollegeController 
{
      @Autowired
      private Collegeservice coll;
      @GetMapping("/Collegeservice")
      public List<College> list(){
    	  return coll.listAll();
      }
      @PostMapping("/Collegeservice")
      public void add(@RequestBody College coll1) {
    	  coll.save(coll1);
      }
      @GetMapping("/Collegeservice/{id}")
      public ResponseEntity<College>get(@PathVariable Integer id){
    	  try {
    	  College c= coll.get(id);
    	  return new ResponseEntity<College>(c,HttpStatus.OK);
    	  }
    	  catch(NoResultException e) {
    		  return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
    	  }
      }
      @DeleteMapping("/Collegeservice/{id}")
      public void delete(@PathVariable Integer id) {
    	  coll.delete(id);
      }
      @PutMapping("/Collegeservice/{id}")
      public ResponseEntity<College>update(@PathVariable Integer id,@RequestBody College update_c){
    	  try {
    	  College exist_c= coll.get(id);
    	  exist_c.setName(update_c.getName());
    	  return new ResponseEntity<College>(exist_c,HttpStatus.OK);
    	  }
    	  catch(NoResultException e) {
    		  return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
    	  }
}
      }
