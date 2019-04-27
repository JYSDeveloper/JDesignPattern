package Adapter;

public class HiveDBAdapter extends HiveDBAdaptee implements Target{

    @Override
    public void SelectDateFormDB(String queryParam) {
        this.SelectDataByHiveQuery(queryParam);
    }
}
