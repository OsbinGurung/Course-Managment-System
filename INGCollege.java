import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class INGCollege 
{
    private JFrame f;
    private JTabbedPane tabbedPane;
    private Font tabbedPaneFont, f1,f2,f3;
    private JPanel AcTab,AcTabPanel,naCourseTab ,naCourseTabPanel;
    private JLabel acCourseID, acCourseName,level,acCourseDuration,numberOfAssessments,credit ,acCourseIDRegister ,lecturerNameRegister , acCourseLeaderRegister,startingDateRegister, completionDateRegister ;
    private JLabel naCourseID, naCourseName,prerequisite ,naCourseDuration,naCourseIDRegister ,instructorNameRegister ,examDate ,naCourseLeaderRegister, startDateRegister ,naCompletionDateRegister,DateRegister ;
    private JTextField acCourseIDText,acCourseNameText,levelText,acCourseDurationText,numberOfAssessmentsText,creditText,acCourseIDTextRegister ,lecturerNameTextRegister,acCourseLeaderTextRegister ,startingDateTextRegister, completionDateRegisterText;
    private JTextField naCourseIDText,naCourseNameText,prerequisiteText ,naCourseDurationText,naCourseIDTextRegister ,instructorNameTextRegister ,examDateText ,naCourseLeaderTextRegister ,startDateTextRegister ,naCompletionDateRegisterText;
    private JButton AcAdd,AcRegister,AcDisplay ,AcClear,naAdd,naRegister,naDisplay,naClear;
    
    private ArrayList<Course> nonAcademicCourseList,academicCourseList;
    
    public static void main(String Args[]){
        INGCollege GUI = new INGCollege();
        GUI.INGCollege();
    }
    
    public  void INGCollege(){
    
        f = new JFrame("ING College");
        f.setBounds(100,50,1200,800);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        
        //tabbed pane for the gui
        tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        //font for tabs in tabbedPane
        tabbedPaneFont = new Font("Arial",Font.BOLD,16);
        tabbedPane.setFont(tabbedPaneFont);
        
        //font for the title of the panel
        f1 = new Font("Arial",Font.BOLD,30);
        
        //font for the JLabel 
        f2 = new Font("Arial",Font.BOLD,18);
        
        //font for the text in JTextField
        f3 = new Font("Arial",Font.PLAIN,16);
        
        //-----------------------------------------------------------------------------for add academic course --------------------------------------------------------
        //panel for academic course tab
        JPanel AcTab = new JPanel();
        AcTab.setLayout(null);
        
        //panel for the attributes of ACTab
        AcTabPanel = new JPanel();
        AcTabPanel.setBounds(0,0,1000,700);
        AcTabPanel.setLayout(null);
        
        
        //label for the Academic course title
        JLabel academicCourse = new JLabel("Academic Course");
        
        //setting the bounds for the label  academic course
        academicCourse.setBounds(350,10,280,50);
        academicCourse.setFont(f1);
        AcTabPanel.add(academicCourse);
        
        //Label for the course ID
        acCourseID = new JLabel("Course ID:");
        acCourseID.setBounds(100,90,140,50);
        
        acCourseID.setFont(f2);
        AcTabPanel.add(acCourseID);
        
        //Text field for the course ID
        acCourseIDText = new JTextField();
        acCourseIDText.setBounds(210,90,150,50);
        //font for courseIDText
        acCourseIDText.setFont(f3);
        
        //add acCourseID text to AcTabPanel
        AcTabPanel.add(acCourseIDText);
        
        //label for the course Name
        acCourseName = new JLabel("Course Name:");
        acCourseName.setBounds(430,90,140,50);
        
        //font for the course NAme
        acCourseName.setFont(f2);
        AcTabPanel.add(acCourseName);
        
        //Text field for the course Name
        acCourseNameText = new JTextField();
        acCourseNameText.setBounds(570,90,140,50);
        //set font for courseNameText
        acCourseNameText.setFont(f3);
        //add courseNameText to panel courseTabPanel
        AcTabPanel.add(acCourseNameText);
        
        //label for the level
        level = new JLabel("Level:");
        level.setBounds(750,90,60,50);
        
        //font for the level
        level.setFont(f2);
        AcTabPanel.add(level);
        
        //Text field for the level
        levelText = new JTextField();
        levelText.setBounds(820,90,150,50);
        //set font for levelText
        levelText.setFont(f3);
        
        //add levelText to panel AcTabPanel
        AcTabPanel.add(levelText);
        
        //label for the course duration
        acCourseDuration = new JLabel("Course Duration:");
        acCourseDuration.setBounds(50,170,150,50);
        
        //font for the course duration
        acCourseDuration.setFont(f2);
        AcTabPanel.add(acCourseDuration);
        
        //Text field for the course duration
        acCourseDurationText = new JTextField();
        acCourseDurationText.setBounds(210,170,120,50);
        //set font for courseDurationText 
        acCourseDurationText.setFont(f3);
        
        //add courseDurationText to panel courseTabPanel
        AcTabPanel.add(acCourseDurationText);
        
        //label for the numberOfAssessments
        numberOfAssessments = new JLabel("Number Of Assessments:");
        numberOfAssessments.setBounds(360,170,230,50);
        
        //font for the numberOfAssessments
        numberOfAssessments.setFont(f2);
        AcTabPanel.add(numberOfAssessments);
        
        //Text field for the numberOfAssessments
        numberOfAssessmentsText = new JTextField();
        numberOfAssessmentsText.setBounds(590,170,120,50);
        //set font for numberOfAssessmentsText
        numberOfAssessmentsText.setFont(f3);
        
        //add numberOfAssessmentsText to panel AcTabPanel
        AcTabPanel.add(numberOfAssessmentsText);
        
        //Label for the credit
        credit = new JLabel("credit:");
        credit.setBounds(750,170,150,50);
        
        //font for the course leader
        credit.setFont(f2);
        AcTabPanel.add(credit);
        
        //Text field for the credit
        creditText = new JTextField();
        creditText.setBounds(820,170,150,50);
        //set font for creditText
        creditText.setFont(f3);
    
        //add creditText to panel AcTabPanel
        AcTabPanel.add(creditText);
        
        //button for adding the course
        AcAdd = new JButton("Add Course");
        AcAdd.setBounds(430,240,160,40);
        
        //font for the add button
        AcAdd.setFont(f2);
        AcTabPanel.add(AcAdd);
        
        nonAcademicCourseList = new ArrayList <Course>();
        ArrayList<Course> academicCourseList = new ArrayList <Course>();
        
        //------------------------------------------Action listener for add button to add values in the academic course list
        
        AcAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //try and catch to check if the entered value in the textfield is of correct type or not
                try{
                    String acCourseID = acCourseIDText.getText();
                    String acCourseName =  acCourseNameText.getText();
                    int acDuration = Integer.parseInt(acCourseDurationText.getText());
                    int acNumberOfAssessment = Integer.parseInt(numberOfAssessmentsText.getText());
                    String credit = creditText.getText();
                    String Level = levelText.getText();
                }catch(Exception E){
                    //check if textfield is empty of not or incorrect data type entered
                    if (acCourseIDText.getText().isEmpty() || acCourseDurationText.getText().isEmpty() || numberOfAssessmentsText.getText().isEmpty() || creditText.getText().isEmpty() ||acCourseNameText.getText().isEmpty() || levelText.getText().isEmpty() ){
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"Please fill all the fields");
                    }else{
                        //disply message saying to enter correct data tyoe
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"Please enter interger values in dration and number of assessments fields");
                    
                    }
                }
                
                // store the values from the textfields 
                String acCourseID = acCourseIDText.getText();
                String acCourseName =  acCourseNameText.getText();
                int acDuration = Integer.parseInt(acCourseDurationText.getText());
                int acNumberOfAssessment = Integer.parseInt(numberOfAssessmentsText.getText());
                String credit = creditText.getText();
                String Level = levelText.getText();
                
                //check if textfield is empty of not
                if(acCourseIDText.getText().isEmpty() || acCourseDurationText.getText().isEmpty() || numberOfAssessmentsText.getText().isEmpty() || creditText.getText().isEmpty()||acCourseNameText.getText().isEmpty() || levelText.getText().isEmpty() ){
                    Frame valueCheck = new JFrame();
                    JOptionPane.showMessageDialog(valueCheck,"Please fill all the fields");
                }else{
                    for (Course c : academicCourseList){
                        if(c.getCourseID().equals(acCourseIDText.getText())){
                            //display message for already added course
                            JFrame valueCheck = new JFrame();
                            JOptionPane.showMessageDialog(valueCheck,"The course has already been added.Please enter another courseID");
                            return;
                        }
                    }
                    //create a new object of academicCourses
                    //pass the values acCourseID,acCourseName,acDuration,Level,acNumberOfAssessment,credit through the constructors as arguments
                    AcademicCourses ac = new AcademicCourses(acCourseID,acCourseName,acDuration,Level,acNumberOfAssessment,credit);
                    academicCourseList.add(ac);
                    //display message that the course has been added    
                    JFrame valueCheck = new JFrame();
                    JOptionPane.showMessageDialog(valueCheck,"The course has been added.");
                }
                
                acCourseIDText.setText("");
                acCourseNameText.setText("");
                acCourseDurationText.setText("");
                numberOfAssessmentsText.setText("");
                creditText.setText("");
                levelText.setText("");
                }
            });
        
        //-----------------------------------------------------------Register part of Academic course---------------------------------------------------------------
        
        //Label for the course ID
        acCourseIDRegister = new JLabel("Course ID:");
        acCourseIDRegister.setBounds(100,330,140,50);
        
        acCourseIDRegister.setFont(f2);
        AcTabPanel.add(acCourseIDRegister);
        
        //Text field for the course ID
        acCourseIDTextRegister = new JTextField();
        acCourseIDTextRegister.setBounds(210,330,150,50);
        //font for courseIDText
        acCourseIDTextRegister.setFont(f3);
        
        //add acCourseID text to AcTabPanel
        AcTabPanel.add(acCourseIDTextRegister);
        
        //label for the lecturer Name
        lecturerNameRegister = new JLabel("Lecturer Name:");
        lecturerNameRegister.setBounds(400,330,140,50);
        
        //font for the lecturer NAme
        lecturerNameRegister.setFont(f2);
        AcTabPanel.add(lecturerNameRegister);
        
        //Text field for the course Name
        lecturerNameTextRegister = new JTextField();
        lecturerNameTextRegister.setBounds(560,330,140,50);
        //set font for courseNameText
        lecturerNameTextRegister.setFont(f3);
        //add courseNameText to panel courseTabPanel
        AcTabPanel.add(lecturerNameTextRegister);
        
        //Label for the course Leader
         acCourseLeaderRegister = new JLabel("Course Leader :");
        acCourseLeaderRegister.setBounds(50,410,140,55);
        
        //font for the course leader
        acCourseLeaderRegister.setFont(f2);
        AcTabPanel.add(acCourseLeaderRegister);
        
        //Text field for the course leader
        acCourseLeaderTextRegister = new JTextField();
        acCourseLeaderTextRegister.setBounds(210,410,150,50);
        //set font for courseLeaderText
        acCourseLeaderTextRegister.setFont(f3);
        
        //add courseLeaderText to panel courseTabPanel 
        AcTabPanel.add(acCourseLeaderTextRegister);
        
        //label for the startingDate
        startingDateRegister = new JLabel("Starting Date:");
        startingDateRegister.setBounds(400,410,150,50);
        
        //font for the startingDate
        startingDateRegister.setFont(f2);
        AcTabPanel.add(startingDateRegister);
        
        //Text field for the startingDatetext
         startingDateTextRegister = new JTextField();
        startingDateTextRegister.setBounds(540,410,120,50);
        //set font for startingDatetext
        startingDateTextRegister.setFont(f3);
        
        //add startingDatetext to panel courseTabPanel
        AcTabPanel.add(startingDateTextRegister);
        
        //Label for the completionDate
        completionDateRegister = new JLabel("Completion Date:");
        completionDateRegister.setBounds(680,410,150,50);
        
        //font for the completionDate
        completionDateRegister.setFont(f2);
        AcTabPanel.add(completionDateRegister);
        
        //Text field for the completionDateRegister text
        JTextField completionDateRegisterText = new JTextField();
        completionDateRegisterText.setBounds(840,410,120,50);
        //set font for completionDateRegister text
        completionDateRegisterText.setFont(f3);
        
        AcTabPanel.add(completionDateRegisterText);
        
        //button for registering the course
        AcRegister = new JButton("Register Course");
        AcRegister.setBounds(420,480,180,40);
        
        //font for the register button
        AcRegister.setFont(f2);
        AcTabPanel.add(AcRegister);
        
        //----------------------------------------------------------------------actionListener for the registering the Academic course------------------------------------------
        
        AcRegister.addActionListener(new ActionListener(){
            //override
            public void actionPerformed(ActionEvent e){
                //try and catch to check if the entered value is if correct type
                try{
                    String acCourseIDRegister = acCourseIDTextRegister.getText();
                    String acCourseLeaderRegister =  acCourseLeaderTextRegister.getText();
                    String acLecturerNameRegister = lecturerNameTextRegister.getText();
                    String acStartingDateRegister = startingDateTextRegister.getText();
                    String acCompletionDateRegister = completionDateRegisterText.getText();
                }catch(Exception E){
                    if ( acCourseIDTextRegister.getText().isEmpty() || acCourseLeaderTextRegister.getText().isEmpty() || lecturerNameTextRegister.getText().isEmpty() || startingDateTextRegister.getText().isEmpty() ||completionDateRegisterText.getText().isEmpty()){
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"Please fill all the fields");
                    }
                }
                //store the values from the textfields
                String acCourseIDRegister = acCourseIDTextRegister.getText();
                String acCourseLeaderRegister =  acCourseLeaderTextRegister.getText();
                String acLecturerNameRegister = lecturerNameTextRegister.getText();
                String acStartingDateRegister = startingDateTextRegister.getText();
                String acCompletionDateRegister = completionDateRegisterText.getText();

                //check if there is any empty textfields
                if ( acCourseIDTextRegister.getText().isEmpty() || acCourseLeaderTextRegister.getText().isEmpty() || lecturerNameTextRegister.getText().isEmpty() || startingDateTextRegister.getText().isEmpty() ||completionDateRegisterText.getText().isEmpty()){
                    JFrame valueCheck = new JFrame();
                    JOptionPane.showMessageDialog(valueCheck,"Please fill all the fields");
                }else{
                    // check if there are any courses that has been added
                    if ( academicCourseList.size() > 0){
                    // for loop to register the course
                         for(int i = 0; i< academicCourseList.size(); i++){
                             // check if the entered courseID is valid or not
                            if(academicCourseList.get(i).getCourseID().equals(acCourseIDTextRegister.getText())){
                                //downcast the object in academicCourseList.get(i) to type AcademicCourses
                                AcademicCourses ac = (AcademicCourses) academicCourseList.get(i);
                                
                                //check if the course has been registered or not
                                if(!ac.getIsRegistered()){
                                    //if not registered, register course
                                    //call register method
                                   ac.register(acCourseLeaderRegister,acLecturerNameRegister,acStartingDateRegister,acCompletionDateRegister);
                                    //display message saying the course has been registered
                                    JFrame valueCheck = new JFrame();
                                    JOptionPane.showMessageDialog(valueCheck,"The academic course has been registered");
                                }else if(ac.getIsRegistered()){
                                    //display message that the course has alreafy been registered
                                    JFrame valueCheck = new JFrame();
                                    JOptionPane.showMessageDialog(valueCheck,"The academic course has already been registered");
                                }
                            }else{
                                JFrame valueCheck = new JFrame();
                                JOptionPane.showMessageDialog(valueCheck,"Please enter valid course ID");
                            }
                    }
                    } else{
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"Please add a course first ");
                    }
                       
                }
                acCourseIDTextRegister.setText("");
                acCourseLeaderTextRegister.setText("");
                lecturerNameTextRegister.setText("");
                startingDateTextRegister.setText("");
                completionDateRegisterText.setText("");
            }
        });
        
        //button for displaying the course
        AcDisplay = new JButton("Display");
        AcDisplay.setBounds(350,600,120,40);
        
        //font for the clear button
        AcDisplay.setFont(f2);
        AcTabPanel.add(AcDisplay);
        
        AcDisplay.addActionListener(new ActionListener(){
            //override
            public void actionPerformed(ActionEvent e){
                //create frame to display the registered course
                JFrame displayFrame = new JFrame("Academic Course");
                displayFrame.setBounds(100,50,1200,400);
                
                
                DefaultTableModel tableModel = new DefaultTableModel(); 
                //table creation
                JTable table = new JTable(tableModel); 
                //columns in table
                tableModel.addColumn("Course ID");
                tableModel.addColumn("Course Name");
                tableModel.addColumn("Duration");
                tableModel.addColumn("Course Leader");
                tableModel.addColumn("Number of Asessments");
                tableModel.addColumn("Lecturer Name");
                tableModel.addColumn("Starting Date");
                tableModel.addColumn("Completion Date");
                tableModel.addColumn("level");
                tableModel.addColumn("credit");
                //colum header
                String rowTitleList[] = {"Course ID","Course Name","Duration","Course Leader","Number of Asessments","Lecturer Name","Starting Date","Completion Date","level","credit"};
                
                tableModel.addRow(rowTitleList);
                
                //for the rows of the table
                for(int i = 0; i < academicCourseList.size(); i++){
                    //downcast the objects in the list to AcademicCourses
                    AcademicCourses ac = (AcademicCourses)(academicCourseList.get(i));
                    //call methods to get the values and store them
                    String courseID = ac.getCourseID();
                    String courseName = ac.getCourseName();
                    String duration = String.valueOf(ac.getDuration());
                    String courseLeader = ac.getCourseLeader();
                    String numberofAssesment = String.valueOf(ac.getNumberOfAssessments());
                    String instructor = ac.getLecturerName();
                    String startDate = ac.getStartingDate();
                    String completionDate = ac.getCompletionDate();
                    String level = ac.getLevel();
                    String credit = ac.getCredit();
                    //add the values to a list
                    String tableRow[] = {courseID,courseName,duration,courseLeader,numberofAssesment,instructor,startDate,completionDate,level,credit};
                    //add the list as a row to the tableModel
                    tableModel.addRow(tableRow);
                }    
                
                displayFrame.add(table);        
               
                displayFrame.setVisible(true);    
        
            }
        });
        
        //button for clearing the course
         AcClear = new JButton("Clear");
        AcClear.setBounds(510,600,120,40);
        
        //font for the clear button
        AcClear.setFont(f2);
        AcTabPanel.add(AcClear);
        
        //actionListener for academic course clear button
        AcClear.addActionListener(new ActionListener(){
            //override
            public void actionPerformed(ActionEvent e){
                for(int i = 0; i< academicCourseList.size(); i++ ){
                    //downcast the objects in the list to AcademicCourses
                    AcademicCourses ac = (AcademicCourses)(academicCourseList.get(i));
                    //check if the courseID entered is valid 
                    if( ac.getCourseID().equals(acCourseIDTextRegister.getText()) ){
                        //remove the object from the list
                        academicCourseList.remove(i);
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"The course has been successfully removed");
                    }else{
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"Please enter registered courseID in the fields.");
                    }
                }
            }
        });
                
        //add AcTabPanel to AcTab
        AcTab.add(AcTabPanel);
        //add AcTab to tabbedPane
        tabbedPane.addTab("Academic Course", AcTab);
        
        //---------------------------------------------------------------------------Non Academic Course---------------------------------------------------------------------
        //panel for the tab of tabbedPane
        naCourseTab = new JPanel();
        naCourseTab.setLayout(null);
        
        //panel for the attributes of Non Academic Course in NaCourseTab Panel
         naCourseTabPanel = new JPanel();
        naCourseTabPanel.setLayout(null);
        naCourseTabPanel.setBounds(0,0,1000,650);
        
        //label for the Academic course title
        JLabel naCourse = new JLabel("Non-Academic Course");
        naCourse.setFont(f1);
        
        //setting the bounds for the label  academic course
        naCourse.setBounds(250,10,350,50);
        naCourseTabPanel.add(naCourse);
        
        //Label for the course ID
        naCourseID = new JLabel("Course ID:");
        naCourseID.setBounds(100,90,140,50);
        
        naCourseID.setFont(f2);
        naCourseTabPanel.add(naCourseID);
        
        //Text field for the course ID
        naCourseIDText = new JTextField();
        naCourseIDText.setBounds(210,90,150,50);
        //font for courseIDText
        naCourseIDText.setFont(f3);
        
        //add acCourseID text to AcTabPanel
        naCourseTabPanel.add(naCourseIDText);
        
        //label for the course Name
        naCourseName = new JLabel("Course Name:");
        naCourseName.setBounds(430,90,140,50);
        
        //font for the course NAme
        naCourseName.setFont(f2);
        naCourseTabPanel.add(naCourseName);
        
        //Text field for the course Name
         naCourseNameText = new JTextField();
        naCourseNameText.setBounds(570,90,140,50);
        //set font for courseNameText
        naCourseNameText.setFont(f3);
        //add courseNameText to panel courseTabPanel
        naCourseTabPanel.add(naCourseNameText);
        
        //Label for the prerequisite
        prerequisite = new JLabel("Prerequisite :");
        prerequisite.setBounds(75,170,140,55);
        
        //font for the prerequisite
        prerequisite.setFont(f2);
        naCourseTabPanel.add(prerequisite);
        
        //Text field for the prerequisite
        prerequisiteText = new JTextField();
        prerequisiteText.setBounds(210,170,150,50);
        //set font for prerequisite
        prerequisiteText.setFont(f3);
        
        //add prerequisiteText to panel courseTabPanel 
        naCourseTabPanel.add(prerequisiteText);
        
        //label for the course duration
         naCourseDuration = new JLabel("Course Duration:");
        naCourseDuration.setBounds(430,170,150,50);
        
        //font for the course duration
        naCourseDuration.setFont(f2);
        naCourseTabPanel.add(naCourseDuration);
        
        //Text field for the course duration
        naCourseDurationText = new JTextField();
        naCourseDurationText.setBounds(590,170,120,50);
        //set font for courseDurationText 
        naCourseDurationText.setFont(f3);
        
        //add courseDurationText to panel courseTabPanel
        naCourseTabPanel.add(naCourseDurationText);
        
        //button for adding the course
        naAdd = new JButton("Add");
        naAdd.setBounds(550,240,160,40);
        
        //---------------------------------------------------ActionListener for add button to add course in nonacademic course
        
        naAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //try and catch to check if the entered value in the textfield is of correct type or not
                try{
                    String naCourseID = naCourseIDText.getText();
                    String nacourseName =  naCourseNameText.getText();
                    int naDuration = Integer.parseInt(naCourseDurationText.getText());
                    String prerequisite = prerequisiteText.getText();
                    
                }catch(Exception E){
                    // check if the textfields are empty
                    if (naCourseIDText.getText().isEmpty() || naCourseDurationText.getText().isEmpty() || naCourseNameText.getText().isEmpty() || prerequisiteText.getText().isEmpty() ){
                        //display message to fill all the tieds
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"Please fill all the fields");
                    }else{
                        //display message to enter correct data types in the textfields
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"Please enter interger values in duration fields");
                    
                    }
                }
                //store the values of the textfields
                String naCourseID = naCourseIDText.getText();
                String nacourseName =  naCourseNameText.getText();
                int naDuration = Integer.parseInt(naCourseDurationText.getText());
                String prerequisite = prerequisiteText.getText();
                
                // check if the textfields are empty
                if(naCourseIDText.getText().isEmpty() || naCourseDurationText.getText().isEmpty() || naCourseNameText.getText().isEmpty() || prerequisiteText.getText().isEmpty() ){
                    //display message to fill all the tieds
                    Frame valueCheck = new JFrame();
                    JOptionPane.showMessageDialog(valueCheck,"Please fill all the fields");
                }else{
                    for (Course c : nonAcademicCourseList){
                        //check if the course has already been added or not
                        if(c.getCourseID().equals(naCourseIDText.getText())){
                            //display message if the course has already been added
                            JFrame valueCheck = new JFrame();
                            JOptionPane.showMessageDialog(valueCheck,"The course has already been added. Please enter another courseID");
                            return;
                        }
                    }
                    //create an object of NonAcademicCourses class
                    //pass the variables to the constructor as arguments or attributes
                    NonAcademicCourses nac = new NonAcademicCourses(naCourseID,nacourseName,naDuration,prerequisite);
                    nonAcademicCourseList.add(nac);
                    //display message to show that the course has been added  
                    JFrame valueCheck = new JFrame();
                    JOptionPane.showMessageDialog(valueCheck,"The course has been added.");
                
                }
                naCourseIDText.setText("");
                naCourseNameText.setText("");
                naCourseDurationText.setText("");
                prerequisiteText.setText("");
            }
        });
        
        //font for the add button
        naAdd.setFont(f2);
        naCourseTabPanel.add(naAdd);
        
        //--------------------------------------for non-academic course register portion-----------------------------------------------------------------------------------
        
        //Label for the course ID
        naCourseIDRegister = new JLabel("Course ID:");
        naCourseIDRegister.setBounds(100,330,140,50);
        
        naCourseIDRegister.setFont(f2);
        naCourseTabPanel.add(naCourseIDRegister);
        
        //Text field for the course ID
        naCourseIDTextRegister = new JTextField();
        naCourseIDTextRegister.setBounds(210,330,150,50);
        //font for courseIDText
        naCourseIDTextRegister.setFont(f3);
        
        //add naCourseID text to AcTabPanel
        naCourseTabPanel.add(naCourseIDTextRegister);
        
        //label for the instructor naem
        instructorNameRegister = new JLabel("instructor Name:");
        instructorNameRegister.setBounds(400,330,200,50);
        
        //font for the instructor NAme
        instructorNameRegister.setFont(f2);
        naCourseTabPanel.add(instructorNameRegister);
        
        //Text field for the instructor Name
         instructorNameTextRegister = new JTextField();
        instructorNameTextRegister.setBounds(550,330,140,50);
        //set font for instructorNameText
        instructorNameTextRegister.setFont(f3);
        //add instructorNameText to panel courseTabPanel
        naCourseTabPanel.add(instructorNameTextRegister);
        
        //label for the examDate
         examDate = new JLabel("Exam Date:");
        examDate.setBounds(700,330,100,50);
        
        //font for the examDate
        examDate.setFont(f2);
        naCourseTabPanel.add(examDate);
        
        //Text field for the examDate
         examDateText = new JTextField();
        examDateText.setBounds(820,330,150,50);
        //set font for examDateText
        examDateText.setFont(f3);
        
        //add examDateText to panel AcTabPanel
        naCourseTabPanel.add(examDateText);
        
        //Label for the course Leader
        naCourseLeaderRegister = new JLabel("Course Leader :");
        naCourseLeaderRegister.setBounds(50,410,140,55);
        
        //font for the course leader
        naCourseLeaderRegister.setFont(f2);
        naCourseTabPanel.add(naCourseLeaderRegister);
        
        //Text field for the course leader
         naCourseLeaderTextRegister = new JTextField();
        naCourseLeaderTextRegister.setBounds(210,410,150,50);
        //set font for courseLeaderText
        naCourseLeaderTextRegister.setFont(f3);
        
        //add courseLeaderText to panel courseTabPanel 
        naCourseTabPanel.add(naCourseLeaderTextRegister);
        
        //label for the start Date
         startDateRegister = new JLabel("Start Date:");
        startDateRegister.setBounds(400,410,150,50);
        
        //font for the startDate
        startDateRegister.setFont(f2);
        naCourseTabPanel.add(startDateRegister);
        
        //Text field for the startDatetext
         startDateTextRegister = new JTextField();
        startDateTextRegister.setBounds(520,410,120,50);
        //set font for startDatetext
        startDateTextRegister.setFont(f3);
        
        //add startDatetext to panel courseTabPanel
        naCourseTabPanel.add(startDateTextRegister);
        
        //Label for the completionDate
        naCompletionDateRegister = new JLabel("Completion Date:");
        naCompletionDateRegister.setBounds(660,410,150,50);
        
        //font for the completionDate
        naCompletionDateRegister.setFont(f2);
        naCourseTabPanel.add(naCompletionDateRegister);
        
        //Text field for the naCompletionDateRegister text
        naCompletionDateRegisterText = new JTextField();
        naCompletionDateRegisterText.setBounds(820,410,120,50);
        
        //set font for naCompletionDateRegister text
        naCompletionDateRegisterText.setFont(f3);
        
        //add naCompletionDateRegisterText to panel naCourseTabPanel
        naCourseTabPanel.add(naCompletionDateRegisterText);
        
        //button for registering the course
        naRegister = new JButton("Register Course");
        naRegister.setBounds(420,480,180,40);
        
        //font for the register button
        naRegister.setFont(f2);
        naCourseTabPanel.add(naRegister);
        
        //-----------------------------------------for registering the non academicc course----------------------------------------------------------------------------------
        
        naRegister.addActionListener(new ActionListener(){
            //override
            public void actionPerformed(ActionEvent e){
                //check if the values entered is of correct type
                try{
                    String naCourseIDRegister = naCourseIDTextRegister.getText();
                    String naCourseLeaderRegister =  naCourseLeaderTextRegister.getText();
                    String instructorNameRegister = instructorNameTextRegister.getText();
                    String naStartingDateRegister = startDateTextRegister.getText();
                    String naCompletionDateRegister = naCompletionDateRegisterText.getText();
                    String naExamDateRegister = examDateText.getText();
                }catch(Exception E){
                    //check if the fields are not empty
                    if ( naCourseIDTextRegister.getText().isEmpty() || naCourseLeaderTextRegister.getText().isEmpty() ||  instructorNameTextRegister.getText().isEmpty() || startDateTextRegister.getText().isEmpty() ||naCompletionDateRegisterText.getText().isEmpty()||examDateText.getText().isEmpty()){
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"Please fill all the fields");
                    }
                }
                // store the values entered in the textfields
                String naCourseIDRegister = naCourseIDTextRegister.getText();
                String naCourseLeaderRegister =  naCourseLeaderTextRegister.getText();
                String instructorNameRegister = instructorNameTextRegister.getText();
                String naStartingDateRegister = startDateTextRegister.getText();
                String naCompletionDateRegister = naCompletionDateRegisterText.getText();
                String examDateRegister = examDateText.getText();

                //check if the entered values are empty or not                
                if ( naCourseIDTextRegister.getText().isEmpty() || naCourseLeaderTextRegister.getText().isEmpty() ||  instructorNameTextRegister.getText().isEmpty() || startDateTextRegister.getText().isEmpty() ||naCompletionDateRegisterText.getText().isEmpty()||examDateText.getText().isEmpty()){
                    //display message to fill all the fields
                    JFrame valueCheck = new JFrame();
                    JOptionPane.showMessageDialog(valueCheck,"Please fill all the fields");
                }else{
                    //check if there is any course added to nonAcademicCourseList
                    if(nonAcademicCourseList.size() > 0){
                        //for loop to register the course
                        for(int i = 0; i< nonAcademicCourseList.size(); i++){
                            //check if the courseID has been added to the nonAcademicCourseList 
                            if(nonAcademicCourseList.get(i).getCourseID().equals(naCourseIDTextRegister.getText())){
                                //downcast the object to the type of NonAcademicCourses
                                NonAcademicCourses nac = (NonAcademicCourses) nonAcademicCourseList.get(i);
                                //check if the course has been registered or not
                                if(!nac.getIsRegistered()){
                                    //call the register method
                                    nac.register(naCourseLeaderRegister,instructorNameRegister,naStartingDateRegister,naCompletionDateRegister,examDateRegister);
                                    //dispplay message that he course has been registered
                                    JFrame valueCheck = new JFrame();
                                    JOptionPane.showMessageDialog(valueCheck,"The academic course has been registered");
                                }else if(nac.getIsRegistered()){
                                    //display that the coursehas already registered
                                    JFrame valueCheck = new JFrame();
                                    JOptionPane.showMessageDialog(valueCheck,"The academic course has already been registered");
                                }
                            }else{
                                //display message to enter valid courseID
                                JFrame valueCheck = new JFrame();
                                JOptionPane.showMessageDialog(valueCheck,"Please enter valid course ID");
                            }
                    
                    }
                    } else {
                        //diplay message to add a course first
                        JFrame valueCheck = new JFrame();
                        JOptionPane.showMessageDialog(valueCheck,"Please add a course first");
                    
                    }
                }
            }
        });
        
        //button for displaying the course
        naDisplay = new JButton("Display");
        naDisplay.setBounds(350,600,120,40);
        
        //font for the clear button
        naDisplay.setFont(f2);
        naCourseTabPanel.add(naDisplay);
        
        naDisplay.addActionListener(new ActionListener(){
            //override
            public void actionPerformed(ActionEvent e){
                //create a frame for the table
                JFrame displayFrame = new JFrame("Non Academic Course");
                displayFrame.setBounds(100,50,1200,400); 
                
                //create a table model
                DefaultTableModel tableModel = new DefaultTableModel(); 
                //table creation
                JTable table = new JTable(tableModel); 
                //columns in table
                tableModel.addColumn("Course ID");
                tableModel.addColumn("Course Name");
                tableModel.addColumn("Duration");
                tableModel.addColumn("Prerequisite");
                tableModel.addColumn("Course Leader");
                tableModel.addColumn("Instructor Name");
                tableModel.addColumn("Starting Date");
                tableModel.addColumn("Completion Date");
                tableModel.addColumn("exam Date");
                //table header
                String rowTitleList[] = {"Course ID","Course Name","Duration","Prerequisite","Course Leader","Instructor Name","Starting Date","Completion Date","exam Date","Prerequisite"};
                //add tabel header to the tabelModel
                tableModel.addRow(rowTitleList);
                
                
                //for the rows of the table
                for(int i = 0; i < nonAcademicCourseList.size(); i++){
                    //downcast the object to NonAcademicCourses type
                    NonAcademicCourses nac = (NonAcademicCourses) (nonAcademicCourseList.get(i));
                    //call method to get values
                    String courseID = nac.getCourseID();
                    String courseName = nac.getCourseName();
                    String duration = String.valueOf(nac.getDuration());
                    String prerequisite = nac.getPrerequisite();
                    String courseLeader = nac.getCourseLeader();
                    String instructor = nac.getInstructorName();
                    String examDate = nac.getExamDate();
                    String startDate = nac.getStartingDate();
                    String completionDate = nac.getCompletionDate();
                    
                    //add the method to a list
                    String tableRow[] = {courseID,courseName,duration,prerequisite,courseLeader,instructor,startDate,completionDate,examDate};
                    // add the list to the tableModel as rows
                    tableModel.addRow(tableRow);
                    
                }             
                
                displayFrame.add(table);
                
                displayFrame.setVisible(true);    
        
            }
        });
        
        //button for clearing the course
        naClear = new JButton("Clear");
        naClear.setBounds(510,600,120,40);
        
        //font for the clear button
        naClear.setFont(f2);
        naCourseTabPanel.add(naClear);
        
        
        //actionListener for non academic course clear button
        naClear.addActionListener(new ActionListener(){
            //override
            public void actionPerformed(ActionEvent e){
               for(int i = 0; i< nonAcademicCourseList.size(); i++ ){
                    //downcast the object to NonAcademicCourses type
                    NonAcademicCourses nac = (NonAcademicCourses)(nonAcademicCourseList.get(i));
                    //check if the entered courseID is registered or not 
                    if( nac.getCourseID().equals(naCourseIDTextRegister.getText()) ){
                        //remove the courseID
                        nac.Remove();
                        nonAcademicCourseList.remove(i);
                        
                        //optionPane for showing message to the user that the course has been removed
                        JFrame removed = new JFrame();
                        JOptionPane.showMessageDialog(f,"The course has been removed.");
                        
                    }
                    else{
                        //optionPane for showing message to enter a CourseID that has been registered
                        JFrame removed = new JFrame();
                        JOptionPane.showMessageDialog(f,"Please enter valid course ID.");
                    }
                }
            }
        });
        
        //add naCourseTabPanel to naCourseTab
        naCourseTab.add(naCourseTabPanel);
        //add naCourseTab to tabbedpane
        tabbedPane.addTab("Non-Academic Course",naCourseTab);
        f.setResizable(false);
        f.add(tabbedPane);
        f.setVisible(true);
    }
    
}
