package ws;

import jakarta.xml.ws.Endpoint;

/**
 * @author mohamedyoussfi
 **/
public class ServerJaxWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8086/",new BanqueService());
        System.out.println("Web service déployé sur http://0.0.0.0:8086/");
    }
}
