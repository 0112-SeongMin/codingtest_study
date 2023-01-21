package programmers.level1;

import java.util.Arrays;

public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        System.out.println(solution("12213","12511"));
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int pl = p.length();
        int tl = t.length();
        long pint = Long.parseLong(p);
        long[] list = new long[tl-pl+1];

        for(int i=0; i+pl<=tl; i++) {
            list[i] = Long.parseLong(t.substring(i, pl+i));
        }
        System.out.println(Arrays.toString(list));

        for(long i : list) {
            if(pint >= i) {
                answer++;
            }
        }

        return answer;
    }
}
