import java.util.*;

public class Main {


    public static List<List<Integer>> pascalTriangle(int numRows){
        
       List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0) return result;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows == 1) return result;

        for(int i = 1; i < numRows; i++){

            List<Integer> prevRow = result.get(i-1);

            List<Integer> row = new ArrayList<>();
            row.add(1);
            

            for(int j = 1; j < i ; j++)   row.add(prevRow.get(j - 1) + prevRow.get(j));
            

            row.add(1);
            result.add(row);
        }

        return result;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();

        List<List<Integer>> result = pascalTriangle(numRows);

        for (List<Integer> row : result) {
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j));

                if (j < row.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
