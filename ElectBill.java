import.java.util.Scanner;
class ElectBill
{
   int consumerno;
   string consumername;
   int prevreading;
   int currreading;
   string ebconn;
   double Bill;
   void input_data()
   {
      Scanner sc=new Scanner(System.in);    
      System.out.println("\nEnter Consumer Number:");
      consumerno=sc.nextInt();
      System.out.println("\nEnter Consumer Name:");
      consumername=sc.nextInt();
      System.out.println("\nEnter Previous Units:");
      prevreading=sc.nextInt();
      System.out.println("\nEnter Current Units:");
      currreading=sc.nextInt();
      System.out.println("\nEnter the Types of EB connection:1.Domestic  2.Commerical");
      ebconn=sc.nextInt();
      
       double calculate_bill()
       {
           int choice;
           if(ebconn=="Domestic")
                   choice=1;
              else
                   choice=2;
              switch(choice)
              {
                   case 1:
                       if(  currreading>=0&&  currreading<=100)
                                   Bill=  currreading*1;
                      else if(  currreading>=100&&  currreading<=200)
                                   Bill=(100*1)+((currreading-100)*2.50);
                       else if(  currreading>=200&&  currreading<=500)
                                   Bill=(100*1)+(100*2.50)+((currreading-200)*4);
                       else
                        Bill=(100*1)+(100*2.50)+(300*4)+((currreading-500)*6);break;

                  case 2:
                       if(  currreading>=0&&  currreading<=100)
                                   Bill=  currreading*2;
                      else if(  currreading>=100&&  currreading<=200)
                                   Bill=(100*1)+((currreading-100)*4.50);
                       else if(  currreading>=200&&  currreading<=500)
                                   Bill=(100*1)+(100*2.50)+((currreading-200)*6);
                       else
                        Bill=(100*1)+(100*2.50)+(300*4)+((currreading-500)*7);break;
              }
          return Bill;
      }

                    void display()
                     {
                          System.out.println("--------------------------");
                          System.out.println("ELECTRICITY BILL");
                          System.out.println("--------------------------");
                          System.out.println("Consumer Number:"+consumerno);
                          System.out.println("Consumer Name:"+consumername);
                          System.out.println("Previous Units:"+prevreading);
                          System.out.println("Current Units:"+currreading);
                          System.out.println("Types of EB connection:"+ebconn);
                          System.out.println("--------------------------");
                          System.out.println("Total Amount(R.S.):"+Bill);
                     }
    }
           Class    ElectBillGen
            {
                public static void main(String[] args) 
                 {
                      ElectBill b=new ElectBill    
                          