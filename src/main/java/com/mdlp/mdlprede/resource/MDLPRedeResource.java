package com.mdlp.mdlprede.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdlp.mdlprede.service.MDLPRedeService;

@RestController
public class MDLPRedeResource {

	MDLPRedeService mdlpRedeService;
	
	@Autowired
	public MDLPRedeResource(MDLPRedeService mplRedeService) {
		this.mdlpRedeService = mdlpRedeService;
	}
	
	@GetMapping("/countsendedstats")
	public int countSendedStats() {
		return mdlpRedeService.countSendedStats();
	}
	
}
