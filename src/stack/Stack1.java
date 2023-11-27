package stack;
import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("PUBG");
        stack.push("Free fire");
        stack.push("Subway Suffers");
        stack.push("Temple Run");

//        stack.pop(); // last game will remove
//        String myFavGame = stack.pop();
//        System.out.println(myFavGame);
//        System.out.println(stack.peek()); // gives last object in stack


        System.out.println(stack);




    }

}
