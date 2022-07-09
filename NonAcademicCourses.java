

public class NonAcademicCourses extends Course 
{
   //Attributes
   private String instructorName;
   private int Duration;
   private String startingDate;
   private String completionDate;
   private String examDate;
   private String prerequisite;
   private boolean isRegistered;
   private boolean isRemoved;
   
   //Create a constructor with parameters as CourseID,CourseName,Duration, prerequisite
   // call the super class for the values of the attributes CourseID, CourseName,Duration
    //Assign the value of the parameters to the attribbubtes
   public NonAcademicCourses(String CourseID, String CourseName, int Duration, String prerequisite){
        super(CourseID, CourseName, Duration);
        this.prerequisite = prerequisite;
        this.startingDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }
    
    // Accessor methods
    public String getPrerequisite(){
        return this.prerequisite;
    }
    
    public String getStartingDate(){
        return this.startingDate;
    }
    
    public String getCompletionDate(){
        return this.completionDate;
    }
    
    public String getExamDate(){
        return this.examDate;
    }
    
    public String getInstructorName(){
        return this.instructorName;
    }
    
    public Boolean getIsRegistered(){
        return this.isRegistered;
    }
    
    public Boolean getIsRemoved(){
        return this.isRemoved;
    }
    
    public String getCourseID(){
        return super.getCourseID();
    }
    
    public String getCourseName(){
        return super.getCourseName();
    }
    
    public int getDuration(){
        return super.getDuration();
    }
    //  set instructor name
    public void setInstructorName(String Name){
        if(getIsRegistered()){
            System.out.println("Instructor has already been registered. It is not possible to change instructors");
        }else{
            this.instructorName = Name;
        }
    }
    
    //For registering non academic course
    //has 5 parameters
    //course leader name, instructor name, starting date, completion date and exam date  
    public void register(String CourseLeader, String InstructorName, String StartingDate, String CompletionDate, String ExamDate){
            if(getIsRegistered()){
                System.out.println("Course has already been registered");
            }else{
                this.isRegistered = true;
                this.instructorName = InstructorName;
                super.setCourseLeader(CourseLeader);
                this.startingDate = StartingDate;
                this.completionDate = CompletionDate;
                this.examDate = ExamDate;
            }
                
    }
    
    public void Remove(){
        if(getIsRemoved()){
            System.out.println("Course has already been removed");
        }else{
            super.setCourseLeader("");
            this.startingDate = "";
            this.completionDate = "";
            this.examDate = "";
            this.instructorName = "";
            this.isRegistered = false;
            this.isRemoved = true;
            //method to set the the course leader name in parent class is called with "" (empty string) as parameter
            // the instructor name, starting date, completion date and exam date is set to ""
            //the status of isRegistered is set to false
            //isRemoved status is set to true
        }
    }
    
    //create a method to display the values of the attributes of this class
    public void display(){
        super.display();
        if(isRegistered = true){
            System.out.println("The instructor name is" + instructorName);
            System.out.println("The starting date of the course is " + startingDate);
            System.out.println("The completion date of the course is " + completionDate);
            System.out.println("The exam date of the course is " + examDate);
        }
        
        //must have same signature as the display methid in Course class
        //call display method in Course class
        // to display courseID, courseName and duration
        
        //If the non-academic course is already registered then instructor name, starting date, completion date and exam date must also be displayed.
        //no need to display if isRegistered is false
    }
}
