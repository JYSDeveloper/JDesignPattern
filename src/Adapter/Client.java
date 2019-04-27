package Adapter;

public class Client {

    private static Target ES = new ElasticSearchAdapter();
    private static Target MYSQL = new MySQLAdapter();
    private static Target HIVEDB = new HiveDBAdapter();

    public static void SelectDataByParam(String param, DB type){
        switch (type){
            case ES:
                ES.SelectDateFormDB(param);
                break;
            case Hive:
                HIVEDB.SelectDateFormDB(param);
                break;
            case MySQL:
                MYSQL.SelectDateFormDB(param);
                break;
        }
    }

}

