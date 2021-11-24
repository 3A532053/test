
public class test_2 {
    public static void main(String[] args){
        String str1=("人易科技:上 機 測 驗 - 演算法");

        //第1小題
		int idx1 = str1.indexOf(":");
		char a = str1.charAt(idx1);
		a =(char) (a+65248);
		System.out.println(":改成全型"+a);

        //第2小題
        int idx2 = str1.indexOf("-");
        String str2 = str1.substring(0,idx2-1);
        String str3 = str1.substring(idx2-1,idx2+2);
        String str4 = str1.substring(idx2+2);
        str2=str2.replace(" ","");
        str4=str4.replace(" ","");
        String str5 = str2 + str3 + str4;
        System.out.println(str5);


        //第3小題
        int idx3 = str5.indexOf(":");
        int idx4 = str5.indexOf("-"); 
        System.out.print(str5.substring(idx3+1,idx4));
    }
}
