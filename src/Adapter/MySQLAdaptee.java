package Adapter;

public class MySQLAdaptee {
    public void SelectDataByMySQLQuery(String queryParam){
        System.out.println("MySQL handle " + queryParam);
        //按照MySQL的逻辑处理业务
    }
}
