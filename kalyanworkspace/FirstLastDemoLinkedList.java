package javapro;




import java.util.LinkedList;

public class FirstLastDemoLinkedList {
   public static final void main(String[] args) {
      LinkedList lList = new LinkedList();
      System.out.println("Number of items in the list: " + lList.size());
      String item1 = "foo";
      String item2 = "bar";
      String item3 = "sai";
      String item4 = "prasad";
      
      lList.add(item1);
      lList.add(item2);
      lList.addFirst(item3);
      System.out.println(lList);
      lList.addLast(item4);
      System.out.println(lList);
      System.out.println("Number of items in the list: " + lList.size());
   } 
}