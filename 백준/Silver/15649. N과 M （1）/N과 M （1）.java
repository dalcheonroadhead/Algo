
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    // 전역에서 배열을 쓰기 위해 선언과 할당을 따로
    static boolean[] visted;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 자연수 - N, 선택할 총량 - M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

         visted = new boolean[N];
         arr = new int[M];

        calc(N,M,0);

    }

    /*
    * 백트래킹을 재귀를 이용해 구현 -> 방문: true, 방문x -> false
    */

    public static void calc(int N, int M, int deepth){
        if(deepth == M){
            for (int a :
                    arr) {
                System.out.print(a+ " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {

            // 방문했다면, 방문한 번호를 저장 및 방문 했다고 팻말 바꾸기
            if(!visted[i]){
                visted[i] = true;
                arr[deepth] = i+1; // 실제 값은 index +1
                calc(N,M,deepth+1);
                visted[i] = false;
            }
            // 만약 arr 다 채우고 프린트 해서 나왔다면,

        }
    }
}