package etude;

import static java.lang.System.out;
import java.util.concurrent.*;
import etude.*;

public class PointDEntree {

/*acquires lock on PointDEntree class*/
static /*synchronized*/ void methodeBloquante() {

	ExecutorService service = Executors.newSingleThreadExecutor();
	try {
		Future<Integer> f = service.submit(new Appel());
		out.println("methodeBloquante has been waiting for: " + f.get());
	} catch(InterruptedException e) {
		out.println(e);
	} catch(ExecutionException e) {
		out.println(e);
	} finally {
		service.shutdown();
	}

}//end methodeBloquante
}//end class
