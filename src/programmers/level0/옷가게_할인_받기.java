package programmers.level0;

public class 옷가게_할인_받기 {
    public static void main(String[] args) {
        System.out.println(solution(580000));
    }

    public static int solution(int price) {
        if(price >= 100000 && price < 300000) {
            return price - (int)Math.ceil(price*0.05);
        } else if (price >= 300000 && price < 500000) {
            return price - (int)Math.ceil(price*0.1);
        } else if (price >= 500000) {
            return price - (int)Math.ceil(price*0.2);
        }
        return price;
    }
}
