
import java.net.URI;

public class SearchEngine {

    class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
        int num = 0;


        public String handleRequest(URI url) {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    int count = 0;
                    count++;
                    parameters[count] = parameters[1];
                    //stored in the heap as a number server object
                    String parameter = String.join(", ",parameters);
                    return String.format("Added %s, List is: %s", parameters[count],parameter);
                }
            }
            return "404 Not Found!";
        }
    }
}
