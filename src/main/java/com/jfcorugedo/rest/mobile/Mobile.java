package com.jfcorugedo.rest.mobile;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class Mobile {

	private String id;
	private String name;
	private String brand;
	private String color;
	private double price;
	private Plan plan;
}
