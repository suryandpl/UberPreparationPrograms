package javapro;

public class MyStack {
	   private int maxSize;
	   private long[] stackArray;
	   private int top;
	   
	   public MyStack(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
	      stackArray[++top] = j;
	   }
	   public long pop() {
	      return stackArray[top--];
	   }
	   public long peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   public static void main(String[] args) {
	      MyStack theStack = new MyStack(10); 
	      theStack.push(100);
	      theStack.push(200);
	      theStack.push(300);
	      theStack.push(400);
	      theStack.push(500);
	      
	      while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	   }
	}
