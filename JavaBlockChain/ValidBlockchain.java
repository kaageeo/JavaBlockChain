public static Boolean ValidBlockchain() {
    
    Block currentBlock;
    Block previousBlock;

    for (int i = 1; i < blockchain.size(); i++) {
        currentBlock = blockchain.get(i);
        previousBlock = blockchain.get(i-1);
        if (!currentBlock.hash.equals(currentBlock.Hash())) {
            return false;
        }
        if (!previousBlock.hash.equals(currentBlock.previousHash)) {
            return false;
        }
        if (!currentBlock.hash.substring(0, difficulty).equals(targetedHas)) {
            return false;
        } 
    }
    return true;
}

