public class Pallin {
    public static void main(String[] args) {


        String test = "racecar";
        Boolean isPallindrome = true;

        //string iteration for comparing for pallindrom
        int strIt = (int)test.length()/2;

        for(int i = 0; i<strIt; i++){
            char first = test.charAt(i);
            char last = test.charAt(test.length() -1 -i);

            if(first != last){
                isPallindrome = false;
            }
        }

        if(isPallindrome){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}