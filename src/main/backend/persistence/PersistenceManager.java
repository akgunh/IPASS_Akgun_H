public class PeristenceManager{
    private final static String ENDPOINT = "https://bepblobstorage.blob.core.windows.net/";
    private final static String SASTOKEN = "?......";
    private final static String CONTAINER = "bankcontainer";

    private static BlobContainerClient blobContainer = new BlobContainerClientBuilder()
            .endpoint(ENDPOINT)
            .sasToken(SASTOKEN)
            .containerName(CONTAINER)
            .buildClient();
}
