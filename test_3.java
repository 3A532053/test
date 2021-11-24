public class test_3 {
    public static void main(String[] args) {
        int[] a={0,1,2,3,4,5,6,7,8,9};
        int oddsum=0 , evensum=0;
        int[] odd=new int[10];  //存放奇數值
        int[] even=new int[10]; //存放偶數值
        int x=0 , y=0;
        for(int i=0 ; i<10 ; i++){
            if (a[i]%2 != 0){
                oddsum += a[i];
                odd[x++] = a[i];
            }
            else{
                evensum += a[i];
                even[y++] = a[i];
            }
        }
        System.out.printf("奇數值總和 減去 偶數值總和=%d \n",oddsum-evensum);
    }
}
