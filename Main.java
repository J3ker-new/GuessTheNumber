import java.util.Random;
import java.util.Scanner;

class game{
    //Initializing the Random and Scanner classes.
    Random newInt = new Random();
    Scanner sc = new Scanner(System.in);
    // Setting up computers choice, user input, and Proximity Logic
    int a = newInt.nextInt(101);
    int b;
    int lastDiff = 101;
    public void setInput(int n){
        if(n>100 || n<0){
            System.out.println("Please ensure that the input is between 0-100: ");
            int x = sc.nextInt();
            setInput(x);
        }b = n;
    }
    public void checkInput(){
        int diff = Math.abs(a-b);
        int checkProximity = diff - lastDiff;
        if(diff == 0){
            System.out.println("You are correct, Congratulations :)");
            System.exit(0); // terminates the program on winning.
        } else if (diff >= 90) {
            System.out.print("You are not even close, Try again: ");
        }else if (diff >= 80) {
            System.out.print("You are far off, Try again: ");
        }else if (diff >= 70) {
            System.out.print("You are far, Try again: ");
        }else if (diff >= 60) {
            System.out.print("You are not close, Try again: ");
        }else if (diff >= 50) {
            System.out.print("You are almost close, Try again: ");
        }else if (diff >= 40) {
            System.out.print("You are a bit close, Try again: ");
        }else if (diff >= 30) {
            System.out.print("You are getting close, Try again: ");
        }else if (diff >= 20) {
            System.out.print("You are close, Try again: ");
        }else if (diff >= 10) {
            System.out.print("You are very close!, Try again: ");
        }else if (diff >= 5) {
            System.out.print("You are almost there!, Try again: ");
        } else{
            System.out.print("You are SUPER close!!, Try again: ");
        }
        if(diff > lastDiff){
            System.out.printf("\nYou are going in the wrong direction: ");
        }
        //Using recursion until the user wins!
        lastDiff = diff;
        b = sc.nextInt();
        checkInput();
    }
}
public class Main{
    public static void main(String[] args) {
        //Initiating the game via user input.
        game test = new game();
        Scanner sct = new Scanner(System.in);
        System.out.println("Enter your Guess: ");
        int y = sct.nextInt();
        test.setInput(y);
        test.checkInput();
    }
}