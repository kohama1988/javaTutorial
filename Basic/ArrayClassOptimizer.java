package Basic;
import java.util.Random;

public class ArrayClassOptimizer {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        Random rnd = new Random();
        for(int i=0; i<stu.length; i++){
            stu[i] = new Student(); // 不要忘记
            stu[i].number = i+1;
            stu[i].state = rnd.nextInt(10)+1;
            stu[i].score = rnd.nextInt(100);
        }

        ArrayClassOptimizer test = new ArrayClassOptimizer();
        // 遍历数组
        test.print(stu);
        System.out.println("************************");

        // 输出state为3的信息
        test.searchState(stu, 3);
        System.out.println("************************");

        // 按学生成绩排序，并遍历所有学生信息
        test.sort(stu);

        for(int i=0; i<stu.length; i++){
            System.out.println(stu[i].info());

    }


    }
    public void print(Student[] stu){
        for(int i=0; i<stu.length; i++){
            System.out.println(stu[i].info());
        }
    }

    public void searchState(Student[] stu, int state){
        for(int i=0; i<stu.length; i++){
            if(stu[i].state == state){
                System.out.println(stu[i].info());
            }    
        }
    }

    public void sort(Student[] stu){
        for(int i=0; i<stu.length; i++){
            for(int j=0; j<stu.length-1-i; j++){
                if(stu[j].score>stu[j+1].score){
                    Student temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }
    }


}

class Student{
    int number;
    int state;
    int score;

    public String info(){
        return "学号"+number+" "+"年级"+state+" "+"成绩"+score+" ";
    }
}
