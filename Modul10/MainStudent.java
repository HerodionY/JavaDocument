
package Modul10;
import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
       Scanner user = new Scanner(System.in);
       Student student = new Student();
       int students = 0;
        System.out.println("Masukan Banyak Siswa : ");
        students=user.nextInt();
        Student[] stu=new Student[students];
        
        for (int i = 0; i < stu.length; i++) {
                System.out.println("1.UnderGraduateStudent");
                System.out.println("2. GraduateStudent");
              System.out.println("Masukan Jenis mahasiswa : ");
                 int jenisSiswa=user.nextInt();
                 if (jenisSiswa==1) {
                     stu[i] = new UnderGraduateStudent();
                     
                    
                }else if(jenisSiswa==2){
                      stu[i] = new GraduateStudent();
                     

                }
                 System.out.println("Masukan nama : ");
                 stu[i].setName(ketik());
                System.out.println("Masukan test 1 : ");
                 stu[i].setTest1(user.nextInt());
                 System.out.println("Masukan Test 2 ");
                 stu[i].setTest2(user.nextInt());
                 System.out.println("Masukan Test 3 ");
                 stu[i].setTest3(user.nextInt());
                 stu[i].setGrade(student.Grade(stu[i].getTest1(), stu[i].getTest2(), stu[i].getTest3()));
                 stu[i].setCourseGrade(stu[i].getGrade());
        }
        System.out.printf("%-6s","No : ");
        System.out.printf("%-18s","Nama : ");
        System.out.printf("%-18s","Test 1 : ");
        System.out.printf("%-18s","Test 2 : ");
        System.out.printf("%-18s","Test 3 : ");
        System.out.printf("%-18s","Course  ");
        System.out.println("");
        for (int i = 0; i < stu.length; i++) {
         System.out.printf("%-6s",i+1);
        System.out.printf("%-18s",stu[i].getName());
        System.out.printf("%-18s",stu[i].getTest1());
        System.out.printf("%-18s",stu[i].getTest2());
        System.out.printf("%-18s",stu[i].getTest3());
        System.out.printf("%-18s",stu[i].getCourseGrade());
            System.out.println("");
        }
       
}
    public static String ketik() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}