package pl.edu.lafk.helion_deal;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class FreeEBooksFetcher {
  public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
    URI uri = new URI("https://helion.pl/kategorie/darmowe/");
    HttpResponse<String> send = HttpClient.newBuilder()
        .followRedirects(HttpClient.Redirect.NORMAL).build()
        .send(HttpRequest.newBuilder().uri(uri).build()
            , HttpResponse.BodyHandlers.ofString());
    System.out.println(send.statusCode());
    System.out.println("BODY: " + send.body());
  }
}
