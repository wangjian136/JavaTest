package cn.edu.ccut.examination;
class Base
{
    public void method()
    {
        System.out.println("Base");
    } 
}
class Son extends Base
{
    public void method()
    {
        System.out.println("Son");
    }
     
    public void methodB()
    {
        System.out.println("SonB");
    }
}
public class Test01
{
    public static void main(String[] args)
    {
        Base base = new Son();
        base.method();
        //编译器认为是Base对象，所以调用不到子类自己的方法，需要向下转型
        //base.methodB();
    }
}