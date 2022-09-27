package com.mdlp.mdlprede.service;

import org.springframework.stereotype.Service;

import grpc.MDLPCtrlGrpc;
import grpc.MDLPCtrlGrpc.MDLPCtrlBlockingStub;
import grpc.Stats;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class MDLPRedeService {

	@GrpcClient("mdlp-rede")
	private MDLPCtrlGrpc.MDLPCtrlBlockingStub mdlpCtrlBlockingStub;
	
	public int countSendedStats() {

//		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
//				.usePlaintext()
//				.build();
		
//		MDLPCtrlGrpc.MDLPCtrlBlockingStub stub = MDLPCtrlGrpc.newBlockingStub(channel);
		
//		Stats request = Stats.newBuilder()
//				.build();
		
//		int statsSendedStats = stub.sendedStats(null)
//				.getCount();
		
//		Stats stats = stub.sendedStats(Stats.newBuilder())
//				.build;
		
		return mdlpCtrlBlockingStub.sendedStats(null).getCount();
	}
}
