package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
       int[] total=new int[math.length];
       if(math.length!=0 && science.length!=0 && english.length!=0) {
           for (int i = 0; i < math.length; i++) {
               total[i] = math[i] + science[i] + english[i];
           }
           return total;
       }
       else return null;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        int[] average=new int[totalMarks.length];
        if(totalMarks.length!=0 && noOfSubjects!=0){
        for (int i=0;i<totalMarks.length;i++){
             average[i]=totalMarks[i]/noOfSubjects;
        }
        return average;
        }
        else return null;
    }
    public int calculateAverageScienceMarks (int[] science)
    {
        int averageScience;
        int total=0;
        if(science.length!=0) {
            for (int i = 0; i < science.length; i++) {
                total = total + science[i];
            }
            averageScience = total / science.length;
            return averageScience;
        }else
            return -1;

    }
    public int calculateAverageEnglishMarks (int[] english)
    {
        int averageEnglish;
        int total=0;
        if(english.length>0){
        for (int i=0;i<english.length;i++) {
            total = total + english[i];
        }
        averageEnglish=total/english.length;
        return averageEnglish;
        }
        else
            return -1;
    }
    public int calculateAverageMathMarks (int[] math) {
        int averageMath;
        int total=0;
        if(math.length!=0) {
            for (int i = 0; i < math.length; i++) {
                total = total + math[i];
            }
            averageMath = total / math.length;
            return averageMath;
        }else return -1;
    }

    public static void main(String[] args) {
        //Object of OakBridgeSchool class is created
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Initialize the arrays with 10 values of marks for each subject
        int [] math = {88,89,100,70,60,80,35,3,25,56};
        int [] science = {80,83,99,67,56,84,38,9,32,65};
        int [] english = {90,98,100,65,54,82,40,13,45,67};
        // The total number of subjects
        int noOfSubjects = 3;
        // Initialize names of 10 Students
        String[] studentNames = {"Michel","Paul","Alex","Tina","Tom","Sam","Ria","Pam","Leena","Leo"};
        // Initialize roll numbers of 10 Students
        int [] rollNos = {102,109,101,103,104,108,110,105,106,107};
        // Call the methods to calculate total marks and average marks
        int [] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        int [] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks,noOfSubjects);
        // Display the marks and average marks of each student

        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english);
        for(int i=0;i<studentNames.length;i++){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Student Name  ::  "+studentNames[i]+  "   ||   Roll Number   ::   "+rollNos[i]);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("\n The Total Marks  -  "+totalMarks[i]+"/300");
            System.out.println("The Average Marks -  "+averageMarks[i]);
            System.out.println("-------------------------------------------------------------------");

        }

        // Display the average marks scored by the class in subjects
        System.out.println("Average Science marks scored by the class is : "+averageScienceMarks);
        System.out.println("Average Math marks scored by the class is    : "+averageMathMarks);
        System.out.println("Average English marks scored by the class is : "+averageEnglishMarks);

    }
}
