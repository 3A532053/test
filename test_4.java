public class test_4 {
    public static void main(String[] args) {
        int[] a={77,5,5,22,13,55,97,4,796,1,0,9};
        for(int i=0 ; i<a.length-1 ; i++){
            for(int j=0 ; j<a.length-1 ; j++){
                int temp=0;
                if(a[j] >= a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                else continue;
            }
        }
        System.out.print("排序後：");
        for(int x=0 ; x<a.length ; x++){
            System.out.print(a[x]+" ");
        }
    }
}
