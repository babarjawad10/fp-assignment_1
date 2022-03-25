import java.util.Scanner;
/**
 * Write a description of class Assignment1 here.
 *
 * @author (Babar jawad)
 * @version (a version number or a date)
 */
public class Assignment1
{
    // instance variables - 
    private String unitName; // declare variable for storing value for unit name 
    private int[] studentMarks; //array to store students marks 
    private int temp;      //for store temporary values  
    private boolean check; // for conditaion validation 
    

    /**
     * Constructor for objects of class Assignment1
     */
    public Assignment1()
    {
        // initialise instance variables
        studentMarks=new int[25]; // dynamically alocating the memory to array
        check=true; // store the value true
        
    }// endof constructor
    
    
    /**
     * Method getUnitName
     * take the input from user and store the input in unitName 
     */
    public void getUnitName(){
        System.out.println("Please Enter unit name");
        unitName = new Scanner(System.in).nextLine();
    }// endof getUnitName
    
    
    
    /**
     * Method getStudentMarks
     * take input of 25 students from user and store into studentMarks array
     * also only take input from 0 to 100 interger number only 
     */
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
    
    /**
     * Method findHighestLowestMarks
     * find the highest and lowest marks using linear search
     */
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
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("The highest mark is:"+ highestMark);
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("The lowest mark is:"+lowestMark);
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        
}// endof findHighestLowestMarks


/**
 * Method findMeanAndStandardDeviationOfStudnetMarks
 * calculate mean and standard deviation of studentMarks array
 *
 */
public void findMeanAndStandardDeviationOfStudnetMarks(){
    double sum=0,mean;
    
    for(int i=0;i<studentMarks.length;i++) 
    {
        sum=sum+studentMarks[i];
    }
    mean=sum/studentMarks.length;
    
           System.out.println("Mean of student Marks is :"+mean);
           System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
           
           
        sum=0;  
    for(int i=0;i<studentMarks.length;i++) 
    {
        sum=sum+Math.pow((studentMarks[i]-mean),2);
    
    }
    mean=sum/(studentMarks.length-1);
    double standradDeviation=Math.sqrt(mean);
    System.out.format("Standard deviation of student marks : %.6f",standradDeviation);
    
   
    
}//endof findMeanAndStandardDeviationOfStudnetMarks


    
    /**
     * Method printUnitName
     * display unit name 
     *
     */
    public void printUnitName(){
        System.out.println("The Unit Name is:  "+unitName);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    /**
     * Method printStudentMarks
     * display valid students marks 
     *
     */
    public void printStudentMarks(){
        System.out.println("Student marks you entered are: ");
        for(int i=0;i<25;i++){
            System.out.println(studentMarks[i]);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        
    }
        
    public static void main(String[] args){
        Assignment1 myObj=new Assignment1(); // create object of Assignment class 
        
        myObj.getUnitName();
        myObj.getStudentMarks();
        myObj.printUnitName();
        myObj.printStudentMarks();   
        myObj.findHighestLowestMarks();
        myObj.findMeanAndStandardDeviationOfStudnetMarks();
        
        
    }// end of main
    
    
    
    
    
   
}//end of class Assignment1
