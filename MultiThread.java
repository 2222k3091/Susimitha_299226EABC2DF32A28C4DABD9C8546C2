import java.io.*;
class Table5 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i+"*5="+(i*5));
if (i==3)
stop();
}
System.out.println("EXIT FIVE");
}
}
class Table7 extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println(j+"*7="+(j*7));
try
{
sleep(1000);
}
catch(Exception e)
{
}
}
System.out.println("EXIT SEVEN");
}
}
class Table13 extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
System.out.println(k+"*13="+(k*13));
}
System.out.println("EXIT THIRTEEN");
}
}
class MultiThread
{
public static void main(String args[])
{
Table5 t5=new Table5();
Table7 t7=new Table7();
Table13 t13=new Table13();
t5.setPriority(1);
t7.setPriority(5);
t13.setPriority(10);
System.out.println("MULTi THREADED USING PRIORITY");
t5.start();
t7.start();
t13.start();
}
}
