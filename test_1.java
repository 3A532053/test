class vehicle{
    String brand;       //車輛品牌
    int fuel;           //車輛油量
    vehicle(String b, int f){
        brand = b;
        fuel = f;
    }
    void show(){
        System.out.println("品牌:"+brand+"\n油量:"+fuel);
    } 
    public int getfuel(){       //車輛可加油
        return fuel;
    }
 }

interface Run{      //可行駛公里數
    void totalkm();
}

class car extends vehicle implements Run{
    car(String b, int f){
        super(b,f);
    }
    public void totalkm(){      //計算汽車可行駛公里數
        System.out.println("可行駛公里數:"+getfuel()*10);
    }
}

class motor extends vehicle implements Run{
    motor(String b, int f){
        super(b,f);
    }
    public void totalkm(){      //計算機車可行駛公里數
        System.out.println("可行駛公里數:"+getfuel()*20);
    }
}

public class test_1 {
    public static void main(String[] args) {
		car v1 = new car("benz",10);
		motor v2 = new motor("yamaha",10);
		v1.show();
		v1.totalkm();
		v2.show();
		v2.totalkm();
	}
}
