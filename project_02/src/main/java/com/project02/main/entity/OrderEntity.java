package com.project02.main.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Collections;

//rendelés osztály, ebben majd a productok gyüjtő helye lesz

@Entity
@Table(name ="order_table")
public class OrderEntity {
	
	@Id
	@Column(name="order_id", unique = true)
	private Long orderid;

	/*
	//WIP

	@Column(name="order_date")
	@NotEmpty
	private String order_date;

	@Column(name="user_id")
	@ManyToMany(cascade = CascadeType.ALL)
	private Long user_id;

	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "order_id")
	private Collection<Product> productCollection;
	*/


}
