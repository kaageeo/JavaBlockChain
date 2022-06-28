import java.util.ArrayList;
import java.util.List;

public class BlockchainDemo {
    public static ArrayList blockchain = new ArrayList();
    public static void main(String args[]) {
        blockchain.add(new Block(("10"), "0"));
        blockchain.add(new Block(("20"), blockchain.get(blockchain.size()-1.hash)));
        blockchain.add(new Block(("30"), blockchain.get(blockchain.size()-1.hash());
    } 
}
