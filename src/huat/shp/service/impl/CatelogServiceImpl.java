package huat.shp.service.impl;

import com.github.pagehelper.PageHelper;
import huat.shp.dao.CatelogMapper;
import huat.shp.pojo.Catelog;
import huat.shp.pojo.User;
import huat.shp.service.CatelogService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 */
@Service("catelogService")
public class CatelogServiceImpl implements CatelogService {

    @Resource
    private CatelogMapper catelogMapper;

    public int getCount(Catelog catelog) {
        int count = catelogMapper.getCount(catelog);
        return count;
    }
    public List<Catelog> getAllCatelog() {
        List<Catelog> catelogs = catelogMapper.getAllCatelog();
        return catelogs;
    }

    //获取出当前页种类
    public List<Catelog> getPageCatelog(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);//分页核心代码
        List<Catelog> list= catelogMapper.getCatelogList();
        return list;
    }

    //获取出种类的数量
    public int getCatelogNum() {
        List<Catelog> catelogs = catelogMapper.getCatelogList();
        return catelogs.size();
    }
    public Catelog selectByPrimaryKey(Integer id){
        Catelog catelog = catelogMapper.selectByPrimaryKey(id);
        return catelog;
    }
    public int updateByPrimaryKey(Catelog catelog) {
        return  catelogMapper.updateByPrimaryKey(catelog);
    }
    public int updateCatelogNum(Integer id,Integer number) {
        return catelogMapper.updateCatelogNum(id,number);
    }
}
