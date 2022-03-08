import java.util.Random;
import java.util.Scanner;
public class CWH_Exercise2_Rck_Prp_Scr{
    public static void main(String[] args){
        Random Num1 = new Random();
        Scanner Num2 = new Scanner(System.in);
        int i,countSys=0,countUsr=0;
        for(i=0;i<3;i++){

            System.out.println("\n\t::: NOTE :::");
            System.out.println("\n 1)ROCK");
            System.out.println("\n 2)PAPER");
            System.out.println("\n 3)SCISSOR");
        
            System.out.println("\n\t:::Enter Your Number:::");
            int usr = Num2.nextInt();

            if(usr==1){
                System.out.println("YOU: Rock");
            }
            else if (usr==2){
                System.out.println("YOU: Paper");
            }
            else if(usr==3){
                System.out.println("YOU: Scissor");
            }

            int a = Num1.nextInt(3);
            a++;
            //System.out.println(a);
            if(a==1){
                System.out.println("COMPUTER: Rock");
            }
            else if (a==2){
                System.out.println("COMPUTER: Paper");
            }
            else if(a==3){
                System.out.println("COMPUTER: Scissor");
            }
        
        
            if(a==usr) {
                System.out.println("O! Oooo! The Game is Tie");
            }
            else if(a==3 && usr==1) {
                System.out.println("Congrats! You Win");
                countUsr++;
            }
            else if(a==2 && usr==3){
                System.out.println("Congrats! You Win");
                countUsr++;
            }
            else if(a==1 && usr==2){
                System.out.println("Congrats! You Win");  
                countUsr++;
            }
            else if(usr>3){
                System.out.println("Oh! No! Wrong Entry");
            }
            else {
                System.out.println("Sorry! You Lose");
                countSys++;
            }
        
        }
        if(countSys<countUsr){
            System.out.println("\n\t:::Congratulations! Out Three You Win:::\n");
        }
        else{
            System.out.println("\n\t:::Sorry! Out of Three You Loss:::\n");
        }
        
    } 
}
