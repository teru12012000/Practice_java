class Car{
  int num;
  double gas;
  void setNumgas(int n,double g){
    num=n;
    gas=g;
    System.out.println("車のナンバーを"+num+"ガソリン量を"+gas+"にしました。");
  }
  int getNum(){
    System.out.println("ナンバーを調べました。");
    return num;
  }
  
  
  double getGas(){
    System.out.println("ガソリンを調べました。");
    return gas;
  }

  
  void show(){
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }
}


class Sample_class{
  public static void main(String arg[]){
    Car car1=new Car();
    int a=1234;
    double b=20.5;
    car1.setNumgas(a,b);
    int number=car1.getNum();
    double gasolin=car1.getGas();
    
    System.out.println("サンプルから車を調べたところ");
    System.out.println("ナンバー"+number+"ガソリン量"+gasolin+"でした。");
  }
}