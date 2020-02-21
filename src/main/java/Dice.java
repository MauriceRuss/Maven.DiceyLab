import java.util.Random;

public class Dice {
    private int dice1;
    private int dice2;
    private Random rgen;
    private int numberOfTosses;


    public Dice(int numberOfTosses){
        this.numberOfTosses = numberOfTosses;
        rgen = new Random();

    }
    public Integer toss(){
        int c =0;
        for (int i = 0; i < numberOfTosses; i++) {
            c += (rgen.nextInt(6) + 1);
        }
        return c;
    }
    public Dice(int numberOfTosses, long seed){
        this.numberOfTosses = numberOfTosses;
        rgen = new Random(seed);

    }
    public void setSeed(){
        this.rgen.setSeed(15);
    }
}