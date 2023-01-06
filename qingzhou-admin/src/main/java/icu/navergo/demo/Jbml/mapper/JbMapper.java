package icu.navergo.demo.Jbml.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.navergo.demo.Jbml.entity.Jb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author benyuan
 * @since 2023-01-04
 */
@Mapper
public interface JbMapper extends BaseMapper<Jb> {

    /** 
    *
    *@Author :BenYuan
    *@create :2023/1/5 18:33
    *@Description TODO
    *
    */
    
    
    @Select("select * from jb where jb_id>(select jb_id from jb order by jb_id limit #{pages},1) limit #{pieces}")
    List<Jb> selectJbAll(int pages,int pieces);



}
