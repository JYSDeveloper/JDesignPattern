package Adapter;

public class MySQLAdapter extends MySQLAdaptee implements Target {
    @Override
    public void SelectDateFormDB(String queryParam) {
        this.SelectDataByMySQLQuery(queryParam);
    }
}
