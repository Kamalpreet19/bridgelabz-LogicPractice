import java.util.Random;
public class SnakeLadder {
   
    public static void main(String args[]){

        int player1, player2;
        int pos=0;
    
        Random r=new Random();
        while(pos!=100){
        int dice = r.nextInt(6) + 1;
        
         
        pos=pos+dice;
        System.out.println(pos);


        Random ran = new Random();
        int opt = ran.nextInt(3);
        switch(opt){
            case 1 :
            if(opt==0){
                System.out.println("No play");
                break;
            }
            case 2:
                if(opt==1){
                    System.out.println("Snake");
                    pos = pos -dice;
                    break;
                }

            case 3:
                if(opt==2){
                    System.out.println("Ladder");
                    if(pos + dice <= 100){
                    pos = pos + dice;
                    }
                break;
                }

            if (pos<0){
                pos=0;
            }
            System.out.println("Player current position:"+ pos);
        }
       

    }
    }
}
