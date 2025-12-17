// File: services/crop-service/src/main/java/MainPublisher.java

import javax.xml.ws.Endpoint;
import service.CropServiceImpl;

public class MainPublisher {

    private static final String SERVICE_URL =
            "http://localhost:8082/CropService";

    public static void main(String[] args) {
        System.out.println("Démarrage du service SOAP Crop-Service sur: " + SERVICE_URL);

        Endpoint.publish(SERVICE_URL, new CropServiceImpl());

        System.out.println("Service prêt. WSDL : " + SERVICE_URL + "?wsdl");
    }
}
