package lk.iit.retail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        /*GetCatalogueServiceClient getCatalogueServiceClient = new GetCatalogueServiceClient("localhost", 5000);
        getCatalogueServiceClient.initializeConnection();
        getCatalogueServiceClient.processUserRequests();
        getCatalogueServiceClient.closeConnection();*/

        /*UpdateCatalogueServiceClient updateCatalogueServiceClient = new UpdateCatalogueServiceClient("localhost", 5000);
        updateCatalogueServiceClient.initializeConnection();
        updateCatalogueServiceClient.processUserRequests();
        updateCatalogueServiceClient.closeConnection();*/

        AddCatalogueServiceClient addCatalogueServiceClient = new AddCatalogueServiceClient("localhost", 5000);
        addCatalogueServiceClient.initializeConnection();
        addCatalogueServiceClient.processUserRequests();
        addCatalogueServiceClient.closeConnection();

        CheckoutServiceClient checkoutServiceClient = new CheckoutServiceClient("localhost", 5000);
        checkoutServiceClient.initializeConnection();
        checkoutServiceClient.processUserRequests();
        checkoutServiceClient.closeConnection();
    }
}
