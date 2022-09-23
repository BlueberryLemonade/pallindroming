public class Pallin {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String test = "racecar";
        Boolean isPallindrome = false;
        Boolean finishedComparing = false;
        //string iteration for comparing for pallindrom
        int strIt = (int)test.length()/2;

        for(int i = 0; i<strIt; i++){
            System.out.println(test.charAt(i));
            System.out.println(test.charAt(test.length() -1 -i));
        }
        System.out.println(strIt);

    }
}