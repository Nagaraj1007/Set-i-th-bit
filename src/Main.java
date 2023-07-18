
public class Main {

    public static int setBit(int A, int B){
        return (A != B) ? (int)(Math.pow(2, A) + Math.pow(2, B)) : (int) Math.pow(2,A);
    }

    public static void main(String[] args) {
        System.out.println(setBit(3, 5));
    }
}