import Adapter.Client;
import Adapter.DB;
import Adapter.ElasticSearchAdapter;

public class Main {

    public static void main(String[] args) {

        Client.SelectDataByParam("userId = 100", DB.ES);
        new ElasticSearchAdapter().SelectDateFormDB("query");
    }
}
