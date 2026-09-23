package number;

public class Prime {
    static void main() {
        int num = 7;
        boolean isPrime = checkPrime(num);
        System.out.println("IsPrime : " + isPrime);
    }

//    private static boolean checkPrime(int num) {
//        if (num  <= 1) {
//            return false;
//        }
//        int count = 1;
//        for (int i = 2; i <= num; i++) {
//            if (num % i == 0) {
//                count++;
//            }
//        }
//        return count == 2;
//    }

//    private static boolean checkPrime(int num) {
//        boolean isPrime = num >= 2;
//        for (int i = 2; i * i <= num && isPrime; i++) {
//            if (num % i == 0) {
//              isPrime = false;
//              break;
//            }
//        }
//        return isPrime;
//    }

//    private static boolean checkPrime(int num) {
//        boolean isPrime = num >= 2;
//        if(num >2 && num % 2==0){
//            return false;
//        }
//        for (int i = 3; i * i <= num && isPrime; i+=2) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime;
//    }

    private static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        boolean isPrime = true;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
