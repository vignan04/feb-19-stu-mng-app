
package com.stpeters.stu.marks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stpeters.stu.marks.entity.Car;
import com.stpeters.stu.marks.repo.CarRepo;

@Service
public class CarService {

	@Autowired
	CarRepo carRepo;

	public String saveNewCar(Car car) {
		String res = "";
		try {
			carRepo.save(car);

			res = "successfully added new car.." + car.getModel() + " into DB";

		} catch (Exception e) {
			res = "not able to insert new Car..." + car.getModel();
		}
		return res;
	}

	public List<Car> fetchAllCars() {
		
		return carRepo.findAll();
	}

}
