/* Name- Pradeep Peter Murmu
 * Class- X C
 * Roll no- 40
 * Admission no- 4957
 * St. Joseph's School, Bhagalpur
 */
import java.util.*;
class Student
{
    private Scanner sc;
    public String reg;
    public int index;
    public int rank;
    public String name;
    private String dob;
    private String father;
    private String mother;
    private int maths;
    private int chem;
    private int phy;
    private int bio;
    private int hist;
    private int geo;
    private int hindi;
    private int eng1;
    private int eng2;
    private int comp;
    private int imaths;
    private int ichem;
    private int iphy;
    private int ibio;
    private int ihist;
    private int igeo;
    private int ihindi;
    private int ieng1;
    private int ieng2;
    private int icomp;
    private int sci;
    private int hcg;
    private int eng;
    private int total;
    private int tmaths;
    private int thindi;
    private int tcomp;
    private double per;
    private String supw;
    public boolean x;
    public boolean y;
    
    /**default constructor*/
    public Student()
    {   
        sc= new Scanner(System.in);
        reg=null;
        index=1;
        name=null;
        dob=null;
        father=null;
        mother=null;
        maths=0;
        chem=0;
        phy=0;
        bio=0;
        hist=0;
        geo=0;
        hindi=0;
        eng1=0;
        eng2=0;
        comp=0;
        imaths=0;
        ichem=0;
        iphy=0;
        ibio=0;
        ihist=0;
        igeo=0;
        ihindi=0;
        ieng1=0;
        ieng2=0;
        icomp=0;
        sci=0;
        hcg=0;
        eng=0;
        supw=null;
        rank=1;
        y=false;
        x=false;
    }
    /**function to input and store*/
    public void inputAndStore()
    {
        
        if(x==false)
        {
                System.out.println("Enter your Registration number");
                reg=sc.nextLine();
        }
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your Date of Birth in the format DD/MM/YY");
        dob=sc.nextLine();
        System.out.println("Enter your Father's name");
        father=sc.nextLine();
        System.out.println("Enter your Mother's name");
        mother=sc.nextLine();
        
        do
        {
                System.out.println("Enter your Maths marks out of 80");
                maths=sc.nextInt(); 
            if(maths<0||maths>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }    
        }while(maths<0||maths>80);        
        do
        {
            System.out.println("Enter your Chemistry marks out of 80");
            chem=sc.nextInt();
            if(chem<0||chem>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }
        }while(chem<0||chem>80);
        do
        {
            System.out.println("Enter your Physics marks out of 80");
            phy=sc.nextInt();
            if(phy<0||phy>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }
        }while(phy<0||phy>80);
        do
        {
            System.out.println("Enter your Biology marks out of 80");
            bio=sc.nextInt();
            if(bio<0||bio>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }
        }while(bio<0||bio>80);
        do
        {
            System.out.println("Enter your History and Civics marks out of 80");
            hist=sc.nextInt();
            if(hist<0||hist>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }
        }while(hist<0||hist>80);
        do
        {
            System.out.println("Enter your Geography marks out of 80");
            geo=sc.nextInt();
            if(geo<0||geo>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }
        }while(geo<0||geo>80);
        do
        {
             System.out.println("Enter your Hindi marks out of 80");
             hindi=sc.nextInt();
             if(hindi<0||hindi>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }
        }while(hindi<0||hindi>80);
        do
        {
            System.out.println("Enter your English Paper 1 marks out of 80");
           eng1=sc.nextInt();
           if(eng1<0||eng1>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }

        }while(eng1<0||eng1>80);
        
        do
        {
            System.out.println("Enter your English Paper 2 marks out of 80");
            eng2=sc.nextInt();
            if(eng2<0||eng2>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }
        }while(eng2<0||eng2>80);
         do
        {
            System.out.println("Enter your Computer marks out of 80");
                comp=sc.nextInt();
            if(comp<0||comp>80)
            {
                System.out.println(name+" you cant enter marks above 80 in this segment");
            }
        }while(comp<0||comp>80);
        do
        {
            System.out.println("Enter your internal assessment marks of Maths out of 20");
                imaths=sc.nextInt();

            if(imaths<0||imaths>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(imaths<0||imaths>20);
         do
        {
            System.out.println("Enter your internal assessment marks of Chemistry out of 20");
                ichem=sc.nextInt();
            if(ichem<0||ichem>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(ichem<0||ichem>20);
        do
        {
            System.out.println("Enter your internal assessment marks of Physics out of 20");
                iphy=sc.nextInt();
            if(iphy<0||iphy>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(iphy<0||iphy>20);
         do
        {
             System.out.println("Enter your internal assessment marks of Biology out of 20");
               ibio=sc.nextInt();
               if(ibio<0||ibio>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(ibio<0||ibio>20);
         do
        {
            System.out.println("Enter your internal assessment marks of History and Civics out of 20");
            ihist=sc.nextInt();
            if(ihist<0||ihist>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(ihist<0||ihist>20);
        do
        {
            System.out.println("Enter your internal assessment marks of Geography out of 20");
            igeo=sc.nextInt();
            if(igeo<0||igeo>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(igeo<0||igeo>20);
         do
        {
            System.out.println("Enter your internal assessment marks of Hindi out of 20");
                ihindi=sc.nextInt();
            if(ihindi<0||ihindi>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(ihindi<0||ihindi>20);
        do
        {
            System.out.println("Enter your internal assessment marks of English Paper 1 out of 20");
            ieng1=sc.nextInt();
            if(ieng1<0||ieng1>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(ieng1<0||ieng1>20);
        do
        {
            System.out.println("Enter your internal assessment marks of English Paper 2 out of 20");
            ieng2=sc.nextInt();
            if(ieng2<0||ieng2>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(ieng2<0||ieng2>20);
        do
        {
            System.out.println("Enter your internal assessment marks of Computer out of 20");
            icomp=sc.nextInt();
            if(icomp<0||icomp>20)
            {
                System.out.println(name+" you cant enter marks above 20 in this segment");
            }
        }while(icomp<0||icomp>20);
        System.out.println("Enter your S.U.P.W. Grade either A/B/C/D/E/F");
        supw=sc.next();
    }
    

    /**function to sum internal assessment marks with the paper marks and to store in the respective subjects*/
    public void sumSubject()
    {
        sci=(chem+ichem+phy+iphy+bio+ibio)/3;
        eng=(eng1+ieng1+eng2+ieng2)/2;
        hcg=(hist+ihist+geo+igeo)/2;
        thindi=hindi+ihindi;
        tcomp=comp+icomp;
        tmaths=maths+imaths;
        total=sci+eng+hcg+thindi+tcomp+tmaths;
        per=total*1.0/6;
    }
    /**fn to return registration number*/
    public String returnreg()
    {
        return reg;
    }
    /**function to display marklist*/
    public void display(Student s)
    {
        s.sumSubject();
        System.out.printf("%-7d%-20s%-16s%-17s%-17s%-15s%-9d%-8d%-8d%-7d%-13d%-9d%-9d%-11f%-5s",index,s.reg,s.name,s.dob,s.father,s.mother,s.tmaths,s.sci,s.tcomp,s.hcg,s.eng,s.thindi,s.total,s.per,s.supw);
        System.out.println();
        index++;
        
    }
    /**function to display rank list*/
    public void displayRank(Student s)
    {
        s.sumSubject();System.out.println();
        System.out.printf("%-7d%-20s%-16s%-17s%-17s%-15s%-9d%-8d%-8d%-7d%-13d%-9d%-9d%-11f%-5s%-5d",index,s.reg,s.name,s.dob,s.father,s.mother,s.tmaths,s.sci,s.tcomp,s.hcg,s.eng,s.thindi,s.total,s.per,s.supw,rank);
        index++;
        if(y==false)
        {
            rank++;
        }
        System.out.println();
    }
    /**function to return total*/
    public int returnTotal()
    {
        sumSubject();
        return total;
    }
    /**Function to display grade*/
    public void grade(int n)
    {
       if(n>=90)
       {
           System.out.println("1");
        }
       else if(n<90&&n>=80)
       {
           System.out.println("2");
        }
       else if(n<80&&n>=70)
       {
           System.out.println("3");
        }
       else if(n<70&&n>=60)
       {
           System.out.println("4");
        }
       else if(n<60&&n>=50)
       {
           System.out.println("5");
        }
        else if(n<50&&n>=40)
        {
            System.out.println("6");
        }
        else if(n<40&&n>=30)
        {
            System.out.println("7");
        }
        else if(n<30&&n>=20)
        {
            System.out.println("8");
        }
        else
        {
            System.out.println("9");
        }
    }
    /**fn to display pass certificate*/
    public void displayCertificate(Student s)
    {
        s.sumSubject();
        System.out.println("\f");
        System.out.println("**************COUNCIL FOR THE INDIAN SCHOOL CERTIFICATE EXAMINATIONS, NEW DELHI***********************");
        System.out.println("**************************************PASS CERTIFICATE************************************************");
        System.out.println("                                  NO DIVISIONS ARE AWARDED                                            ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("This is to certify that\t"+s.name);
        System.out.println("of\t"+"St. Joseph's School,Bhagalpur");
        System.out.println("Registration number-\t"+s.reg);
        System.out.println("Child of-");
        System.out.println(s.father+" and "+s.mother);
        System.out.println();
        System.out.println("was awarded an");
        System.out.println();
        System.out.println("*****************************INDIAN CERTIFICATE OF SECONDARY EDUCATION*********************************");
        System.out.println("The candidate's marks are given below");
        System.out.println("SUBJECTS                                        GRADE");
        System.out.print("ENGLISH                                         ");
        grade(s.eng);
        System.out.print("HINDI                                           ");
        grade(s.thindi);
        System.out.print("HISTORY, CIVICS & GEOGRAPHY                     ");
        grade(s.hcg);
        System.out.print("MATHEMATICS                                     ");
        grade(s.tmaths);
        System.out.print("SCIENCE                                         ");
        grade(s.sci);
        System.out.print("COMPUTER APPLICATIONS                           ");
        grade(s.tcomp);
        System.out.println();
        System.out.println();
        System.out.println("Internal Assessment-");
        System.out.println("SUPW & COMMUNITY SERVICE                        "+s.supw);
        System.out.println();
        System.out.println();
        System.out.println("EXAMINATION OF MARCH 2014");
        System.out.println("Date of Birth as certified by the Head of the School at the time of registration:");
        System.out.println(s.dob);
        System.out.println();
        System.out.println();
        System.out.println("Chief executive & Secretary- Garry Urrathon");
    }
    /**function to display character certificate*/
    public void characterCertificate()
    {
         System.out.println("\f");
        System.out.println("***********************COUNCIL FOR THE INDIAN SCHOOL CERTIFICATE EXAMINATIONS, NEW DELHI************************");
         System.out.println("******************************************CHARACTER CERTIFICATE*************************************************");
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("This is to certify that\t"+name);
         System.out.println("of\t"+"St. Joseph's School,Bhagalpur");
         System.out.println("Registration number-\t"+reg);
         System.out.println("Child of-");
         System.out.println(father+" and "+mother);
         System.out.println();
         System.out.println("was awarded an");
         System.out.println();
         System.out.println("***************************************INDIAN CERTIFICATE OF CHARACTER*****************************************");
         System.out.println();
         System.out.println();
         System.out.println("This is to certify that "+name+" has a good moral character and actively took part in co-curricular activities");
         System.out.println();
         System.out.println();
         System.out.println("Head of the school: Fr. Varghese Pannanghatt");
         System.out.println("Seal of School- St. Joseph's School, Bhagalpur");
        }
    /**function to modify*/
    public void modification()
    {
        int ch=1,e=0;
        do
        {
            if(e==0)
            {
                System.out.println("\f");
                System.out.println("______________________________________MODIFICATION MENU__________________________________");
                System.out.println("1. Modify name");
                System.out.println("2. Modify Date of Birth");
                System.out.println("3. Modify Father's Name");
                System.out.println("4. Modify Mother's Name");
                System.out.println("5. Modify Maths marks");
                System.out.println("6. Modify Chemistry marks");
                System.out.println("7. Modify Physics marks");
                System.out.println("8. Modify Biology marks");
                System.out.println("9. Modify History and Civics marks");
                System.out.println("10. Modify Geography marks");
                System.out.println("11. Modify Hindi marks");
                System.out.println("12. Modify English Language (paper 1) marks");
                System.out.println("13. Modify English Literature (paper 2) marks");
                System.out.println("14. Modify Computer marks");
                System.out.println("15. Modify Maths internal assessment marks");
                System.out.println("16. Modify Chemistry internal assessment marks");
                System.out.println("17. Modify Physics internal assessment marks");
                System.out.println("18. Modify Biology internal assessment marks");
                System.out.println("19. Modify History and Civics internal assessment marks");
                System.out.println("20. Modify Geography internal assessment marks");
                System.out.println("21. Modify Hindi internal assessment");
                System.out.println("22. Modify English language (paper 1) internal assessment marks");
                System.out.println("23. Modify English Literature (paper 2) internal assessment marks");
                System.out.println("24. Modify Computer internal assessment marks");
                System.out.println("25. Modify SUPW grade");
                System.out.println("101. Exit");
                System.out.println("___________________________________________________________________________________________");
                System.out.println("Enter your choice 1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16/17/18/19/20/21/22/23/24/25/101(exit)");
                ch=sc.nextInt();
                sc.skip("\n");
                switch(ch)
                {
                        case 1:System.out.println("Enter your name");
                            name=sc.nextLine();
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                        case 2:System.out.println("Enter your Date of Birth in the format DD/MM/YY");
                            dob=sc.nextLine();
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                        case 3:System.out.println("Enter your Father's name");
                            father=sc.nextLine();
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                        case 4:System.out.println("Enter your Mother's name");
                            mother=sc.nextLine();
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                        case 5:do
                        {
                            System.out.println("Enter your Maths marks out of 80");
                            maths=sc.nextInt(); 
                            if(maths<0||maths>80)
                            {
                                System.out.println(name+" you cant enter marks above 80 in this segment");
                            }    
                        }while(maths<0||maths>80);
                        System.out.println("enter 0 to continue");
                        e=sc.nextInt();
                            break;
                        case 6: do
                        {
                            System.out.println("Enter your Chemistry marks out of 80");
                            chem=sc.nextInt();
                            if(chem<0||chem>80)
                            {
                                System.out.println(name+" you cant enter marks above 80 in this segment");
                            }
                        }while(chem<0||chem>80);
                        System.out.println("enter 0 to continue");
                        e=sc.nextInt();
                            break;
                            case 7:do
                            {
                                System.out.println("Enter your Physics marks out of 80");
                                phy=sc.nextInt();
                                if(phy<0||phy>80)
                                {
                                    System.out.println(name+" you cant enter marks above 80 in this segment");
                                }
                            }while(phy<0||phy>80);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 8:do
                            {
                                System.out.println("Enter your Biology marks out of 80");
                                bio=sc.nextInt();
                                if(bio<0||bio>80)
                                {
                                    System.out.println(name+" you cant enter marks above 80 in this segment");
                                }
                            }while(bio<0||bio>80);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 9:do
                            {
                                System.out.println("Enter your History and Civics marks out of 80");
                                hist=sc.nextInt();
                                if(hist<0||hist>80)
                                {
                                    System.out.println(name+" you cant enter marks above 80 in this segment");
                                }
                            }while(hist<0||hist>80);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 10:do
                            {
                                System.out.println("Enter your Geography marks out of 80");
                                geo=sc.nextInt();
                                if(geo<0||geo>80)
                                {
                                    System.out.println(name+" you cant enter marks above 80 in this segment");
                                }
                            }while(geo<0||geo>80);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 11:do
                            {
                                System.out.println("Enter your Hindi marks out of 80");
                                hindi=sc.nextInt();
                                if(hindi<0||hindi>80)
                                {
                                    System.out.println(name+" you cant enter marks above 80 in this segment");
                                }
                            }while(hindi<0||hindi>80);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 12:do
                            {
                                System.out.println("Enter your English Paper 1 marks out of 80");
                                eng1=sc.nextInt();
                                if(eng1<0||eng1>80)
                                {
                                    System.out.println(name+" you cant enter marks above 80 in this segment");
                                }

                            }while(eng1<0||eng1>80);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
        
                            case 13:do
                            {
                                System.out.println("Enter your English Paper 2 marks out of 80");
                                eng2=sc.nextInt();
                                if(eng2<0||eng2>80)
                                {
                                    System.out.println(name+" you cant enter marks above 80 in this segment");
                                }
                            }while(eng2<0||eng2>80);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 14:do
                            {
                                System.out.println("Enter your Computer marks out of 80");
                                comp=sc.nextInt();
                                if(comp<0||comp>80)
                                {
                                    System.out.println(name+" you cant enter marks above 80 in this segment");
                                }
                            }while(comp<0||comp>80);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 15:do
                            {
                                System.out.println("Enter your internal assessment marks of Maths out of 20");
                                imaths=sc.nextInt();

                                if(imaths<0||imaths>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(imaths<0||imaths>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 16:do
                            {
                                System.out.println("Enter your internal assessment marks of Chemistry out of 20");
                                ichem=sc.nextInt();
                                if(ichem<0||ichem>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(ichem<0||ichem>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 17:do
                            {
                                System.out.println("Enter your internal assessment marks of Physics out of 20");
                                iphy=sc.nextInt();
                                if(iphy<0||iphy>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(iphy<0||iphy>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 18:do
                            {
                                System.out.println("Enter your internal assessment marks of Biology out of 20");
                                ibio=sc.nextInt();
                                if(ibio<0||ibio>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(ibio<0||ibio>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 19:do
                            {
                                System.out.println("Enter your internal assessment marks of History and Civics out of 20");
                                ihist=sc.nextInt();
                                if(ihist<0||ihist>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(ihist<0||ihist>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 20:do
                            {
                                System.out.println("Enter your internal assessment marks of Geography out of 20");
                                igeo=sc.nextInt();
                                if(igeo<0||igeo>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(igeo<0||igeo>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 21:do
                            {
                                System.out.println("Enter your internal assessment marks of Hindi out of 20");
                                ihindi=sc.nextInt();
                                if(ihindi<0||ihindi>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(ihindi<0||ihindi>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 22:do
                            {
                                System.out.println("Enter your internal assessment marks of English Paper 1 out of 20");
                                ieng1=sc.nextInt();
                                if(ieng1<0||ieng1>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(ieng1<0||ieng1>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 23:do
                            {
                                System.out.println("Enter your internal assessment marks of English Paper 2 out of 20");
                                ieng2=sc.nextInt();
                                if(ieng2<0||ieng2>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(ieng2<0||ieng2>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 24:do
                            {
                                System.out.println("Enter your internal assessment marks of Computer out of 20");
                                icomp=sc.nextInt();
                                if(icomp<0||icomp>20)
                                {
                                    System.out.println(name+" you cant enter marks above 20 in this segment");
                                }
                            }while(icomp<0||icomp>20);
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 25:System.out.println("Enter your S.U.P.W. Grade either A/B/C/D/E/F");
                            supw=sc.next();
                            System.out.println("enter 0 to continue");
                            e=sc.nextInt();
                            break;
                            case 101:System.out.println("Saving your modification>>>");
                            break;
                            
                            default:System.out.println("Invalid Input");
                 }
             }
            else
            {
                System.out.println("Please enter 0 to continue");
                e=sc.nextInt();
            }
        }while(ch!=101);
    }
    /**fuction to print digits name*/
    public void digitName(int n)
    {
        int m=n,d,r=0,s;
        if(n==100)
        {
            System.out.print("ONE ZERO ZERO");
        }
        while(m!=0)
        {
            d=m%10;
            r=r*10+d;
            m=m/10;
        }
        s=r;
        while(s!=0)
        {
            d=s%10;
            if(d==1)
            {
                System.out.print("ONE ");
            }
            else if(d==2)
            {
                System.out.print("TWO ");
            }
            else if(d==3)
            {
                System.out.print("THREE ");
            }
            else if(d==4)
            {
                System.out.print("FOUR ");
            }
            else if(d==5)
            {
                System.out.print("FIVE ");
            }
            else if(d==6)
            {
                System.out.print("SIX ");
            }
            else if(d==7)
            {
                System.out.print("SEVEN ");
            }
            else if(d==8)
            {
                System.out.print("EIGHT ");
            }
            else if(d==9)
            {
                System.out.print("NINE ");
            }
            else if(d==0)
            {
                System.out.print("ZERO");
            }
            s=s/10;
        }
        if(n==0)
        {
            System.out.print("ZERO");
        }
    }
    /**function to verdict pass or fail*/
    public void passOrFail(double n)
    {
        if(n>35)
        {
            System.out.print("PASS");
        }
        else
        {
            System.out.print("FAIL");
        }
    }

    /**function to display official mark sheet*/
    public void displayOfficialMarksSheet(Student s)
    {
        s.sumSubject();
        System.out.println("\f");
        System.out.println("**************COUNCIL FOR THE INDIAN SCHOOL CERTIFICATE EXAMINATIONS, NEW DELHI***********************");
        System.out.println("*******************************************MARKS SHEET************************************************");
        System.out.println("                                  NO DIVISIONS ARE AWARDED                                            ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("This is to certify that\t"+s.name);
        System.out.println("of\t"+"St. Joseph's School,Bhagalpur");
        System.out.println("Registration number-\t"+s.reg);
        System.out.println("Child of-");
        System.out.println(s.father+" and "+s.mother);
        System.out.println();
        System.out.println("was awarded an");
        System.out.println();
        System.out.println("*****************************INDIAN CERTIFICATE OF SECONDARY EDUCATION*********************************");
        System.out.println("The candidate's marks are given below");
        System.out.println("SUBJECTS                                        MARKS   (IN WORDS)");
        System.out.print("ENGLISH                                         "+s.eng+"     ");
        digitName(s.eng);
        System.out.println();
        System.out.print("HINDI                                           "+s.thindi+"     ");
        digitName(s.thindi);
        System.out.println();
        System.out.print("HISTORY, CIVICS & GEOGRAPHY                     "+s.hcg+"     ");
        digitName(s.hcg);
        System.out.println();
        System.out.print("MATHEMATICS                                     "+s.tmaths+"     ");
        digitName(s.tmaths);
        System.out.println();
        System.out.print("SCIENCE                                         "+s.sci+"     ");
        digitName(s.sci);
        System.out.println();
        System.out.print("COMPUTER APPLICATIONS                           "+s.tcomp+"     ");
        digitName(s.tcomp);
        
        System.out.println();
        System.out.println();
        System.out.println("Internal Assessment-");
        System.out.println("SUPW & COMMUNITY SERVICE                        "+s.supw);
        System.out.println(s.name+" is ");passOrFail(s.per);
        System.out.println();
        System.out.println();
        System.out.println("EXAMINATION OF MARCH 2014");
        System.out.println("Date of Birth as certified by the Head of the School at the time of registration:");
        System.out.println(s.dob);
        System.out.println();
        System.out.println();
        System.out.println("Chief executive & Secretary- Garry Urrathon");
    }
}

        
              
                           
                        
                
        
        
         
         
         

        
        
        
    
        