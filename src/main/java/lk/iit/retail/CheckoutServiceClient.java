package lk.iit.retail;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lk.iit.retail.grpc.generated.*;

public class CheckoutServiceClient {
    private ManagedChannel channel = null;
    CheckoutCartServiceGrpc.CheckoutCartServiceBlockingStub clientStub = null;

    String host = null;
    int port = -1;

    public CheckoutServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = lk.iit.retail.grpc.generated.CheckoutCartServiceGrpc.newBlockingStub(channel);
    }

    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() {
        CheckoutRequest checkoutRequest = CheckoutRequest.newBuilder().build();
        CheckoutResponse checkoutResponse = clientStub.checkoutCart(checkoutRequest);
        System.out.println("shopping cart checkout status ->" + checkoutResponse.getIsCheckout());
    }

}
