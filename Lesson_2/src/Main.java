import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int your_age;
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you or when were you born?");

        if (sc.hasNextInt()) {
            int age = sc.nextInt();

                    if (age<1900 && age>100){
                        System.out.println("People don't live as long");
                    }
                    else if (age<100){
                    System.out.println("You are so young,you are only " + age);
                    }
                    else if (age>1900){
                        your_age = 2022 - age;
                        System.out.println("You are so old,you are " + your_age);
                    }

        }
        else  {
            System.out.println("Who are you trying to fool?");
        }
    }
}