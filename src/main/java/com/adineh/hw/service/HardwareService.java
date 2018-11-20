package com.adineh.hw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.adineh.hw.dao.HardwareRepository;
import com.adineh.hw.dao.UserRepository;
import com.adineh.hw.model.Hardware;
import com.adineh.hw.model.User;

@Service
public class HardwareService{
	
	@Autowired
	private HardwareRepository hwRepository;

	public List<Hardware> retriveHWList(){
		List<Hardware> hardwares = (List<Hardware>) hwRepository.findAll();
		return hardwares;
	}

	public void addNewHardware(Hardware hardware) {
		Hardware result = hwRepository.save(hardware);
	}

	public Hardware retriveHW(Long id) {

		return hwRepository.findById(id).get();
	}

}
