package HackerRank;



public class individualnumberfetch {

    public static void main(String[] args) {
    
        int number = 5678;

        // Extract each digit from the number
        int firstDigit = number / 1000;
        int secondDigit = (number % 1000)/100;
        int thirdDigit = (number % 100) / 10;
        int fourthDigit = number % 10;

        // Print the extracted digits
        System.out.println("The extracted digits are:");
        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
        System.out.println(fourthDigit);
        
        char[] ch= String.valueOf(5678).toCharArray();
    }
}
