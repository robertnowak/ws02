package pl.rn;

/**
 * Created by rob on 01.03.17.
 */
public class SlowClient {

    public   int getSlow(int milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return milis;
    }
}
