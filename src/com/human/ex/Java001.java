package com.human.ex;

import com.human.dto.Car;


public class Java001 {

	public static void main(String[] args) {
		Car car=new Car();
	    car.color="����";
	    car.company="����";
	    car.maxSpeed=200;
	    car.model="�ҳ�Ÿ";
	    car.tire.companey="��ȣ Ÿ�̾�";
	    car.tire.mileage=20;
	    car.tire.price=50000;
	    
	    Car newCar= new Car();
	    newCar.color=car.color;
	    newCar.company=car.company;
	    newCar.maxSpeed=car.maxSpeed;
	    newCar.model=car.model;
	    newCar.tire.companey=car.tire.companey;
	    newCar.tire.mileage=car.tire.mileage;
	    newCar.tire.price=car.tire.price;
	    
	    
	    
	}

}
