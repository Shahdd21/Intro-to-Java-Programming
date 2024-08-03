import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of objects : ");
        int n = input.nextInt();
        int[] weights = new int[n];

        System.out.println("Enter the weights of objects : ");
        for(int i = 0 ;i < n ; ++i)
            weights[i] = input.nextInt();

        ArrayList<Integer> container = new ArrayList<>();
        Arrays.sort(weights);

        processWeights(weights,container,n);
        displayContainers(container);
    }

    public static void processWeights(int[] weights, ArrayList<Integer> container, int n){

        int prev = weights[n-1], low = 0, high = n-1;
        container.add(prev);

        while(low < high){

            if(prev + weights[low] <= 10){
                prev += weights[low];
                container.add(weights[low]);
                ++low;
            }

            else{
                prev = weights[--high];
                container.add(-1);
                container.add(prev);
            }
        }
    }

    public static void displayContainers(ArrayList<Integer> container){

        int i = 1 ;

        System.out.printf("Container %d contains objects with weights : ",i);
        for(int j = 0 ; j < container.size() ; ++j){

            if(container.get(j).equals(-1)){
                ++i;
                System.out.printf("\nContainer %d contains objects with weights : ",i);
                continue;
            }

            System.out.print(container.get(j)+" ");
        }
    }
}
