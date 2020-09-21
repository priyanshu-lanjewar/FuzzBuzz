public class FizzBuzz
{
    public static boolean isDivisibleBy3(int no){
        if(no%3==0) return true;
        else return false;
    }

    public static boolean isDivisibleBy5(int no){
        if(no%5==0) return true;
        else return false;
    }

    public static void main(String[] args) {

        for(int i =1;i<=100;i++){
            if(isDivisibleBy3(i))
                System.out.print("Fizz");
            if(isDivisibleBy5(i))
                System.out.print("Buzz");
            System.out.println("\n"+i);
        }
    }
}
