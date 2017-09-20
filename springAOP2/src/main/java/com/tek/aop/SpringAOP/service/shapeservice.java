package com.tek.aop.SpringAOP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tek.aop.SpringAOP.model.circle;
import com.tek.aop.SpringAOP.model.Triangle;
@Component
public class shapeservice {
	@Autowired
private circle c;
	@Autowired
	private Triangle t;
	
public circle getC() {
	return c;
}
public void setC(circle c) {
	this.c = c;
}
public Triangle getT() {
	return t;
}
public void setT(Triangle t) {
	this.t = t;
}

}
