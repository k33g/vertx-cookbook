package cookbook.sample;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class Example {

  public void theExample() {
    Vertx vertx = Vertx.vertx();

    HttpServer server = vertx.createHttpServer();
    server.requestHandler(req -> {
      req.response().end("Hello world");
    });

    server.listen(8080);
  }
}
