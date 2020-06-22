package singletonPattern;

public class SingleTon {
    private static SingleTon instance;

    private SingleTon(){
    }

    public int sum(int start,int end){
        int sum=0;
        for(int i = start; i<=end;i++){
            sum+=i;
        }
        return sum;
    }
    public int sum(int start,int end,int stepLength){
        int sum=0;
        for(int i = start; i<=end;i+=stepLength){
            sum+=i;
        }
        return sum;
    }


    public static SingleTon getInstance(){
        if(instance==null){
            instance = new SingleTon();
            return instance;
        }else{
            System.err.println("It is not allowed to make more than one instance of the Singleton Class!");
            return null;
        }
    }

}
