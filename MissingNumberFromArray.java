public class MissingNumberFromArray {

    public static void main(String[] args) {
        int[] num = {1,2,5,10};
        for(int i=1;i<10;i++){
            for(int j=0;j<num.length;j++){
                if(i== num[j]){

                    break;
                }
                if(j == num.length-1){
                    System.out.println(i);
                }
            }
        }
    }
}