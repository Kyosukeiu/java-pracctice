public class Test {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("次のループに進む");
                continue;
            }
            System.out.println("繰り返し：" + i + "回");
        }
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
