package JavaCollections;

import java.util.Stack;

public class StackCol {
    public static void main(String[] args) {
        Stack<String> names=new Stack<>();

        //push method is used to insert the element into stack
        names.push("sanidhya");
        names.push("mayank");
        names.push("ashish");

        //pop method is used to remove and return the top most element of stack.
        String remString=names.pop();
        System.out.println(remString);

        //peek method is used to returns an object from the top of stack.
        System.out.println(names.peek());

        //search method returns the position of object in stack.

        System.out.println(names.search("mayank"));
        System.out.println(names.search("sanidhya"));

        //empty method is used to check whether the stack is empty or not.
        System.out.println(names.empty());
        System.out.println(names);
    }
}
