package activities;

public class Activity2 {
    public static void main (String[] args){
       int arrayAct2[] ={10,77,10,54,-11,10};
        int sum=0;
       for (int i =0;i<arrayAct2.length;i++){
           if(arrayAct2[i]==10){
               sum = sum+arrayAct2[i];
           }
       }

       if(sum==30){
           System.out.println("Sum of 10s in array is: "+sum);
       }
       else{
           System.out.println("INCORRECT");
       }
    }
}
