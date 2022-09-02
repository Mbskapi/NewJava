package FunctionaStack;
import java.util.Stack;
public class StackTest {

    public static void main(String[] args) {
        Stack <String> cars = new Stack<>();

        //method push(add).
        cars.push("toyota");
        cars.push("Honda");
        cars.push("benz");
        cars.push("volvo");
        cars.push("audi");
        System.out.println("stack: "+ cars);

        //method pop(LIFO).
        String item = cars.pop();
        System.out.println("Remove item " + item);

        //method peek().
        String item1 = cars.peek();
        System.out.println("the item at the top is " + item1);

        //method search(returns item position from the top).
         int position = cars.search("volvo");
        System.out.println("the position of benz is " + position);

        //method empty
        boolean result = cars.empty();
        System.out.println("is the stack empty? \t" + result);
    }
}
