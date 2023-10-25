import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String input = br.readLine();
        String[] stringIntegerList = input.split("");

        int sum = 0;

        for (String stringInteger : stringIntegerList) {
            sum += Integer.valueOf(stringInteger);
        }

        System.out.println(sum);
    }
}
/**
 * 통과 후 다음 사용을 위해 삭제!!
 */
