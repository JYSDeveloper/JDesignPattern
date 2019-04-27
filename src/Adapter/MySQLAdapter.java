package Adapter;

public class MySQLAdapter extends MySQLAdaptee implements Target {
    @Override
    public void SelectDateFormDB(String queryParam) {
        //转换的逻辑，比如说定义一个MySQL 查询model,就可以在这里作为参数传递了
        this.SelectDataByMySQLQuery(queryParam);
    }
}
