package com.metrotraining.pontaj.controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.metrotraining.pontaj.persistence.PontajRepository;
import com.metrotraining.pontaj.pojos.Pontaj;
import com.metrotraining.pontaj.pojos.PontajZiSapt;

@Controller
public class PontajController {

	

	@Autowired
	private PontajRepository pontajList;
	
	private PontajZiSapt zi;

	@RequestMapping(value = "/listPontaj", method = RequestMethod.GET)
	public String listPontaj(Model model) {
		
		model.addAttribute("mode", "listPontaj");		
		model.addAttribute("list", pontajList.findAll());
		System.out.println("listPontaj");
		return "listEditPontaj";
	}
	
	@RequestMapping(value = "/savePontaj", method = RequestMethod.GET)
	public String addPontaj(Model model) {
		
		model.addAttribute("mode", "addPontaj");		
		//pontajList.save(pontaj);
		System.out.println("addPontaj");
		return "listEditPontaj";
		
	}
	
		
	@RequestMapping(value = "/addPontaj", method = RequestMethod.GET)
	public String savePontaj(@RequestParam(value = "startDate") String startDate,
			@RequestParam(value = "endDate") String endDate, 
			@RequestParam(value = "zi") PontajZiSapt zi,
			@RequestParam(value = "pontajId", required = false) Long id, Model model) {

		DateFormat format = new SimpleDateFormat("dd-MM-yyyy:HH:mm:SS");
		//Date date = format.parse(string);
		System.out.println(startDate);
		System.out.println(endDate);
		
		try {
		pontajList.save(new Pontaj(format.parse(startDate), format.parse(endDate), zi));
		}
		catch (Exception e){
			System.out.println(e.toString());
			
		}
		model.addAttribute("mode", "listPontaj");
		
		model.addAttribute("list", pontajList.findAll());
					
		return "listEditPontaj";
	}

	

}
