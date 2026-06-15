import java.util.Scanner;
/*
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n%2 == 0){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }
}
*/

// n -> n is even (짝수)
// n -> n is odd (홀수)
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String answer = (n +" is " +(n % 2 == 0 ? "even" : "odd"));
        
        System.out.print(answer);
        
    }
}