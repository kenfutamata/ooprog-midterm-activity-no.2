import java.util.*;
public class SugarSmashPlayer {
    Scanner input = new Scanner(System.in);
    private static int max1;
    private static int max2;
    private static int max3;
    private static int max4;
    private static int max5;
    private static int max6;
    private static int max7;
    private static int max8;
    private static int max9;
    private static int max10;
    private int idnum;
    private String name;
    private int arr[] = new int[10];
    private int level;
    public SugarSmashPlayer(){
        int idnum;
        String name = " ";
        int level;
    }
    public SugarSmashPlayer(int idnum, String name, int level){
        this.idnum = idnum;
        this.name = name;
        this.level = level;
    }

    public void setIdnum(int idnum){
        this.idnum = idnum;
    }
    public int getIdnum(){
        return idnum;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setScore(int arr[], int level){
        this.arr = arr;
        this.level = level;
    }
    public int getLevel(){
        return level;
    }

    public int[] getArr(){
        return arr;
    }
    public int getMax1(){
        return max1;
    }
    public int getMax2(){

        return max2;
    }
    public int getMax3(){

        return max3;
    }
    public int getMax4(){

        return max4;
    }
    public int getMax5(){

        return max5;
    }
    public int getMax6(){

        return max6;
    }
    public int getMax7(){

        return max7;
    }
    public int getMax8(){

        return max8;
    }
    public int getMax9(){

        return max9;
    }
    public int getMax10(){
        return max10;
    }
    public void level(){
        if(getLevel() == 1){
            level1();
        }
        else if(getLevel() == 2){
            level2();
        }
        else if(getLevel() == 3){
            level3();
        }
        else if(getLevel() == 4){
            level4();
        }
        else if(getLevel() == 5){
            level5();
        }
        else if(getLevel() == 6){
            level6();
        }
        else if(getLevel() == 7){
            level7();
        }
        else if(getLevel() == 8){
            level8();
        }
        else if(getLevel() == 9){
            level9();
        }
        else if(getLevel() == 10){
            level10();
        }
        else if (getLevel() == 11) {
            displayScore();
        }
        if (max1 >= 100 && max2 >= 100 && max3 >= 100 && max4 >= 100 && max5 >= 100 && max6 >= 100 && max7 >= 100 && max8 >= 100 && max9 >=100 && max10 >=100) {
            PremiumSugarSmashPlayer j1 = new PremiumSugarSmashPlayer();
            j1.premium();
        }
    }

    public int level1(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max1 < arr[i]){
                max1 = arr[i];
            }
        }
        System.out.print("Highest score is "+max1);
        System.out.println();
        if(max1 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level1();
        }
        return max1;
    }

    public int level2(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max2 < arr[i]){
                max2 = arr[i];
            }
        }
        System.out.println("Highest score is "+max2);
        System.out.println();
        if(max2 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level2();
        }
        return max2;
    }

    public int level3(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max3 < arr[i]){
                max3 = arr[i];
            }
        }
        System.out.println("Highest score is "+max3);
        System.out.println();
        if(max3 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level3();
        }
        return max3;
    }

    public int level4(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max4 < arr[i]){
                max4 = arr[i];
            }
        }
        System.out.print("Highest score is "+max4);
        System.out.println();
        if(max4 >= 100){
            System.out.println("Good, you may proceed to the next level!");

        }else{
            System.out.println("Please repeat the said level again");
            level4();
        }
        return max4;
    }

    public int level5(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max5 < arr[i]){
                max5 = arr[i];
            }
        }
        System.out.println("Highest score is "+max5);
        if(max5 >= 100){
            System.out.println("Good, you may proceed to the next level!");
            System.out.println();
        }else{
            System.out.println("Please repeat the said level again");
            level5();
        }
        return max5;
    }
    public int level6(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max6 < arr[i]){
                max6 = arr[i];
            }
        }
        System.out.println("Highest score is "+max6);
        if(max6 >= 100){
            System.out.println("Good, you may proceed to the next level!");
            System.out.println();
        }else{
            System.out.println("Please repeat the said level again");
            level6();
        }
        return max6;
    }

    public int level7(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max7 < arr[i]){
                max7 = arr[i];
            }
        }
        System.out.println("Highest score is "+max7);
        if(max7 >= 100){
            System.out.println("Good, you may proceed to the next level!");
            System.out.println();
        }else{
            System.out.println("Please repeat the said level again");
            level7();
        }
        return max7;
    }

    public int level8(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max8 < arr[i]){
                max8 = arr[i];
            }
        }
        System.out.println("Highest score is "+max8);
        if(max8 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level8();
        }
        return max8;
    }

    public int level9(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max9 < arr[i]){
                max9 = arr[i];
            }
        }
        System.out.println("Highest score is "+max9);
        if(max9 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level9();
        }
        return max9;
    }

    public int level10(){

        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max10 < arr[i]){
                max10 = arr[i];
            }
        }
        System.out.println("Highest score is "+max10);
        if(max10 >=100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level10();
        }
        return max10;
    }

    public void displayScore(){
    System.out.println("Level 1 score is: "+getMax1());
    System.out.println("Level 2 score is: "+getMax2());
    System.out.println("Level 3 score is: "+getMax3());
    System.out.println("Level 4 score is: "+getMax4());
    System.out.println("Level 5 score is: "+getMax5());
    System.out.println("Level 6 score is: "+getMax6());
    System.out.println("Level 7 score is: "+getMax7());
    System.out.println("Level 8 score is: "+getMax8());
    System.out.println("Level 9 score is: "+getMax9());
    System.out.println("Level 10 score is: "+getMax10());
    }

}
