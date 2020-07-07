package huat.shp.dao;

import huat.shp.pojo.User;
import org.apache.ibatis.annotations.Param;

import huat.shp.pojo.Catelog;

import java.util.List;

public interface CatelogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Catelog record);

    int insertSelective(Catelog record);

    Catelog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Catelog record);

    int updateByPrimaryKey(Catelog record);

    int updateCatelogNum(@Param("id") Integer id,@Param("number") Integer number);

    List<Catelog> getAllCatelog();//根据商品类别查询商品

    public List<Catelog> getCatelogList();//获取所有用户

    int getCount(Catelog catelog);
}