import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int numStudents = input.nextInt();
        System.out.printf("Enter %d scores : ", numStudents);
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ;i < numStudents; ++i)
            list.add(input.nextInt());

        int bestScore = list.stream().max(Integer::compare).orElseThrow(()-> new NoSuchElementException()) ;

        Map<Integer,String> grades = list.stream().collect(Collectors.toMap(
                score->score,
                score -> {
                    if (score >= bestScore - 10) return "A";
                    if (score >= bestScore - 20) return "B";
                    if (score >= bestScore - 30) return "C";
                    if (score >= bestScore - 40) return "D";
                    return "F";
                }
                ));

        System.out.println("Grades : ");
        grades.forEach((score,grade)-> System.out.println("Score : "+score+" Grade : "+grade));
    }
}
