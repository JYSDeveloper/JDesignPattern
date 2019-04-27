package Adapter;

public class ElasticSearchAdapter extends ElasticSearchAdaptee implements Target{

    @Override
    public void SelectDateFormDB(String queryParam) {
        //直接调用了Elastic Search引擎的查询方法
        this.SelectDateByFilter(queryParam);
    }
}
