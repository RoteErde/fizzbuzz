package exercise.fizzbuzz;


/**
 * FizzBuzz code that illustrates the fizzbuzz game that children play
 * iterates through number from 1 to the limit, 
 * if the numbers are divisible by 3, fizz and if it is divisible by 5 buzz is called.
 *
 * @author Alvin Ng
 * @version 1.0
 */
public class FizzBuzz
{
    // instance variables - replace the example below with your own
    private int x;
    private int counter;
    private boolean isFizz;

    /**
     * Constructor for objects of class FizzBuzz
     */
    public FizzBuzz()
    {
        // initialize instance variables
        x = 1;
        counter = 1;
    }
    
    /**
     * runs the actual fizzbuzz
     * @param integer limit - how far the count should go
     * @return
     */
    public void showFizzBuzz(int limit)
    {
        do{
            if(counter%3==0){
                System.out.print("fizz, ");
            }
            else if (counter%5==0){
                System.out.print("buzz, ");
            }
            else{
                System.out.print(Integer.toString(counter)+", ");
            }
            counter++;
        }while(counter< limit);
    }

    public static void main(String args[])
    {
        FizzBuzz fz = new FizzBuzz();
        
        fz.showFizzBuzz(20);

    }
}
