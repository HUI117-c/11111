import java.util.Scanner;
import java.util.Random;
public class demo1 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        Random b=new Random();
        while(true){
            jie();
            int num=a.nextInt();
            switch(num){
                case 1:game(b,a);break;
                case 2:System.out.println("结束");break;
                default:rechose();break;
            }

        }
    }
    public static void jie(){
        System.out.println("请选择");
        System.out.println("1.开始"+'\t'+"2.结束");
    }
    public static void game(Random b,Scanner a){
        System.out.println("开始");
        int target=b.nextInt(100)+1;
        while(true){
            int choice=a.nextInt();

            if(choice>target){
                System.out.println("大了");

            }else if(choice<target){
                System.out.println("小了");
            }
            if(choice==target){
                System.out.println("猜对了");
                break;
            }
        }


    }
    public static void rechose(){
        System.out.println("请重新选择");
    }
}