package pl.rn;

import org.springframework.util.StopWatch;

import java.util.concurrent.CompletableFuture;

import static java.lang.System.out;
import static java.util.concurrent.CompletableFuture.*;

/**
 * Created by rob on 01.03.17.
 */
public class CF01 {


    public void test1(){
        SlowClient sc = new SlowClient();
        StopWatch sw = new StopWatch();
        sw.start();
        CompletableFuture<Integer> loadFromDB = supplyAsync(() -> sc.getSlow(1000)).
        thenCombine(supplyAsync(() ->sc.getSlow(1000)), (s1, s2) -> s1+s2);
        loadFromDB.thenAccept(out::println);
        sc.getSlow(1000);
        sc.getSlow(1000);

        loadFromDB.join();
        sw.stop();
        out.println(sw.getTotalTimeMillis());
    }

    public static void main(String[] args) {
        CF01 c = new CF01();
        c.test1();
    }
}
