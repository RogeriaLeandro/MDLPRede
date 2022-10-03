package com.mdlp.mdlprede.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import grpc.MDLPCtrlGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class MDLPRedeService{
	 
	@Value("${address}")
	private String address;
	
	@Value("${port}")
	private Integer port;
	
	 public int countSendedStats() {
		 
		ManagedChannel channel = ManagedChannelBuilder.forAddress(address, port)
				.usePlaintext()
				.build();
		
		MDLPCtrlGrpc.MDLPCtrlBlockingStub stub = MDLPCtrlGrpc.newBlockingStub(channel);
		
		int statsSendedStats = stub.sendedStats(null).getCount();
		
		channel.shutdown();
		
		return statsSendedStats;
	}

}
