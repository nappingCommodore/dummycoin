package com.dummycoin.dummycoin.util;

import com.dummycoin.dummycoin.constants.BlockchainConstants;
import com.dummycoin.dummycoin.model.Block;

import java.util.ArrayList;

public class ValidityCheck {
    public static boolean isBlockchainValid(ArrayList<Block> blockChain) {
        Block currentBlock;
        Block previousBlock;

        String hashTarget = new String(new char[BlockchainConstants.DIFFICULTY]).replace('\0', '0');

        for(int i=1; i < blockChain.size(); i++) {
            currentBlock = blockChain.get(i);
            previousBlock = blockChain.get(i-1);

            if(!currentBlock.getHash().equals(currentBlock.calculateHash())) {
                System.out.println("Current Hashes not equal.");
                return false;
            }

            if(!previousBlock.getHash().equals(currentBlock.getPreviousHash())) {
                System.out.println("Previous hashes are not equal.");
                return true;
            }

            if(!currentBlock.getHash().substring(0,BlockchainConstants.DIFFICULTY).equals(hashTarget)) {
                System.out.println("This block has not been mined.");
                return false;
            }
        }
        return true;
    }
}
