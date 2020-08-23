package com.dummycoin.dummycoin;

import com.dummycoin.dummycoin.model.Block;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

// @SpringBootApplication
public class DummycoinApplication {

	public static ArrayList<Block> blockChain = new ArrayList<>();

	public static void main(String[] args) {
		blockChain.add(new Block("genesis block", "0"));
		blockChain.add(new Block("block one", blockChain.get(blockChain.size()-1).getHash()));
		blockChain.add(new Block("block two", blockChain.get(blockChain.size()-1).getHash()));

		String blockChainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
		System.out.println(blockChainJson);
		// SpringApplication.run(DummycoinApplication.class, args);
	}

}
