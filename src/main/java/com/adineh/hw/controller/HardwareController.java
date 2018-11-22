package com.adineh.hw.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adineh.hw.model.Department;
import com.adineh.hw.model.HWType;
import com.adineh.hw.model.Hardware;
import com.adineh.hw.model.Hardware_usage;
import com.adineh.hw.service.HardwareService;
import com.adineh.hw.service.HardwareUsageService;

@Controller
public class HardwareController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy/MM/dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormater, false));
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,stringTrimmerEditor);
	}
	
	@Autowired
	private HardwareService hwService;
	
	@Autowired
	private HardwareUsageService hwUsageService;
	
	@ModelAttribute("hwtype")
	public HWType[] populateHWType() {
		return HWType.values();
	}
	
	@ModelAttribute("departments")
	public Department[] populateDepartment() {
		return Department.values();
	}
	
	Logger log = LoggerFactory.getLogger(HardwareController.class);
	
	@GetMapping("/hwList")
	public String showHWList(Model model) {
		List<Hardware> hardwares = hwService.retriveHWList();
		model.addAttribute("hardwares",hardwares);
		return "hwList";
	}
	
	@GetMapping("/hwUsageList")
	public String showHWUsageList(Model model) {
		List<Hardware_usage> hardwares_usage = hwUsageService.retriveHWList();
		model.addAttribute("hardwares_usage",hardwares_usage);
		return "hwUsageList";
	}
	
	@GetMapping("/addHW")
	public String showAddHWPage(Model model) {
		model.addAttribute("hardware",new Hardware());
		return "addHWPage";
	}
	
	@PostMapping("/addHW")
	public String addHWCommitedPage(Model model,@Valid @ModelAttribute("hardware") Hardware hardware,BindingResult result) {
		log.info("Add Hardware Log :"+result);
		if(result.hasErrors())
			return "addHWPage";
		
		hwService.addNewHardware(hardware);
		return "redirect:/hwList";
	}
	
	@GetMapping("/useHW")
	public String useHWPage(Model model,@RequestParam Long id) {
		model.addAttribute("hardware", hwService.retriveHW(id));
		Hardware_usage  hardware_usage = new Hardware_usage();
		hardware_usage.setHardware_id(id);
		hardware_usage.setUsage_date(new Date());
		model.addAttribute("hardware_usage",hardware_usage);
		return "useHWPage";
	}
	
	@PostMapping("/useHW")
	public String useHWPageCommit(Model model,@Valid @ModelAttribute("hardware_usage") Hardware_usage hardware_usage,BindingResult result) {
		log.info("Add Hardware_usage Log :"+result);
		if(result.hasErrors()) {
			return "useHWPage";
		}
		Hardware hardware = hwService.retriveHW(hardware_usage.getHardware_id());
		hardware.setNumbers(hardware.getNumbers() - hardware_usage.getNumbers());
		hwService.addNewHardware(hardware);
		hwUsageService.addNewHardware(hardware_usage);
		return "redirect:/hwList";
	}
	
}
