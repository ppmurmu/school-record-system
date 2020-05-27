/* Name- Pradeep Peter Murmu
 * Class- X C
 * Roll no- 40
 * Admission no- 4957
 * St. Joseph's School, Bhagalpur
 */
import java.util.*;
class Result extends Student
{
    private Scanner sc;
    private String reg;
    private boolean flag;
    public int n;
    public Student []ar;
    public String name;
    /**default constructor*/
    public Result()
    {
        sc=new Scanner(System.in);
        ar=null;
        flag=false;
        name=null;
    }
    /**function to input and store*/
    public void enterData()
    {
        System.out.println("Enter the number of student");
        n=sc.nextInt();
        sc.skip("\n");
        ar=new Student[n];
        int i;
        for(i=0;i<ar.length;i++)
        {
            ar[i]=new Student();
            ar[i].inputAndStore();
            
        }
        flag=true;
    }
    /**function to modify*/
    public void modify()
    {
       
        String r,t;int c=0;
        if(flag)
        {
           
            System.out.println("Enter your Registration number");
            r=sc.nextLine();
            
            for(int i=0;i<ar.length;i++)
            {
                
                t=ar[i].returnreg();
                if(r.equals(t))
                {
                    ar[i].modification();
                    
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println("No Results Found");
            }
        }
        else
        {
            System.out.println(name+" Please enter the data before modifying any");
        }
    }

    
    /**function to search*/
    public void searchData()
    {
       
        String t,r;int c=0;
        if(flag)
        {
            System.out.println("Enter the Registration Number");
            r=sc.nextLine();
            index=1;
            for(int i=0;i<ar.length;i++)
            {
               
               t=ar[i].returnreg();
               if(r.equals(t))
               {
                   System.out.println("\f");
                   System.out.println("***********************************************************ICSE BOARDS EXAMINATION 2014 STUDENT MARK SHEET*****************************************************");
                   System.out.println("sl.\t"+"Registration\t"+"    Name\t"+"  Date of birth\t"+"  Father's Name\t"+"  Mother's Name\t"+"  Maths\t"+"  Science "+"Computer"+"  HCG    "+"English\t"+"Hindi\t"+"total\t"+"Percentage  "+"Supw");
                   display(ar[i]);
                   c++;
               }
            }
            if(c==0)
            {
                System.out.println("No results found");
            }
        }
        
        else
        {
            System.out.println(name+" Please enter data before searching any");
        }
    }
    /**display mark list*/
    public void displayMarkList()
    {
        
        if(flag)
        {
            index=1;
            System.out.println("\f");
            System.out.println("***********************************************************ICSE BOARDS EXAMINATION 2014 STUDENT MARK S*****************************************************");
            System.out.println("sl.\t"+"Registration\t"+"    Name\t"+"  Date of birth\t"+"  Father's Name\t"+"  Mother's Name\t"+"  Maths\t"+"  Science "+"Computer"+"  HCG    "+"English\t"+"Hindi\t"+"total\t"+"Percentage  "+"Supw");
            for(int i=0;i<ar.length;i++)
            {
                
                display(ar[i]);
            }
        }
        else
        {
            System.out.println(name+" Please enter data before using this operation");
        }
    }
    /**fn to display the rank list*/
    public void displayRankList()
    {
        
        int t,total,c=0;
        if(flag)
        {
            int []arrange=new int[n];
            for(int i=0;i<arrange.length;i++)
            {
                total=ar[i].returnTotal();
                arrange[i]=total;
            }
            for(int i=1;i<arrange.length;i++)
            {
                for(int j=0;j<arrange.length-i;j++)
                {
                    
                    if(arrange[j]<arrange[j+1])
                    {
                         t=arrange[j];
                        arrange[j]=arrange[j+1];
                        arrange[j+1]=t;
                    }
                }
            }
            index=1;
            rank=1;     
            System.out.println("\f");
            System.out.println("*******************************************************ICSE BOARDS EXAMINATION 2014 RANK LIST*********************************************");
            System.out.println("sl.\t"+"Registration\t"+"    Name\t"+"  Date of birth\t"+"  Father's Name\t"+"  Mother's Name\t"+"  Maths\t"+"  Science "+"Computer"+"  HCG    "+"English\t"+"Hindi\t"+"total\t"+"Percentage  "+"Supw"+" Rank");
            for(int i=0;i<arrange.length;i++)
            {
                for(int j=0;j<arrange.length;j++)
                {
                    total=ar[j].returnTotal();
                    if(arrange[i]==total)
                    {
                        displayRank(ar[j]);
                        c++;
                        if(c==1)
                        {
                            y=false;
                        }
                        else
                        {
                            y=true;
                        }
                        
                    }
                }
            }
        }
        else
        {
            System.out.println(name+" Please enter the data before using this operation");
        }
    }
    /**fn to display pass certificate*/
    public void displayPassCertificate()
    {
        String r,reg;int c=0;
        if(flag)
        {
            System.out.println("Enter the Registrtation number");
            r=sc.nextLine();
            for(int i=0;i<ar.length;i++)
            {
                reg=ar[i].returnreg();
                if(r.equals(reg))
                {
                    
                    displayCertificate(ar[i]);
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println("No results found. Please check the Registration number and search again");
            }
        }
        else
        {
            System.out.println(name+" Please enter the data before using this operation");
        }
    }
    /**function to display menu*/
    public void displayMenu()
    {
        System.out.println("\f");
        System.out.println("************************************WELCOME TO MAJOR X:RESULT PROCESSING SYSTEM 2K14************************************");
        System.out.println("*                                                  THE MENU:                                                           *");
        System.out.println("*           You can choose any operation listed below                                                                  *");
        System.out.println("*           1. ENTER DATA                                                                                              *");
        System.out.println("*           2. MODIFY                                                                                                  *");
        System.out.println("*           3. SEARCH                                                                                                  *");
        System.out.println("*           4. DISPLAY MARK LIST                                                                                       *");
        System.out.println("*           5. DISPLAY RANK LIST                                                                                       *");
        System.out.println("*           6. DSIPLAY THE PASS CERTIFICATE                                                                            *");
        System.out.println("*           7. DISPLAY CHARACTER CERTIFICATE                                                                           *");
        System.out.println("*           8. DISPLAY MARKS SHEET                                                                                     *");
        System.out.println("*           9. GO BACK TO HOME                                                                                         *");
        System.out.println("*           Enter your Choice 1/2/3/4/5/6/7/8/9                                                                        *");
        System.out.println("*______________________________________________________________________________________________________________________*");
        
    }
    /**function to display official marks sheet with pass/ fail remark*/
    public void displayOfficialPassCertificate()
    {
        String r,t;int c=0;
        if(flag)
        {
            System.out.println("Enter your Registration number");
            r=sc.nextLine();
            
            for(int i=0;i<ar.length;i++)
            {
                
                t=ar[i].returnreg();
                if(r.equals(t))
                {
                    displayOfficialMarksSheet(ar[i]);
                    c++;
                }
            }
        
            if(c==0)
            {
                System.out.println("No results found. Please check the Registration number and search again");
            }
        }
        
        else
        {
            System.out.println(name+" Please enter the data before using this operation");
        }
    }
    
        
    
  
    /**function to display character certificate*/
    public void displayCharacterCertificate()
    {
        String r,reg;int c=0;
        if(flag)
        {
            System.out.println("Enter the Registrtation number");
            r=sc.nextLine();
            for(int i=0;i<ar.length;i++)
            {
                reg=ar[i].returnreg();
                if(r.equals(reg))
                {
                    
                    ar[i].characterCertificate();
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println("No results found. Please check the Registration number and search again");
            }
        }
        else
        {
            System.out.println(name+" Please enter the data before using this operation");
        }
    }
    /**function to display credits*/
    public void displayCredit()
    {
        System.out.println("\f");
        System.out.println("______________________________THE CREDITS_____________________________________");
        System.out.println("Designed and Coded by- Pradeep Peter Murmu");
        System.out.println();
        System.out.println("Special Thanks to- Mr. Merson Matthew");
        System.out.println();
        System.out.println("This Software is Purely Java based.");
        System.out.println("You can contact me on Facebook - http://www.facebook.com/P.peter.M");
        System.out.println("You can also Follow me on twitter- @PradeepPeterM");
        System.out.println("For any queries and suggestions mail me on- pradeeppetermurmu@gmail.com");
        System.out.println("You can also ring me on- +918409979901");
        System.out.println();
        System.out.println("------------------------copyrights protected 2013----------------------------");
        System.out.println("any illegal copying ideas and design can sue you under the act of plagiarism");
        System.out.println("all the elements used in this software belongs to PPM media solutions");
        System.out.println("MAJOR X: RESULT PROCESSING SOFTWARE 2K14- all rights reserved");
        System.out.println("MADE IN INDIA");
    }
    
    /**function to perform operation based on user's choice*/   
    public void menuOperation()   
    {
        int c=1,e=0;
        do
        {
            if(e==0)
            {
             displayMenu();
             c=sc.nextInt();
             sc.skip("\n");
             switch(c)
             {
                case 1:enterData();
                System.out.println("Please enter 0 to continue");
                e=sc.nextInt();
                break;
                case 2:modify();
                System.out.println("Please enter 0 to continue");
                e=sc.nextInt();
                break;
                case 3:searchData();
                System.out.println("Please enter 0 to continue");
                e=sc.nextInt();
                break;
                case 4:displayMarkList();
                System.out.println("Please enter 0 to continue");
                e=sc.nextInt();
                break;
                case 5:displayRankList();
                System.out.println("Please enter 0 to continue");
                e=sc.nextInt();
                break;
                case 6:displayPassCertificate();
                System.out.println("Please enter 0 to continue");
                e=sc.nextInt();
                break;
                case 7:displayCharacterCertificate();
                System.out.println("Please enter 0 to continue");
                e=sc.nextInt();
                break;
                case 8:displayOfficialPassCertificate();
                System.out.println("Please enter 0 to continue");
                e=sc.nextInt();
                break;
                case 9:System.out.println("terminating the system.....");
                break;
                default:System.out.println("Invalid input");
             
           }
        }
           else
           {
            System.out.println("please enter 0 to continue");
            e=sc.nextInt();
           }
        }while(c!=9);
    
    }
    /** function to display user's manual*/
    public void userManual()
    {
        int ch=1,e=0;
        do
        {
            if(e==0)
            {
                System.out.println("\f");
                System.out.println("______________________________MAJOR X: RESULT PROCESSING SYSTEM 2K14-<USER'S MANUAL>____________________________________________");
                System.out.println("THIS SOFTWARE IS ENTIRELY JAVA BASED.  DEVELOPED ON JAVA 3.0.7");
                System.out.println("TOPICS:");
                System.out.println("1. Getting Started");
                System.out.println("2. Menu Operations");
                System.out.println("3. Bugs");
                System.out.println("4. Step by Step assistance");
                System.out.println("5. Why to use this software");
                System.out.println("6. Feedbacks");
                System.out.println("7. GO BACK TO HOME");
                System.out.println("Enter your choice 1/2/3/4/5/6/7");
                ch=sc.nextInt();
                sc.skip("\n");
                switch(ch)
                {
                    case 1:System.out.println("\f");
                    System.out.println("GETTING STARTED:");
                    System.out.println("Using MAJOR X: RESULT PROCESSING SYSTEM 2K14 is as easy as sleeping. You dont have to use any neurons of your brain while operating this software.");
                    System.out.println("All the steps will be marked with some numbers and according to which you can enter your choice.");
                    System.out.println("Any number entered which doesnt has a linked choice directory will automatically report you an invalid option message");
                    System.out.println("For every input you make this software keeps a record");
                    System.out.println("For more just you need is to open this software and experience the real java simplicity");
                    System.out.println("enter 0 to continue");
                    e=sc.nextInt();
                    break;
                    case 2:System.out.println("\f");
                    System.out.println("MENU OPERATIONS");
                    System.out.println("You can enter data, modify any data on the basis of registration number,");
                    System.out.println("view mark sheet, mark list and rank list");
                    System.out.println("there is lot on this software which needs your hand to be operated by:)");
                    System.out.println("LIVE THE MOMENTS WITH US");
                    System.out.println("enter 0 to continue");
                    e=sc.nextInt();
                    break;
                    case 3:System.out.println("\f");
                    System.out.println("BUGS");
                    System.out.println("just watch out that you dont enter any string character in a numeric field");
                    System.out.println("enter 0 to continue");
                    e=sc.nextInt();
                    break;
                    case 4: System.out.println("\f");
                    System.out.println(" ASSISTANCE");
                    System.out.println("go to home-----1. menu-----enter your choice if 1/2/3/4/5/6/7/8----");
                    System.out.println("1. enter data option in menu lets you enter data to the database of this software");
                    System.out.println("2. modify option lets you modify any entered data. you need to enter registration number before that");
                    System.out.println("3. search option lets you search any student's marks sheet. you need to enter registration number before that");
                    System.out.println("4. display mark list option lets you view the mark list in an un-arranged format.");
                    System.out.println("5. display rank list option lets you view the mark list on rank basis");
                    System.out.println("6. display pass certificate option lets you view pass certificate");
                    System.out.println("7. display pass certificate lets you view the pass certificate of a particular student. you can then get a hard copy of it");
                    System.out.println("8. display credits lets you know the ones behind this project");
                    System.out.println("9. go back to home option takes you back to the home screen");
                    System.out.println("enter 0 to continue");
                    e=sc.nextInt();
                    break;
                    case 5: System.out.println("\f");
                    System.out.println("WHY TO USE THIS SOFTWARE");
                    System.out.println("> the interface and the menu is so amiable that you dont need to be a geek to operate this software");
                    System.out.println("enter 0 to continue");
                    e=sc.nextInt();
                    break;
                    case 6:System.out.println("\f");
                    System.out.println("enter your feedback:");
                    String feed=sc.nextLine();
                    System.out.println("thank you "+" for your feedback. We'll work on it.");
                    System.out.println("enter 0 to continue");
                    e=sc.nextInt();
                    break;
                    case 7:System.out.println("Thank you "+name+" for reading the manual. You can access the manual anytime you have problem!");
                    break;
                    default:System.out.println("Invalid input");
                }
            }
            else
            {
                System.out.println("enter 0 to continue");
                    e=sc.nextInt();
                }
            }while(ch!=7);
        }
    /**function  main*/
    public void main()
    {
        int a=0,ch=1,to=0,e=0;
        String []data=new String[1000];
        do
        {
                if(to==0)
                {
                    System.out.println("******************************************MAJOR X: RESULT PROCESSING SYSTEM 2K14****************************************");
                    System.out.println("Before using this software you need to register yourself:");
                    System.out.println("Enter your name-");
                    name=sc.nextLine();
                    to++;
                }
                else
                {
                    if(e==0)
                    {
                    System.out.println("\f");
                    System.out.println("_____________________________________________________HOME_______________________________________________________________");
                    System.out.println("1. MENU");
                    System.out.println("2. USER'S MANUAL");
                    System.out.println("3. CREDITS"); 
                    System.out.println("4. SHUT DOWN");
                    System.out.println("Enter your choice among 1/2/3/4");
                    System.out.println("________________________________________________________________________________________________________________________");
                    ch=sc.nextInt();
                    sc.skip("\n");
                    switch(ch)
                    {
                        case 1: menuOperation();
                        break;
                        case 2:userManual();e=0;
                        break;
                        case 3:displayCredit();
                        System.out.println("Enter 0 to continue");
                        e=sc.nextInt();
                        break;
                        case 4:System.out.println("#Wait for some moments while MAJOR X is shutting down");
                        for(int i=1;i<=999999999;i++)
                        {
                            if(i==9)
                            {
                                System.out.print(".");
                            }
                            else if(i==9999999)
                            {
                                System.out.print(".");
                            }
                            else if(i==999999999)
                            {
                                System.out.println(".");
                            }
                        }

                        System.out.println("thank you "+name+" for using this software");
                            System.out.println("HAVE A NICE DAY:)");
                            break;
                        default:System.out.println("Invalid Input");
                    }
                }
                else
                {
                    System.out.println("please enter 0 to continue");
                    e=sc.nextInt();
                }
             }
                        
        }while(ch!=4);
    }
}

            

            
            
    
            
            
        
        
            
                    
           
                       
                        
            
                    
    
    