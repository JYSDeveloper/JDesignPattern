package Adapter;

public class ElasticSearchAdaptee {
    public void SelectDateByFilter(String queryParam){
        System.out.println("Elastic Search handle " + queryParam);
        //需要根据请求的信息拼接适合自己的查询条件
    }
}
