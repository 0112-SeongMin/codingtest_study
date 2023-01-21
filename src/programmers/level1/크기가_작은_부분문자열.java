package programmers.level1;

import java.util.Arrays;

public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        System.out.println(solution("12213","12511"));
    }

    // 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/147355
    public static int solution(String t, String p) {
        int answer = 0; // p보다 작은 값 개수
        int pl = p.length(); // p 문자열 길이
        int tl = t.length(); // t 문자열 길이
        long plong = Long.parseLong(p); // p 값(long으로 변환)
        long[] list = new long[tl-pl+1]; // t 를 p길이 기준으로 자른 데이터 배열

        // list 배열 데이터와 p 값과 비교하여 작은 값이 있으면 answer 1씩 증가
        for(int i=0; i<list.length; i++) {
            list[i] = Long.parseLong(t.substring(i, pl+i));
            if(plong >= list[i]) {
                answer++;
            }
        }

        return answer;
    }
}
