package com.project02.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//rendelés osztály, ebben majd a productok gyüjtő helye lesz

@Table(name ="order_table")
@Entity
public class OrderEntity {
	
	@Id
	@Column(name="order_id")
	private Long orderid;

}
