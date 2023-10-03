import java.util.*;
public class DemoSugarSmash{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idnum, level;
        String name;
        System.out.print("Enter ID number: ");
        idnum = input.nextInt();

        System.out.print("Enter your name: ");
         name = input.next();
        while(true){
            System.out.println("ID NUMBER: "+idnum);
            System.out.println("Name: "+name);
            System.out.println("1. LEVEL 1");
            System.out.println("2. LEVEL 2");
            System.out.println("3. LEVEL 3");
            System.out.println("4. LEVEL 4");
            System.out.println("5. LEVEL 5");
            System.out.println("6. LEVEL 6");
            System.out.println("7. LEVEL 7");
            System.out.println("8. LEVEL 8");
            System.out.println("9. LEVEL 9");
            System.out.println("10. LEVEL 10");
            System.out.println("11. DISPLAY SCORE");
            System.out.print("Enter a level: ");
            level = input.nextInt();
            SugarSmashPlayer j1 = new SugarSmashPlayer(idnum, name, level);
            j1.level();

        }



    }
}
