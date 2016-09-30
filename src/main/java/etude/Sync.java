package etude;

import static java.lang.System.out;
import java.util.concurrent.*;
import etude.*;

public class Sync {
public static void main(String... args) throws InterruptedException {

/*simule 3 appels concurrents*/
ExecutorService internautes = Executors.newFixedThreadPool(3);
try {
	for(int i=0;i<3;i++) {
		internautes.submit(PointDEntree::methodeBloquante);
	}
} finally {
internautes.shutdown();
}
internautes.awaitTermination(10,TimeUnit.MINUTES);

}}
