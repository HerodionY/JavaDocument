
package Modul10;

public class UnderGraduateStudent extends Student {
    public void setCourseGrade(int grade) {
        if (grade>=80) {
        this.courseGrade = "A";
            
        }
        else if(70<=grade&&grade<80){
         this.courseGrade =  "B";
        }
        else if(56<=grade&&grade<70){
        this.courseGrade = "C";
         }
        else if(45<=grade&&grade<56){
         this.courseGrade =  "D";
          }
        else if(grade<45){
        this.courseGrade =  "E";
                }
        
    
    
    }
    
    @Override
    public String getCourseGrade() {
        
 return courseGrade;
 }

}
