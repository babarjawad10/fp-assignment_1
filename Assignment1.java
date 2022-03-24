import java.util.Scanner;
/**
 * Write a description of class Assignment1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Assignment1
{
    // instance variables - replace the example below with your own
    private String unitName; // 
    private int[] studentMarks;
    private int temp;
    private boolean check;
    

    /**
     * Constructor for objects of class Assignment1
     */
    public Assignment1()
    {
        // initialise instance variables
        studentMarks=new int[25];
        check=true;
        
    }// endof constructor
    
    
    public void getUnitName(){
        System.out.println("Please Enter unit name");
        unitName = new Scanner(System.in).nextLine();
    }// endof getUnitName
    
    
    
    public void getStudentMarks(){
        System.out.println("Please enter 25 Student marks between 0-100");
        for(int i=0;i<25;i++){
            while(check){
            try{
            temp=new Scanner(System.in).nextInt();
            }// end of try
            catch(Exception e){
            System.out.println("Invalid input");
            temp=-1;
            e.printStackTrace();
        } // end of catch
            if(temp>=0 && temp<=100){
                studentMarks[i]=temp;
                check=false;
            }
            else {
                
                System.out.println("you enter worrng number.Number must be between 0-100");
                check=true;
            }
            // end of if else
            }// end of while loop
            check=true;
         }// endof for loop
        
    }// end of getStudentMarks
    
    public void findHighestLowestMarks(){
        
        int highestMark = studentMarks[0];
        int lowestMark=studentMarks[0];
        
        for(int i=1;i<studentMarks.length;i++){
            if(studentMarks[i]>highestMark){
                highestMark=studentMarks[i];
            }
            if(studentMarks[i]<lowestMark){
              lowestMark=studentMarks[i];
            }
    }//end of for loop
    
    System.out.println("The highest mark is:"+ highestMark);
    System.out.println("The lowest mark is:"+lowestMark);
        
}// endof findHighestLowestMarks


public void findMeanAndStandardDeviationOfStudnetMarks(){
    double sum=0,mean;
    
    for(int i=0;i<studentMarks.length;i++) 
    {
        sum=sum+studentMarks[i];
    }
    mean=sum/studentMarks.length;
    
           System.out.println("Mean of student Marks is :"+mean);
           
           
        sum=0;  
    for(int i=0;i<studentMarks.length;i++) 
    {
        sum=sum+Math.pow((studentMarks[i]-mean),2);
    
    }
    mean=sum/(studentMarks.length-1);
    double standradDeviation=Math.sqrt(mean);
    System.out.format("Standard deviation of student marks : %.6f",standradDeviation);
    
    
    
}//endof findMeanAndStandardDeviationOfStudnetMarks


    
    public void printUnitName(){
        System.out.println("The Unit Name is:  "+unitName);
    }
    
    public void printStudentMarks(){
        System.out.println("Student marks you entered are: ");
        for(int i=0;i<25;i++){
            System.out.println(studentMarks[i]);
        }
        
    }
        
    public static void main(String[] args){
        Assignment1 myObj=new Assignment1();
        
        myObj.getUnitName();
        myObj.getStudentMarks();
        myObj.printUnitName();
        myObj.printStudentMarks();   
        myObj.findHighestLowestMarks();
        myObj.findMeanAndStandardDeviationOfStudnetMarks();
        
        
    }// end of main
    
    
    
    
    
   
}//end of class Assignment1
