import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23806 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append("@@@@@".repeat(N));
            sb.append('\n');
        }
        for (int i=0; i<N*3; i++) {
            sb.append("@".repeat(N));
            sb.append("   ".repeat(N));
            sb.append("@".repeat(N));
            sb.append('\n');
        }
        for (int i=0; i<N; i++) {
            sb.append("@@@@@".repeat(N));
            sb.append('\n');
        }
        System.out.print(sb);
    }

}
