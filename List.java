
package testdriver1;


import java.util.*;

class ListNode {

      public int value;
      public ListNode next;
 
      public ListNode(int value) {

            this.value = value;
            next = null;
      }
}
class LinkList
{
      private ListNode headnode;
      private ListNode endnode;
 
      public LinkList() {
            headnode = null;
            endnode = null;
      }
      
      void init(){
          headnode = null;
            endnode = null;
      }
public boolean empty()
{
   if(headnode==null)
       return true;
   else
       return false;
}

public int random() 
{
         ListNode node=headnode;	
		if(node == null) return 0;
		
		Random rand = new Random();
		int random = headnode.value;
		int count = 1;
		
		while(headnode.next!=null) 
                 {
			int newRand = rand.nextInt(count++);
			
			if (newRand==1)
				random=headnode.value;
			
			headnode = headnode.next;
		 }
				
		return random;	
}
public int choose()
{
   int number=random();
   return number;
 }
  public int largest()
{
    int max;
    ListNode c = headnode;

    if (c==null)
        return 0;  
    if(headnode==endnode)
       return headnode.value;

    max = c.value;
    
    
    for (c=c.next;c!=null;c=c.next)
    {
        if(c.value > max)
            max = c.value;
    }
    return max;
 }

  public int smallest()
{
    int min;
    
    ListNode cu = headnode;

    if (cu==null)
        return 0;  
    if(headnode==endnode)
       return headnode.value;

    min = cu.value;
    
     
    for(cu=cu.next;cu!=null;cu=cu.next)
    {
        if (cu.value < min)
            min = cu.value;
    }
    return min;
 }
          
 public boolean search (int e)

{
ListNode c = headnode;
while (c!=null){

  if(c.value==e)
     return true;
 c = c.next;

}

return false;

} 
 public int multisearch (int e)

{

int count=0;
ListNode cur = headnode;
while (cur!=null){

if(cur.value == e)
    count= count+1;
cur = cur.next;

}

return count;

}
 public void insertLast(int x) 
{
      ListNode Node=new ListNode(x);
       
                  Node.next = null;
                  if (headnode==null) 
                     {
                        headnode = Node;
                        endnode = Node;
                      }
                  else 
                     {
                        endnode.next = Node;
                        endnode = Node;
                     }
 }
     
public int size1()
	{
		ListNode node = headnode;
	        int count=0;
		while(node != null)
		{
			
			node = node.next;
                        count++;
		}
               return count;
	}

 public void insertFirst(int x) 

 {
      ListNode Node=new ListNode(x);
            
                  if (headnode == null) 
                 {
                        Node.next = null;
                        headnode = Node;
                        endnode = Node;
                 } 
               else 
                   {
                        Node.next = headnode;
                        headnode = Node;
                   }
   }
 public int first()
 {
    if(headnode==null){
      return 0;}
    if(headnode==endnode){
      return headnode.value;
      }
    else{
           ListNode node=headnode;
           return node.value;
        }
 }

public int last()
 {
    if(headnode==null){
      return 0;}
    if(headnode==endnode){
      return headnode.value;
      }
    else
        {
           ListNode node=headnode;
           while(node.next!=null){
              node=node.next;}

           return node.value;
        }
 }
    
   public void insertAt(int x,int n) {

            ListNode Node=new ListNode(x);
                           
                 if (n==1){
                                 Node.next = headnode;
                                 headnode = Node;
                                 return;
                            }
                      
                   else
                     { 
                      if(n==size1()+1)
                       {
                        Node.next = null;
                        endnode.next = Node;
                        endnode = Node;
                        return;
                     
                       }
                      } 
                   
                      ListNode pre = headnode;
                        for(int i = 1;i<n-1;i++)
                        {
                          pre = pre.next;
                        }
                        ListNode t = pre.next;
                        pre.next = Node;
                        Node.next = t;
                          
                    }
                
public void deleteat(int n)
{
   if (n == 1)
       {
             headnode=headnode.next;
             return;
       }     

   if(n==size1())
    {
         ListNode s = headnode;
         while (s.next != endnode)
           {
              s=s.next;
           }
          endnode = s;
          endnode.next=null;
         return;
    }
     
     if(n==size1()+1)
       { return;
       }	
 
                    ListNode node=headnode;

                        for(int i=1;i<n-1;i++)
                        {
                          node = node.next;
                        }
                        ListNode t = node.next;
                        node.next = t.next;
   }

       public void deleteFirst() {
            if (headnode == null)
                  return;
            else {
                  if (headnode == endnode) 
                  {
                        headnode = null;
                        endnode = null;
                  } else 
                  {
                        headnode = headnode.next;
                  }
            }
      }
 
       public void deleteLast() {
            
            
                  if (headnode == endnode) 
                 {
                        headnode = null;
                        endnode = null;
                  } else {
                        ListNode p=headnode;
                        while(p.next!=endnode){
                          p=p.next; }
 
                        endnode = p;
                        endnode.next = null;
                    
                       }
                 }
             
        
   
  }

public class List {
    
    public static void main(String[] args) {
       LinkList l = new LinkList();
         
           
        }               
 }  
