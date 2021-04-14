public class week6_2_2 {
    static int int_sum=0;
    static int prime_sum = 0;
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=()->{
            for (int i = 1; i <= 10000; i++) {
                if(i % 2 == 0){
                    int_sum++;
                }
            }
        };
        
        Runnable runnable2=()->{
            for (int j = 1; j < 10000; j++){
                int count = 0;
                for(int k = 1; k < 10000; k++){
                    if(j % k == 0){
                        count++;
                    }
                }
            
            
            if(count==2)
                prime_sum++;
            }
            
            
        };
        
        
        
        Thread thread=new Thread(runnable);
        thread.start();
        thread.join();
        System.out.println("the result is "+int_sum);
        
        Thread thread2=new Thread(runnable2);
        thread2.start();
        thread2.join();
        System.out.println("the result is "+prime_sum);
    }
}