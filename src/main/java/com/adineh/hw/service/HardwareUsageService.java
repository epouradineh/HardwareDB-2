package com.adineh.hw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.adineh.hw.dao.HardwareRepository;
import com.adineh.hw.dao.HardwareUsageRepository;
import com.adineh.hw.dao.UserRepository;
import com.adineh.hw.model.Hardware;
import com.adineh.hw.model.Hardware_usage;
import com.adineh.hw.model.User;

@Service
public class HardwareUsageService{
	
	@Autowired
	private HardwareUsageRepository hwUsageRepository;

	public List<Hardware_usage> retriveHWList(){
		List<Hardware_usage> hardwares_usage = (List<Hardware_usage>) hwUsageRepository.findAll();
		return hardwares_usage;
	}

	public void addNewHardware(Hardware_usage hardware) {
		Hardware_usage result = hwUsageRepository.save(hardware);
	}

	public Hardware_usage retriveHW(Long id) {

		return hwUsageRepository.findById(id).get();
	}

}
