
public class MyStack<E> {
    public static final int DEFAULT_CAPACITY = 10;
    private int size;
    private E[] elments;

    public MyStack() {
        this.elments = (E[]) new Object[10];
    }

    public void push(E e){
       if(size >= DEFAULT_CAPACITY){
           System.out.println("Stack isEmpty");
       }else {
           elments[size] = e;
           size++;
        }
    }
    public void display(){
        for (int i = 0; i < size; i++){
            System.out.print(elments[i]);
        }
    }
    public E pop() {
        if (size <= 0) {
            System.out.println("Stack isEmpty");
            return null;
        } else {
            E temp = elments[size - 1];
            elments[size - 1] = null;
            size = size - 1;
            return temp;
        }

    }
    public E peek() {
        if (size <= 0) {
            System.out.println("Stack isEmpty");
            return null;
        } else {
            E temp = elments[size - 1];
            return temp;
        }
    }
}
