import java.util.Random;
public class SnakeLadder {
   
    public static void main(String args[]){


        
        //int player1, player2;
        int pos=0;
    
        Random r=new Random();



        int countDice = 0;
        while(pos!=100){
        int dice = r.nextInt(6) + 1;
        int opt = r.nextInt(3);
        countDice ++;
        
    
        
        switch(opt){
            case 0 :
          
                System.out.println("No play");
                break;
            
            case 1:
               
                    System.out.println("Snake");
                    pos = pos -dice;
                    if (pos<0){
                    pos=0;
                    }
                    break;
                
            case 2:
                
                    System.out.println("Ladder");
                    if(pos + dice <= 100){
                    pos = pos + dice;
                    }else{
                        System.out.println("Player remains on the same position");
                    }
                break;
                

                }
            
            System.out.println("Player current position:"+ pos);
        }
       

        System.out.println("Dice rolled " + countDice + " times");

    }
    }





       

                            
           