package dayfour;

public class AssignmentOne {
    public static void main(String[] args) {
        SingletonDemo demo1 = SingletonDemo.getInstance();
        SingletonDemo demo2 = SingletonDemo.getInstance();
        if (demo1 == demo2){
            System.out.println("they are same");
        }else {
            System.out.println("they are different");
        }
    }
}

class SingletonDemo{
    private static SingletonDemo instance = null;

    private SingletonDemo(){

    }

    public static SingletonDemo getInstance(){
        if (instance == null){
            synchronized (SingletonDemo.class){
                if (instance == null){
                    instance = new SingletonDemo();
                }
            }
        }

        return instance;
    }
}
