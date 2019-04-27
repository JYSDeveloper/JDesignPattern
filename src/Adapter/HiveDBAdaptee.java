package Adapter;

public class HiveDBAdaptee {
    protected void SelectDataByHiveQuery(String queryParam){
        System.out.println("Hive handle " + queryParam);
        //按照Hive的逻辑处理业务
    }
}
