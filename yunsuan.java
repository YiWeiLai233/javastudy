import java.util.Random;
import java.util.Scanner;

import org.graalvm.compiler.nodes.extended.GetClassNode;
public class yunsuan {
    public static void main(String[] args) {
        int a = 46 % 7 ;//取余
        int b = 46 / 7;
        System.out.println(a + "and"+b);

        int c = 420 / 120;
        int d = 100 * c;
        int e = 420 % 120;
        int f = d+e;//int money = (420 / 120 ) * 100 + 420 % 120 ；
        int s = (420/120)*100 + 420%120;
        System.out.println(s); 
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        int zsScour = input.nextInt()*3;
        System.out.println(zsScour > 80 ) ;
        int num1 =123;
        int num2 = 456;
        int zhong = num1;
        num1 = num2 ;
        num2 = zhong ;
        System.out.println(num1 +""+ ""+num2);//两个变量互换要一个中间变量


    }
}

class yuanmianji {
    public static void main(String[] args) {
        float r =1.5f;//单浮点数字后面加f强制转换
        double s =r*3.14*r;
        System.out.println(s);
}
}
class bianliang {
    public static void main(String[] args) {
        String 好不好 = "你好";
        System.out.println(好不好);
        char a = 'a';//char只能输入一个字符
        System.out.println(a);
        int b = 1000000;//整数的一般格式4个字节 32位
        System.out.println(b);
        double c = 10.25;//8个字节 64位
        System.out.println(c);
        float e = 192.169f;//4个字节 32 位
        System.out.println(e);
        long s = 23854734;//8个字节 64位
        System.out.println(s);
        short j = 234;
        System.out.println(j);
        byte  k = 127 ; //byte最大为127和-128
        System.out.println(k);
       }
   }

class bianliang2{
    public static void main(String[] args) {
        String 品牌 = "iphone";
        double size = 4.0;
        String 像素 ="1080px*1920px";
        int 架构 = 5288;
        System.out.println(品牌);
        System.out.println(像素);
        System.out.println(size);
        System.out.println(架构);
        System.out.println(架构+"\n"+size+'\n'+品牌);
        int score = 50;
        int score2 = score+10;
        int score3 = score+22;
        System.out.println(score3-score2);

}

}

class double1{
    public static void main(String[] args) {
        System.out.println(2<1 && 1<0);//假且（&&）啥。。->假 真且啥->真
        System.out.println(2<1 || 1>0);//或（||）只要其中有一个是真则为真
    }
}//双符号下面只判断真假
class one{
    public static void main(String[] args) {
        int sd = 2;
        int i = 233;
        sd =+ i;// 这句话是吧+（正值i给sd）
        System.out.println(sd);
        //System.out.println(2>1|1/0==0);
        //这样是报错单符号是全部判断
        System.out.println(sd++);
        System.out.println(sd++);
        System.out.println(sd++);
        System.out.println(sd);//sd++是先用在加 ++sd是先加再用
        int sc = 10;
        System.out.println(++sc);
        System.out.println(++sc);
        //byte + byte =int short + short = int 他们都比int小特例
        // 只有= 和+=有内置转换器 可以使用byte+= byte 或者 (byte)b1+b2

    }
}

class string1{
    public static void main(String[] args) {
        String s1 = "你好";
        String s2 = "你好";
        int as = 2;
        System.out.println((s1.equals(s2)));//这里是字符串相等
        System.out.println(!(s1.equals(s2)));//字符串不相等判断
        String s3 = (10>2)? "hello":"world";//成立取左边不成立取右边
        System.out.println(s3);
        if (s2 == "你"){
            System.out.println("hello");
        }   else{
            System.out.println("world");
        }//和python逻辑差不多注意表达式要用括号和要把输出语句用中括号扩起来
    }
}
    class ifpanduan{
        public static void main(String[] args) {
            String s2 = "你好";
            String a ="guest";
            int percent=1;
            if (s2 == "你"){
                System.out.println("hello");
            }   else{
                System.out.println("world");
            }//和python逻辑差不多注意表达式要用括号和要把输出语句用中括号扩起来
            if (a == "vip"){
            System.out.println("恭喜你出货了！");
            } else{
            percent -= 1;
            System.out.println(percent+"，"+"不好意思你冲的不够多");
            }
        }

    }
    class ifshiji{
        public static void main(String[] args) {
            double percent = 0.002;
            int a = 1234;//有钱人账号
            int b = 5678;//穷人账号
            Scanner input = (new Scanner(System.in));
            int c = input.nextInt();
        if  (c==a){
            percent+=12;
        } else {
            percent-=10000;
        }
        if (percent >= 1){
            System.out.println("恭喜你出货了！");
        }else{
            System.out.println("不好意思你冲的不够多下次再加油");
        }
        }
    }
