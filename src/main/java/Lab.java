import java.util.Scanner;

public class Lab {
    public static String personCheck(String name){
        if(name.equals("Alice") || name.equals("Bob")){
            return ("Hello, " + name);
        }else{
            return ("Hello");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("Please type your name.");
        name = in.next();
        //System.out.println(personCheck(name));
        while(!(name.equals("Alice")) && !(name.equals("Bob"))){
            System.out.println("What is your name?");
            name = in.next();
        }
        System.out.println("Hello, " + name);
    }
}
