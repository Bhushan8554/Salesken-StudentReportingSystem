package com.salesken.model;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "Semister1")
public class Semester {

	private Integer english;
	private Integer math;
	private Integer science;
}
