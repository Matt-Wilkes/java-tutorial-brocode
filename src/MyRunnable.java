public class MyRunnable implements Runnable{
//    The below code will be running on a separate thread to the main Thread
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
                throw new RuntimeException(e);
            }

            if(i==5){
                System.out.println("Time's up!");
                System.exit(0);
            }
        }
    }
}
