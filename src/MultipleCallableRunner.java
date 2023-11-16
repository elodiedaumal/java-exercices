import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
 public static void main(String[] args) throws InterruptedException, ExecutionException {
  ExecutorService executorService = Executors.newFixedThreadPool(3);

  List<CallableTask> tasks = List.of(new CallableTask("Elodie"), new CallableTask("Elisa"),
    new CallableTask("Mooncake"));

  List<Future<String>> welcomeResults = executorService.invokeAll(tasks);

  for (Future<String> result : welcomeResults) {
   System.out.println(result.get());
  }

  executorService.shutdown();

 }
}
