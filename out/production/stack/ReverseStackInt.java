import java.util.Stack;

public class ReverseStackInt {
    public static void main(String[] args) {
        Stack<Integer>stackInt = new Stack<Integer>();
        int[] array1 = new int[10];
        for (int i  = 0; i < array1.length; i++){
            array1[i] = (int) (Math.random()*10);
            stackInt.push(array1[i]);
        }
        System.out.println("stackInt : ");
        for (int i = 0; i < stackInt.size(); i++){
            System.out.print(stackInt.get(i) + " ");
        }
        System.out.println("");
        System.out.println("arrayInt :");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("");
        System.out.println("***************************");
        System.out.println("Array reverse:");
//        while (!stackInt.empty()){
//            System.out.print(stackInt.pop()+" ");
//        }
        for (int i = 0; i < array1.length; i++){
            array1[i] = stackInt.pop();
            System.out.print(array1[i] + " ");
        }
    }

}
