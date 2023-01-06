package icu.navergo.demo.Jbml.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.navergo.demo.Jbml.entity.Jb;
import icu.navergo.demo.Jbml.mapper.JbMapper;
import icu.navergo.demo.Jbml.service.JbService;
import icu.navergo.demo.Uml.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author benyuan
 * @since 2023-01-04
 */
@Service
public class JbServiceImpl extends ServiceImpl<JbMapper, Jb> implements JbService {
    @Autowired
    JbMapper jbMapper;

/**
*
*@Author :BenYuan
*@create :2023/1/6 21:02
*@Description TODO
*
 *
 * @param:page查询第x页
 * @Param:pieces 每页x条
*/
    @Autowired
    UserMapper userMapper;
    @Override
    public List<Jb> selectJbAll(int page,int pieces){
        int pages=page*(pieces-1);
        List<Jb> jbs=jbMapper.selectJbAll(pages,pieces);
        System.out.println(jbs);
        return jbs;
    }


}
