import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Car2{
  private int num;
  private double gas;

  public int setNumgas(int n,double g){
    if(n>=100&&g>0){
      num=n;
      gas=g;
      return 1;
    }
    else{
      return 0;
    }
  }
  public void show(){
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }
}

class Sample2{
  public static void main(String arg[]){
    String str;
    int n;
    double g;
    //ナンバーの設定
    System.out.println("ナンバーを入力(整数)");
    try{
      BufferedReader r1=new BufferedReader(new InputStreamReader(System.in));
      str=r1.readLine();
      n=Integer.parseInt(str);
      //ガスの設定
      System.out.println("ガスの量を入力(小数)");
      BufferedReader r2=new BufferedReader(new InputStreamReader(System.in));
      String str1=r2.readLine();
      g=Double.parseDouble(str1);
      int check;
      Car2 car2=new Car2();
      check=car2.setNumgas(n, g);
      if(check==1){
        car2.show();
      }
      else{
        System.out.println("入力した数値は範囲外です。\n");
      }
    }catch(IOException e){
      System.out.println("なんらかのエラーです");
    }
    
   
  }
}