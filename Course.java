

public class Course
{
    //instance variables
    private String courseName;
    private String courseID;
    private int Duration;
    private String courseLeader;
    
    // create constructors with parameters CourseName, CourseID, duration
    //set the values of the parameters to the attributes of this class
    public  Course(String CourseID,String CourseName , int Duration){
        this.courseName = CourseName;
        this.courseID = CourseID;
        this.courseLeader = "";
        this.Duration = Duration;
    }
    
    // Accessor methods
    public String getCourseID(){
        return this.courseID;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public int getDuration(){
        return this.Duration;
    }
    
    public String getCourseLeader(){
        return this.courseLeader;
    }
    //method to set the CourseLeader of the class
    public void setCourseLeader(String NewCourseLeaderName){
        this.courseLeader = NewCourseLeaderName;
        
    }
    
    //method to display the attribute of this class
    public  void display(){
        System.out.println("The course ID of this course is " + courseID);
        System.out.println("The course name of this course is " + courseName);
        System.out.println("The duration of this course is " + Duration + " weeks");
        if (courseLeader != ""){
            System.out.println("The name of the course leafer is " + courseLeader);
        }
        
    }
}


