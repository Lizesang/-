package huat.shp.service;

import java.util.List;

import huat.shp.pojo.Catelog;

/**
 */
public interface CatelogService {
    public List<Catelog> getAllCatelog();
    public List<Catelog> getPageCatelog(int pageNum, int pageSize);
    public int getCount(Catelog catelog);
    public int getCatelogNum();
    Catelog selectByPrimaryKey(Integer id);
    int updateByPrimaryKey(Catelog record);
    int updateCatelogNum(Integer id,Integer number);
}
