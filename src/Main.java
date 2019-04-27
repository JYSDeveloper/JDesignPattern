import Adapter.Client;
import Adapter.DB;

public class Main {

    public static void main(String[] args) {

        Client.SelectDataByParam("userId = 100", DB.ES);
    }
}