class switch1{
    public static void main(String[] args) {
        int access = 0;
        Scanner input = new Scanner(System.in);
        access =  input.nextInt(); 
        switch (access) {//括号里面写要判断的条件
            case 1234://条件
                System.out.println("恭喜你出货了");
                break;//这里不打断的话下面会继续执行
            case 5678:
                System.out.println("下次加油");//输出
                break;//j结束判断
            default://全部都没的输出
                System.out.println("请输入正确账号");
                break;
        }
    }
}
class random{
    public static void main(String[] args) {
    System.out.println((int)(Math.random()*9000) +1000);//1000到9999的随机数
    int a = ((int)(Math.random()*900)+100);
    int max=20;
    int min=10;
    Random abs = new Random();//指定函数
    int s = abs.nextInt(max)%(max-min+1) + min;//随机范围
    System.out.println(s);
}
}
class duochongif{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        double a = input.nextDouble();
        if (a>90){
            System.out.println("优秀");
        }else if (a>75){
            System.out.println("尚可");
        }else if (a>60){
            System.out.println("及格");

        }else{
            System.out.println("不及格");
        }
    }
}
class whilexunhuan{
    public static void main(String[] args) {
 /*       int a = 0 ;
        while (a < 15) {
            a++;
            System.out.println(a);
        }*/
        int userSel = 1;
        while (true) {
            System.out.println("输入账号");  
            Scanner input = new Scanner(System.in); 
            userSel = input.nextInt();
            switch (userSel) {
                case 12:
                    System.out.println("账号正确");
                    break;
                case 3:
                    System.out.println("程序退出");
                    break;
                default:
                System.out.println("账号错误");
                    break;
            }
            if (userSel==3)
            {break;
            }
        }
    }
}

class forxunhuan{
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j <= i; j++) {
                System.out.println(j);
            
            }
        }
    }
}

class xunhuanyingyong{
    public static void main(String[] args) {
        int max=10000;
        int min=4000;

        int highnum = 0;
        int lowNum = 0;
        for (int i =1;i <= 10;i++ )
        {   /*Random abs = new Random();//指定函数
            int s = abs.nextInt(max)%(max-min+1) + min;//随机范围
            System.out.println(s+i);//s是循环4000到10000*/
            //System.out.println("输入工程师底薪"+ i);
            //Scanner input = new Scanner(System.in);
            //int Basewage =input.nextInt();另一种随机数方式
            //这是另一种方法//
            int a = ((int)(Math.random()*900)+300);
            System.out.println(a+i);
            if (a<500) {
                lowNum +=1;
                
            }else{
                highnum +=1;
            }
        }
        System.out.println(highnum/10.0*100+"%");
    }
}
class doublefor{
    public static void main(String[] args) {
        for (int i = 1; i < 8+1; i++) {//循环次数
            for (int j = 1; j <= i; j++) {//// 每次输出当次个*
                System.out.println("*");//print不换行ln换行
           }
        }
    }
}
class continuefor{
    public static void main(String[] args) {
        for (int i = 1; i < 8+1; i++) {//循环次数
            
            if (i==3) {
                //continue;
                  break;  
            }//i等于3跳过循环break为中断后续循环
            System.out.println(i);
        }
    }
}


class fangfa {
    public static void a(){
        System.out.println(nihaoa());
    }
    public void b(){
        a();
    }
    public static void main(String[] args) {
        fangfa nihao = new fangfa();
        fangfa.a() ;
    }
    public static String nihaoa(){
        return "hello,world!";//return调用
    }
}
class fangfa2{
    public static void main(String[] args) {
        hey();
    }
    public static void hey(){//静态调用
        System.out.println("hello");
    }
}


class trytest{
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入数字");
            int a = input.nextInt();// 程序代码
        } catch (Exception e) {
            e.printStackTrace();//Catch 块
        }
        finally{
            System.out.println("请输入确认自己输入的是数字");
        }
    }
}
 class shuzu{
     public static void main(String[] args) {
         int a[] = {0,1,2,3,4,5,6,7,8,9,10};
         for (int b = 0 ; b < a.length;b ++){
            System.out.println(b+1);
     }
    }
 }