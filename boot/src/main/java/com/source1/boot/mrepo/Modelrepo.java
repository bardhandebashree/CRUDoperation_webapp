package com.source1.boot.mrepo;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.source1.boot.model.Model1;
@Repository
public interface Modelrepo extends CrudRepository<Model1,Integer>{
	
 
}
