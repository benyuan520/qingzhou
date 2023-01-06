package icu.navergo.dome.mapper;

import icu.navergo.dome.entity.Jb;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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

    @Select("select * from jb")
    List<Jb> selectJbAll();



}
