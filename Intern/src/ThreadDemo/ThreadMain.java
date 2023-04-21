package ThreadDemo;

class MyThread extends Thread{
    public void run() {
        Thread th=Thread.currentThread();
        String name=th.getName();
        for(int i=1;i<=5;i++) {
            System.out.println(i + " "+name);
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    }
}
public class ThreadMain {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread th1=new MyThread();
        th1.start();                                            //we are calling 2 threads simuntanously so it prints randomly..we can use sleep method to execute simuntanously
        Thread th=Thread.currentThread();
        String name=th.getName();
        for(int i=1;i<=5;i++) {
            System.out.println(i+" "+name);
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    }

 

}
