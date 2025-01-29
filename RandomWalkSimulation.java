import java.util.Random;

public class RandomWalkSimulation {
    public static void main(String[] args){
        int[] stepValues = {10, 20, 40, 100, 200};
        int trials = 10;

        Random random = new Random();

        System.out.println("Number of Steps (N) | Trial Number (M) | Final Position (D)");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < stepValues.length; i++){
            int N = stepValues[i];
            for (int j = 1; j <= trials; j++){
                int position = 0;

                for (int step = 0; step < N; step++){
                    if (random.nextBoolean()){
                        position++;
                    }
                    else{
                        position--;
                    }
                }
                System.out.printf("%17d | %16d | %18d%n", N, j, position);
            }
        }
    }
}
