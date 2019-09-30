import java.util.Scanner;
class StudentMarks {
    public static void main(String[] args){
        System.out.println("Enter Number of students");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        int[] stuGrades = new int[numOfStudents];
        for(int i=0; i<numOfStudents; i++){
            int grades =scanner.nextInt();
            try {
                if(grades >100 || grades<0){
                    i--;
                    throw new Exception();
                }else{
                    stuGrades[i]=grades;
                }
            }catch (Exception e){
                System.out.println("Enter a valid Grade");
            }
            
        }
    }
}
