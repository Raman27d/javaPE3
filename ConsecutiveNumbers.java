import java.util.Scanner;

class ConsecutiveNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string =scanner.next();
        String[] strings = string.split(",");
        int[] nums = new int[7];
        int min = Integer.MAX_VALUE;
        int max=0;
        for(int i=0; i<7; i++){
            nums[i] = Integer.parseInt(strings[i]);
            if(nums[i]<min)min=nums[i];
            if(nums[i]>max)max=nums[i];
        }
        if(max-min>6)
        {
            System.out.println(string + "are not consasdfecutive");
            return;
        }
        int[] nums2 =new int[7];
        for(int i=0; i<7; i++){
            int x=nums[i]-min;
            if(nums2[x]==0) nums2[x]++;
            else {
                System.out.println(string +" are not consecutive");
            }
        }
        for(int i=0; i<7; i++){
            if(nums2[i]!=1){
                System.out.println(string +" are not consecutive");
                return;
            }
        }
        System.out.println(string + "are consecutive");
    }
}