package cn.woodwhales.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.woodwhales.dto.demo1.CarDTO;
import cn.woodwhales.entity.demo1.Car;
import cn.woodwhales.entity.demo1.CarType;
import cn.woodwhales.mapping.demo1.CarMapping;

@RestController("/test")
public class CarController {
	
	@Autowired
	private CarMapping carMapping;

	@ResponseBody
	@GetMapping("/car")
	public Object car() {
		String make = "BMW";
		int numberOfSeats = 6;
		CarType carType = new CarType("simple");
		
		Date gmtCreated = new Date();
		Date gmtModified = new Date();
		
		Car car = new Car(make, numberOfSeats, carType, gmtCreated, gmtModified);
		
		CarDTO carDTO = carMapping.carToCarDTO(car);
		
		return carDTO;
	}
}
