public class Simulation {

   private int numberOfDice;
   private int numberOfTosses;
   Dice dice1;
   Bins bin1;

   public Simulation(Integer numberOfDice, Integer numberOfTosses){
       this.numberOfDice = numberOfDice;
       this.numberOfTosses = numberOfTosses;
       this.dice1 = new Dice(numberOfTosses);
       this.bin1 = new Bins(numberOfDice);


   }

   public void runSim (){
       Integer runSimArch = 0;
       Simulation diceRolls = new Simulation(numberOfDice, numberOfTosses);

       for (int i = 1; i <numberOfTosses; i++) {
           Integer randomTossResult = dice1.toss();
           for (int j = 0; j < bin1.rollCount.size(); j++){
               if(j + numberOfDice == randomTossResult){
                   bin1.rollCount.set(j, bin1.rollCount.get(j)+1);
               }

           }
       }

   }






}
