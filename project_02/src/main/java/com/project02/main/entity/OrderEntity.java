package com.project02.main.entity;

import javax.persistence.*;
import java.util.Collections;

//rendelés osztály, ebben majd a productok gyüjtő helye lesz

@Table(name ="order_table")
@Entity
public class OrderEntity {
	
	@Id
	@Column(name="order_id")
	private Long orderid;
}
