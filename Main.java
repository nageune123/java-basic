public class Main {
    public static void main(String[] args) {
int month = 7;

switch (month) {

    case 12:
    case 1:
    case 2:
        System.out.println("겨울");
        break;

    case 3:
    case 4:
    case 5:
        System.out.println("봄");
        break;

    case 6:
    case 7:
    case 8:
        System.out.println("여름");
        break;

    default:
        System.out.println("가을");
}
    }
}   