public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("더하기 : " + (a + b));
        System.out.println("빼기 : " + (a - b));
        System.out.println("곱하기 : " + (a * b));
        System.out.println("나누기 : " + (a / b));
        System.out.println("나머지 : " + (a % b));

        a++;

        System.out.println("증가 : " + a);

        a += 5;

        System.out.println("복합 연산 : " + a);
    }
}   