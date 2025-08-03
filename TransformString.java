//Replace first occurrence of letter o with single $, second occurence with 2 $ and so on.

// Input - Tomorrow
// Output - T$m$$rr$$$w

public class TransformString {

    public static void main(String[] args) {
        String str = "Tomorrowo";

        int count =0;
        int print;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) =='o'){
                count++;
                print = count;
                while(print>0){
                    System.out.print("$");
                    print--;
                }
            }else{
                System.out.print(str.charAt(i));
            }
        }
    }
}
