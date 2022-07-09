
public class AcademicCourses extends Course 
{
    //Instance Attributes
    private String lecturerName;
    private String Level;
    private String Credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered ;
    private String courseLeaderName;
    
    //create a constructor with attributes CourseID, CourseName, Duration, Level, NumberOfAssessments, Credit
    // call the super class for the values of the attributes CourseID, CourseName,Duration
    //Assign the value of the parameters to the attribbubtes
    
    public AcademicCourses(String CourseID, String CourseName, int Duration,String Level, int NumberOfAssessments, String Credit){
        super(CourseID, CourseName, Duration);
        this.Level = Level;
        this.numberOfAssessments = NumberOfAssessments;
        this.Credit = Credit;
        this.startingDate = "";
        this.completionDate = "";
        this.lecturerName = "";
        this.isRegistered = false;
        
    }
    
    //Accessor methods
    public String getLecturerName(){
        return this.lecturerName;
    }
    
    public String getCourseID(){
        return super.getCourseID();
    }
    
    public String getStartingDate(){
        return this.startingDate;
    }   
    
    public String getCompletionDate(){
        return this.completionDate;
    }   
    
    public void setLecturerName(String Name){
        this.lecturerName = Name;
    }
    
    public void setNumberOfAssessments(int num){
        this.numberOfAssessments = num;
    }
    
    public int getNumberOfAssessments(){
        return this.numberOfAssessments;
    }   
    
    public String getCredit(){
        return this.Credit;
    }
    
    public String getLevel(){
        return this.Level;
    }
    
    public boolean getIsRegistered(){
        return isRegistered;
    }
    
    //create method to register a course
    // parameter value should be able to input lecturer name, starting date and completion date
    //if value of getIsRegistered() is true then print message
    //else register the course
    public void register(String CourseLeader,String Lecturer, String Start, String Completion){
        if (getIsRegistered()){
            System.out.println("Course has already been registered");
            
        } else{
            super.setCourseLeader(CourseLeader);
            this.lecturerName = Lecturer;
            this.startingDate = Start;
            this.completionDate = Completion;
            this.isRegistered = true;
        } 
    }
    
    //create a method to display the values of the attributes of this class
    public void display(){
        super.display();
        if (getIsRegistered()){
        }else{
            System.out.println("The name of the lecturer for this course is "+lecturerName);
            System.out.println("The level of this course is "+Level);
            System.out.println("The credit of this course is " +Credit);
            System.out.println("The starting date of the course is " + startingDate);
            System.out.println("The completion date of this course is " + completionDate);
            System.out.println("The number of assessments given in this course is " + numberOfAssessments);
        } 
        // call the course class
        //to display courseID, courseName, duration and course leader
        // if Acourse is registered then 
        //then lecturer name,level, credit, starting date, completion date and number of assessments must also be displayed.
        
    }
}
