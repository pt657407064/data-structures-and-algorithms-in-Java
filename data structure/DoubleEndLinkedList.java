    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleenedlinkedlist;

/**
 *
 * @author taopa
 */
public class DoubleEndLinkedList {

   public Link firstLink;
   public Link LastLink;
   public boolean isEmpty()
   {
       return firstLink == null;
   }
   public void insertFirst(Link link){
          if(isEmpty()){
           link.next = firstLink;
           firstLink = link;
           LastLink = link;
          }
          else{
             firstLink.privious = link;
             link.next = firstLink;
             firstLink = link;
          }
       
   }
          
   public void insertLast(Link link){
       
       if(!isEmpty())
       {
           LastLink.next = link;
           link.privious = LastLink;
           LastLink = link;
                           
       }else{
           link.privious = LastLink;
           LastLink = link;         
           firstLink = link;
       }
   }
   public void display()
   {
       Link theLink = firstLink;
       while(theLink!=null){
           System.out.println(theLink);
           theLink = theLink.next;
       }
   }
    
    
    public static void main(String[] args) {
       DoubleEndLinkedList doublendLinked = new DoubleEndLinkedList();
       doublendLinked.insertFirst(new Link("Tao","5441"));
       doublendLinked.insertFirst(new Link("Fang","Main"));
       
       doublendLinked.insertLast(new Link("Tao","2222"));
       doublendLinked.insertLast(new Link("Pan","2555"));
       
       doublendLinked.display();
       
    }
    
}
class  Link{
    String name;
    String street;
    Link next;
    Link privious;
    
    public Link(String name, String street)
    {
        this.name = name ;
        this.street = street;
    }
    public String toString(){
        return name + " " + street;
    }
    
}
