package com.mdlp.mdlprede.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdlp.mdlprede.service.MDLPRedeService;

@RestController
public class MDLPRedeResource {

	@Autowired
	public MDLPRedeService mdlpRedeService;
	 
	 @GetMapping("/count_sended_stats") 
	 public int countSendedStatsYb() { 
		 return mdlpRedeService.countSendedStats() / 8; 
	 }

}
