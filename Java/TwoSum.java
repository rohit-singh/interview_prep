//public class TwoSum {
//    public static void main(String[] args) {
//        int numbers[] = {2,7,11,15};
//
//        int target = 19;
//        int leftptr = 0;
//        int rightptr = numbers.length-1;
//        int flag = 0;
//        System.out.println("Last index "+ rightptr);
//
//        for(int i=0;i<numbers.length-1;i++){
//            int sum = numbers[leftptr]+ numbers[rightptr];
//            System.out.println("Current Sum =" + sum);
//            if(sum == target){
//                System.out.println("value at indices "+ leftptr + " and " + rightptr + " gives target value" );
//                flag = 1;
//                break;
//            }
//            else if(sum>target){
//                rightptr--;
//                System.out.println("Decrementing right pointer");
//            }else{
//                leftptr++;
//                System.out.println("Incrementing left pointer");
//            }
//
//        }
//        if(flag ==0){
//            System.out.println("Target sum not found");
//        }
//    }
//}

//Second Attempt
//public class TwoSum {
//    public static void main(String[] args) {
//        // Assumes numbers is sorted in ascending order.
//        int numbers[] = {2,7,11,15};
//        int target = 19;
//        int leftPtr = 0;
//        int rightPtr = numbers.length-1;
//        boolean found = false;
//
//        while(leftPtr<rightPtr){
//            int sum = numbers[leftPtr]+ numbers[rightPtr];
//            if(sum == target){
//                found = true;
//                System.out.println("value at indices "+ leftPtr + " and " + rightPtr + " gives target value" );
//                break;
//            }
//            else if(sum>target){
//                rightPtr--;
//            }else{
//                leftPtr++;
//            }
//
//        }
//        if(!found){
//            System.out.println("Target sum not found");
//        }
//    }
//}

//Third  Attempt
public class TwoSum {
    public static void main(String[] args) {
        // Assumes numbers is sorted in ascending order.
        int numbers[] = {2,7,11,15};
        int target = 9;
        int leftPtr = 0;
        int rightPtr = numbers.length-1;


        while(leftPtr<rightPtr){
            int sum = numbers[leftPtr]+ numbers[rightPtr];
            if(sum == target){

                System.out.println("value at indices "+ leftPtr + " and " + rightPtr + " gives target value" );
                return;  // exit main() method and return to JVM
            }
            else if(sum>target){
                rightPtr--;
            }else{
                leftPtr++;
            }

        }

            System.out.println("Target sum not found");

    }
}