import java.util.Date;

public class Block {
    private String data;
    public String hash;
    public String previousHash;
    private long timeStamp;
    private int answer;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = Hash();
    }

    public String Hash() {
        String hash = Sha256Algorithm.sha256( previousHash + data + Long.toString(timeStamp) + Integer.toString(answer));
        return hash;
    }

    public void mineBlock(int difficulty) {
        String targetedHash = new String(new char[difficulty]).replace('\0', '0');
        while (!hash.substring(0, difficulty).equals(targetedHash)) {
            answer ++;
            hash = Hash();
        }
        System.out.println("mining success...!!" + hash);
    }
}
