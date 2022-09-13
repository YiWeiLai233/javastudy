/**
 * ddo1
 */
public class demo1 {
    int age;//实例变量
    static int weight=20;//类变量
    public static void main(String[] args) {
        demo1 d = new demo1();//创建一个实例
        d.age=10;
        System.out.println(demo1.weight);
        System.out.println(d.age);
    }
}  

