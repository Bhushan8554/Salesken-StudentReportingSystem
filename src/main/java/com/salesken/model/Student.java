package com.salesken.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Data
@Document(indexName = "student")
public class Student {

	@Id
	private Integer roll;
	private String name;
	private Integer age;
	private String address;
	
	private Map<String, Integer> sem1=new HashMap<>();
	private Map<String, Integer> sem2=new HashMap<>();
}
