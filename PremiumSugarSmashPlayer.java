import java.util.*;
public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    Scanner input = new Scanner(System.in);
    String premium;
    int arr[] = new int[10];
    private static int max11;
    private static int max12;
    private static int max13;
    private static int max14;
    private static int max15;
    private static int max16;
    private static int max17;
    private static int max18;
    private static int max19;
    private static int max20;
    private static int max21;
    private static int max22;
    private static int max23;
    private static int max24;
    private static int max25;
    private static int max26;
    private static int max27;
    private static int max28;
    private static int max29;
    private static int max30;
    private static int max31;
    private static int max32;
    private static int max33;
    private static int max34;
    private static int max35;
    private static int max36;
    private static int max37;
    private static int max38;
    private static int max39;
    private  static int max40;
    public PremiumSugarSmashPlayer() {
        super();
        String premium = " ";
    }

    public PremiumSugarSmashPlayer(int idnum, String name, int level, String premium) {
        super(idnum, name, level);
        this.premium = premium;
    }

    public void setPremium(String premium) {

        this.premium = premium;
    }

    public String getPremium() {
        return premium;
    }

    public void premium() {
        System.out.print("Do you want to buy premium account or no: ");
        premium = input.next();

        if (premium.equals("yes") || premium.equals("YES")) {
            System.out.print("Please pay the amount of $2.99: ");
            double pay = input.nextDouble();
            double price = 2.99;
            double change = pay - 2.99;
            System.out.println("Your change is " + change);
            System.out.println("You have access to the premium account! You have unlocked 40 levels");
            menulevel();
        } else if (premium.equals("no") || premium.equals("NO")) {
            System.out.println("Your id number will remain under free account: ");
            System.exit(0);
        }
    }

    public void menulevel() {
        while (true) {

            System.out.println("11. LEVEL 11");
            System.out.println("12. LEVEL 12");
            System.out.println("13. LEVEL 13");
            System.out.println("14. LEVEL 14");
            System.out.println("15. LEVEL 15");
            System.out.println("16. LEVEL 16");
            System.out.println("17. LEVEL 17");
            System.out.println("18. LEVEL 18");
            System.out.println("19. LEVEL 19");
            System.out.println("20. LEVEL 20");
            System.out.println("21. LEVEL 21");
            System.out.println("22. LEVEL 22");
            System.out.println("23. LEVEL 23");
            System.out.println("24. LEVEL 24");
            System.out.println("25. LEVEL 25");
            System.out.println("26. LEVEL 26");
            System.out.println("27. LEVEL 27");
            System.out.println("28. LEVEL 28");
            System.out.println("29. LEVEL 29");
            System.out.println("30. LEVEL 30");
            System.out.println("31. LEVEL 31");
            System.out.println("32. LEVEL 32");
            System.out.println("33. LEVEL 33");
            System.out.println("34. LEVEL 34");
            System.out.println("35. LEVEL 35");
            System.out.println("36. LEVEL 36");
            System.out.println("37. LEVEL 37");
            System.out.println("38. LEVEL 38");
            System.out.println("39. LEVEL 39");
            System.out.println("40. LEVEL 40");
            System.out.println("41. DISPLAY SCORE");
            System.out.print("Enter a level: ");
            int level = input.nextInt();
            levelpremium(level);
        }
    }
    public void levelpremium(int level){
        if(level == 11){
            level11();
        }
       else if(level == 12){
            level12();
        }
        else if(level == 13){
            level13();
        }

        else  if(level == 14){
            level14();
        }

        else if(level == 15){
            level15();
        }

        else if(level == 16){
            level16();
        }

        else if(level == 17){
            level17();
        }

        else if(level == 18){
            level18();
        }

        else if(level == 19){
            level19();
        }

        else if(level == 20){
            level20();
        }

        else if(level == 21){
            level21();
        }

        else if(level == 22){
            level22();
        }

        else if(level == 23){
            level23();
        }

        else if(level == 24){
            level24();
        }

        else if(level == 25){
            level25();
        }

        else if(level == 26){
            level26();
        }

        else if(level == 27){
            level27();
        }

        else if(level == 28){
            level28();
        }

        else if(level == 29){
            level29();
        }

        else  if(level == 30){
            level30();
        }

        else if(level == 31){
            level31();
        }

        else if(level == 32){
            level32();
        }

        else if(level == 33){
            level33();
        }

        else if(level == 34){
            level34();
        }

        else if(level == 35){
            level35();
        }

        else if(level == 36){
            level36();
        }

        else if(level == 37){
            level37();
        }

        else if(level == 38){
            level38();
        }

        else if(level == 39){
            level39();
        }

        else if(level == 40){
            level40();
        }

        else if(level == 41){
            displayscorepremium();
        }
        if(max11 >=100 && max12 >=100 && max13 >=100 && max14 >=100
                && max15 >=100 && max16 >=100 && max17 >=100 &&
                max18 >=100 && max19 >=100 && max20 >=100 &&
                max21 >=100 && max22 >=100 && max23 >=100 &&
                max24 >=100 && max25 >=100 && max26 >=100 &&
                max27 >=100 && max28 >=100 && max29 >=100 &&
                max30 >=100 && max31 >=100 && max32 >=100 &&
                max33 >=100 && max34 >=100 && max35 >=100 &&
                max36 >=100 && max37 >=100 && max38 >=100 &&
                max39 >=100 && max40 >=100){
            System.out.print("Congratulations, you have sucessfully finished and won the game!");
            System.exit(0);
        }
    }
    public int level11(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max11 < arr[i]){
                max11 = arr[i];
            }
        }
        System.out.println("Highest score is "+max11);
        System.out.println();
        if(max11 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level11();
        }
        return max11;
    }

    public int level12(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max12 < arr[i]){
                max12 = arr[i];
            }
        }
        System.out.println("Highest score is "+max12);
        System.out.println();
        if(max12 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level12();
        }
        return max12;
    }

    public int level13(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max13 < arr[i]){
                max13 = arr[i];
            }
        }
        System.out.println("Highest score is "+max13);
        System.out.println();
        if(max13 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level13();
        }
        return max13;
    }

    public int level14(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max14 < arr[i]){
                max14 = arr[i];
            }
        }
        System.out.println("Highest score is "+max14);
        System.out.println();
        if(max14 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level14();
        }
        return max14;
    }

    public int level15(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max15 < arr[i]){
                max15 = arr[i];
            }
        }
        System.out.println("Highest score is "+max15);
        System.out.println();
        if(max15 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level15();
        }
        return max15;
    }

    public int level16(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max16 < arr[i]){
                max16 = arr[i];
            }
        }
        System.out.println("Highest score is "+max16);
        System.out.println();
        if(max16 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level16();
        }
        return max12;
    }

    public int level17(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max17 < arr[i]){
                max17 = arr[i];
            }
        }
        System.out.println("Highest score is "+max17);
        System.out.println();
        if(max17 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level17();
        }
        return max17;
    }

    public int level18(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max18 < arr[i]){
                max18 = arr[i];
            }
        }
        System.out.println("Highest score is "+max18);
        System.out.println();
        if(max18 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level18();
        }
        return max18;
    }

    public int level19(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max19 < arr[i]){
                max19 = arr[i];
            }
        }
        System.out.println("Highest score is "+max19);
        System.out.println();
        if(max19 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level19();
        }
        return max19;
    }


    public int level20(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max20 < arr[i]){
                max20 = arr[i];
            }
        }
        System.out.println("Highest score is "+max20);
        System.out.println();
        if(max20 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level20();
        }
        return max20;
    }

    public int level21(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max21 < arr[i]){
                max21 = arr[i];
            }
        }
        System.out.println("Highest score is "+max21);
        System.out.println();
        if(max21 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level21();
        }
        return max21;
    }


    public int level22(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max22 < arr[i]){
                max22 = arr[i];
            }
        }
        System.out.println("Highest score is "+max22);
        System.out.println();
        if(max22 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level22();
        }
        return max22;
    }


    public int level23(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max23 < arr[i]){
                max23 = arr[i];
            }
        }
        System.out.println("Highest score is "+max23);
        System.out.println();
        if(max23 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level23();
        }
        return max23;
    }


    public int level24(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max24 < arr[i]){
                max24 = arr[i];
            }
        }
        System.out.println("Highest score is "+max24);
        System.out.println();
        if(max24>= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level24();
        }
        return max24;
    }


    public int level25(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max25 < arr[i]){
                max25 = arr[i];
            }
        }
        System.out.println("Highest score is "+max25);
        System.out.println();
        if(max25 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level25();
        }
        return max25;
    }


    public int level26(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max26 < arr[i]){
                max26 = arr[i];
            }
        }
        System.out.println("Highest score is "+max26);
        System.out.println();
        if(max26 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level26();
        }
        return max26;
    }


    public int level27(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max27 < arr[i]){
                max27 = arr[i];
            }
        }
        System.out.println("Highest score is "+max27);
        System.out.println();
        if(max27 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level27();
        }
        return max27;
    }


    public int level28(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max28 < arr[i]){
                max28 = arr[i];
            }
        }
        System.out.println("Highest score is "+max28);
        System.out.println();
        if(max28 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level28();
        }
        return max28;
    }


    public int level29(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max29 < arr[i]){
                max29 = arr[i];
            }
        }
        System.out.println("Highest score is "+max29);
        System.out.println();
        if(max29 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level29();
        }
        return max29;
    }


    public int level30(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max30 < arr[i]){
                max30= arr[i];
            }
        }
        System.out.println("Highest score is "+max30);
        System.out.println();
        if(max30 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level30();
        }
        return max30;
    }

    public int level31(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max12 < arr[i]){
                max12 = arr[i];
            }
        }
        System.out.println("Highest score is "+max31);
        System.out.println();
        if(max31 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level31();
        }
        return max31;
    }


    public int level32(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max32 < arr[i]){
                max32 = arr[i];
            }
        }
        System.out.println("Highest score is "+max32);
        System.out.println();
        if(max32 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level32();
        }
        return max32;
    }

    public int level33(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max33 < arr[i]){
                max33 = arr[i];
            }
        }
        System.out.println("Highest score is "+max33);
        System.out.println();
        if(max33 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level33();
        }
        return max33;
    }


    public int level34(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max34 < arr[i]){
                max34 = arr[i];
            }
        }
        System.out.println("Highest score is "+max34);
        System.out.println();
        if(max34 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level34();
        }
        return max34;
    }


    public int level35(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max35 < arr[i]){
                max35 = arr[i];
            }
        }
        System.out.println("Highest score is "+max35);
        System.out.println();
        if(max35 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level35();
        }
        return max35;
    }

    public int level36(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max36 < arr[i]){
                max36 = arr[i];
            }
        }
        System.out.println("Highest score is "+max36);
        System.out.println();
        if(max36 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level36();
        }
        return max36;
    }

    public int level37(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max37 < arr[i]){
                max37 = arr[i];
            }
        }
        System.out.println("Highest score is "+max37);
        System.out.println();
        if(max37 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level37();
        }
        return max37;
    }

    public int level38(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max38 < arr[i]){
                max38 = arr[i];
            }
        }
        System.out.println("Highest score is "+max38);
        System.out.println();
        if(max38 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level38();
        }
        return max38;
    }

    public int level39(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max39 < arr[i]){
                max39 = arr[i];
            }
        }
        System.out.println("Highest score is "+max39);
        System.out.println();
        if(max39 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level39();
        }
        return max39;
    }

    public int level40(){
        System.out.print("Enter 10 highest numbers: ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
            if(max40 < arr[i]){
                max40 = arr[i];
            }
        }
        System.out.println("Highest score is "+max40);
        System.out.println();
        if(max40 >= 100){
            System.out.println("Good, you may proceed to the next level!");
        }else{
            System.out.println("Please repeat the said level again");
            level40();
        }
        return max40;
    }

    public void displayscorepremium(){
        SugarSmashPlayer j1 = new SugarSmashPlayer();
        j1.displayScore();
        System.out.println("Level 11 score is: "+max11);
        System.out.println("Level 12 score is: "+max12);
        System.out.println("Level 13 score is: "+max13);
        System.out.println("Level 14 score is: "+max14);
        System.out.println("Level 15 score is: "+max15);
        System.out.println("Level 16 score is: "+max16);
        System.out.println("Level 17 score is: "+max17);
        System.out.println("Level 18 score is: "+max18);
        System.out.println("Level 19 score is: "+max19);
        System.out.println("Level 20 score is: "+max20);
        System.out.println("Level 21 score is: "+max21);
        System.out.println("Level 22 score is: "+max22);
        System.out.println("Level 23 score is: "+max23);
        System.out.println("Level 24 score is: "+max24);
        System.out.println("Level 25 score is: "+max25);
        System.out.println("Level 26 score is: "+max26);
        System.out.println("Level 27 score is: "+max27);
        System.out.println("Level 28 score is: "+max28);
        System.out.println("Level 29 score is: "+max29);
        System.out.println("Level 30 score is: "+max30);
        System.out.println("Level 31 score is: "+max31);
        System.out.println("Level 32 score is: "+max32);
        System.out.println("Level 33 score is: "+max33);
        System.out.println("Level 34 score is: "+max34);
        System.out.println("Level 35 score is: "+max35);
        System.out.println("Level 36 score is: "+max36);
        System.out.println("Level 37 score is: "+max37);
        System.out.println("Level 38 score is: "+max38);
        System.out.println("Level 39 score is: "+max39);
        System.out.println("Level 40 score is: "+max40);
    }
}