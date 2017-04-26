package day6Assignments;

public class Counter implements  Runnable{
    
    Storage st;
    int count=0;
    public Counter(Storage store)
    {
          st = store;
    }
    @Override
    public void run() 
    {
          synchronized(st) 
          {
                for(int i = 0 ; i < 10; i++)
                {
                      while(!st.isPrinted())
                      {              //loop to take care of spontaneous wake-ups
                         try 
                         {
                            st.wait();
                         } 
                         catch(Exception e) 
                         {  
                        	 
                         }
                      }
                      st.setValue(i);
                  //    count++;
                      
                      st.setPrinted(false);
                      st.notify();
                }
            //    System.out.println(count);
          }
    }

}
