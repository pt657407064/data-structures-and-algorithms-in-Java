/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author taopa
 */
public class LinkedList {

    public Link firstLink;
    int size;
    public LinkedList(){
        firstLink = null;
        size = 0;
    }
    public boolean isEmpty(){
        return firstLink == null;
    }
    public void insertFirst(Link link)
    {
            link.next = firstLink;
            firstLink = link;
            size++;
        
    }
    public void removeFirst()
    {
        if(!isEmpty())
        {
            firstLink = firstLink.next;
            size --;
            
        }
    }
    public void removeAll()
    {
        if(!isEmpty())
        {
            while(firstLink != null)
            {
                firstLink = firstLink.next;
            }
        }
        size = 0;
    }
    public int getSize()
    {
        return size;
    }
    public Link find(String name)
    {
        Link theLink = firstLink;
        if(!isEmpty())
        {
            while(!theLink.name.equals(name)){
                if(theLink.next == null){
                    return null;
                }
                else{
                theLink = theLink.next;
                }
            }
                    
        }
        

        
        return theLink;
    }
    public void display()
    {       
        if(!isEmpty())
        {
            Link theLink = firstLink;
            while(theLink!=null)
            {
                theLink.display();
                theLink = theLink.next;
            }
        }
        else{
            System.out.println("Empty linked list");
        }
    }
    public void removeLink(String name)
    {
        Link ref = firstLink;
        if(!isEmpty()){
            while(ref!=null)
            {
                if(ref.name==name )
                {
                    ref = ref.next;
                }
            }
        }
    }
    public static void main(String[] args) {
       LinkedList linkedList = new LinkedList();
       linkedList.insertFirst(new Link("Harry Poter",100));
       linkedList.insertFirst(new Link("Catch in the rye ",1020));
       linkedList.insertFirst(new Link("The lord of the fly ",1220));
       linkedList.insertFirst(new Link("Obj oriented pro ",122020));
       linkedList.display();
       System.out.println(linkedList.getSize());
       
       linkedList.removeFirst();
       linkedList.display();
       
       linkedList.find("Harry Poter").display();
       
      // linkedList.insertFirst(new Link("Hello World",20000));
//       linkedList.removeAll();
      // linkedList.display();
//       System.out.println(linkedList.getSize());
    }
    
}
class Link
{
    public Link next;
    public String name;
    public int sold;
    public Link(String name,int sold){
        this.name = name;
        this.sold = sold;
    }
    public void display()
    {
        System.out.println("Book Name:"+name+"\nSold:"+sold);
        System.out.println();
    }
            
}