import java.util.Scanner;

class DifficultyZero {
    /**
     * 코딩테스트 연습
     * 코딩 기초 트레이닝
     * 문자열 출력하기
     */
    public static void printString() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i = a.length();

        if(1 <= i && i <= 1000000){
            System.out.println(a);
        }
    }

    /**
     * 코딩테스트 연습
     * 코딩 기초 트레이닝
     * a와 b 출력하기
     */
    public static void printAandB() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = (-100000 <= a) ? a : 0;
        b = (b <= 100000) ? b : 0;

        //System.out.println(a + b);

        System.out.println("a = " + a );
        System.out.println("b = " + b );
    }

    /**
     * 코딩테스트 연습
     * 코딩 기초 트레이닝
     * 문자열 반복해서 출력하기
     */
    public static void printForString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(str);
        }
        String s = sb.toString();
        System.out.println(s);
    }

    /**
     * 코딩테스트 연습
     * 코딩 기초 트레이닝
     * 대소문자 바꿔서 출력하기
     */
    public static void ChangeUppercaseAndLowercaseLetters() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i = 0; i < a.length(); i++){
            char s = a.charAt(i);
            int inver = 97 - 65;
            int num = Integer.valueOf(s);

            if(num>=65 && num <= 90) {
                answer += (char)(num + inver);
            }
            if(num>=97 && num <= 122) {
                answer += (char)(num - inver);
            }
        }
//        for(Character c : a.toCharArray()){
//            if(Character.isUpperCase(c)){
//                //stack.push(Character.toLowerCase(c));
//                answer += Character.toLowerCase(c);
//            }
//            else if(Character.isLowerCase(c)){
//                //stack.push(Character.toUpperCase(c));
//                answer += Character.toUpperCase(c);
//            }
//        }
        System.out.printf(answer);
    }
}