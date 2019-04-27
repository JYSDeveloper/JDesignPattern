package Adapter;

public class HiveDBAdapter extends HiveDBAdaptee implements Target{

    @Override
    public void SelectDateFormDB(String queryParam) {
        //转换的逻辑，比如说定义一个Hive 查询model,就可以在这里作为参数传递了
        this.SelectDataByHiveQuery(queryParam);
    }
}
