package lk.iit.retail;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lk.iit.retail.grpc.generated.Catalogue;
import lk.iit.retail.grpc.generated.GetCatalogueRequest;
import lk.iit.retail.grpc.generated.GetCatalogueResponse;
import lk.iit.retail.grpc.generated.GetCatalogueServiceGrpc;

import java.util.List;

public class GetCatalogueServiceClient {
    private ManagedChannel channel = null;
    GetCatalogueServiceGrpc.GetCatalogueServiceBlockingStub getCatalogueServiceBlockingStub = null;

    String host = null;
    int port = -1;

    public GetCatalogueServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        getCatalogueServiceBlockingStub = lk.iit.retail.grpc.generated.GetCatalogueServiceGrpc.newBlockingStub(channel);
    }

    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() {
        GetCatalogueRequest getCatalogueRequest = GetCatalogueRequest.newBuilder().build();
        GetCatalogueResponse getCatalogueResponse = getCatalogueServiceBlockingStub.getCatalogue(getCatalogueRequest);
        List<Catalogue> catalogueList = getCatalogueResponse.getCataloguesList();
        catalogueList.forEach(System.out::println);
    }
}
