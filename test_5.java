public class test_5 {
    public static void main(String[] args) {
        int[] a={77,5,5,22,13,55,97,4,796,1,0,9};
        int[] b={0,1,2,3,4,5,6,7,8,9};
        int[] c=new int[a.length];
        int[] d=new int[a.length];
        int[] e=new int[a.length+b.length];

        //第1小題
        int temp1=0;
        System.out.print("陣列C：");
        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<b.length ; j++){
                if(a[i] == b[j]){
                    c[temp1]=a[i];
                    System.out.print(c[temp1]+" ");
                    temp1++;
                }
            }      
        }

        //第2小題
        int temp2=0;
        System.out.print("\n陣列d：");
        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<b.length ; j++){
                if(a[i] == b[j]) break;
                else if(j == b.length-1){
                        d[temp2]=a[i];
                        System.out.print(d[temp2]+" ");
                        temp2++;
                }
                
            }
        }

        //第3小題
        System.out.print("\n陣列e：");
        for(int i=0 ; i<a.length ; i++){
            e[i]=a[i]; 
            System.out.print(e[i]+" ");
        }
        int temp3=a.length;
        for(int i=0 ; i<b.length ; i++){
            for(int j=0 ; j<a.length ; j++){
                if(b[i] == a[j]) break;
                else if(j == a.length-1){
                    e[temp3]=b[i];
                    System.out.print(e[temp3]+" ");
                    temp3++;
                }
            }      
        }
    }
}
