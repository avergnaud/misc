package etude;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;
import etude.*;

/*simule un appel distant*/
public class Appel implements Callable<Integer> {

/*attend entre 0 et 10 secondes*/
public Integer call() throws InterruptedException {
	out.println(Thread.currentThread().getName() + " enters Appel");
	Random rand = new Random();
	int randomNum = rand.nextInt(10);
	Thread.sleep(randomNum*1000);/*waits randomNum seconds*/
	out.println(Thread.currentThread().getName() + " leaves Appel after " + randomNum + " secs");
	return randomNum;
}

}
