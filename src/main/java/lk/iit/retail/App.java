package lk.iit.retail;

import lk.iit.EtcdClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

//        String serviceName = args[1];
        String serviceName = "node1";

        String endpoint = App.getEndPoint(serviceName);

        GetCatalogueServiceClient getCatalogueServiceClient = new GetCatalogueServiceClient(endpoint.split(":")[0], Integer.parseInt(endpoint.split(":")[1]));
        getCatalogueServiceClient.initializeConnection();
        getCatalogueServiceClient.processUserRequests();
        getCatalogueServiceClient.closeConnection();

        UpdateCatalogueServiceClient updateCatalogueServiceClient = new UpdateCatalogueServiceClient(endpoint.split(":")[0], Integer.parseInt(endpoint.split(":")[1]));
        updateCatalogueServiceClient.initializeConnection();
        updateCatalogueServiceClient.processUserRequests();
        updateCatalogueServiceClient.closeConnection();

        AddCatalogueServiceClient addCatalogueServiceClient = new AddCatalogueServiceClient(endpoint.split(":")[0], Integer.parseInt(endpoint.split(":")[1]));
        addCatalogueServiceClient.initializeConnection();
        addCatalogueServiceClient.processUserRequests();
        addCatalogueServiceClient.closeConnection();

        CheckoutServiceClient checkoutServiceClient = new CheckoutServiceClient(endpoint.split(":")[0], Integer.parseInt(endpoint.split(":")[1]));
        checkoutServiceClient.initializeConnection();
        checkoutServiceClient.processUserRequests();
        checkoutServiceClient.closeConnection();
    }

    private static String getEndPoint(String serverName) {
        EtcdClient client = new EtcdClient();
        client.setEtcdUrl("http://localhost:2379");
        return client.getEtcdKVClient(serverName);
    }
}
