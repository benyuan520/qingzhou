package icu.navergo.dome.service.impl;

import icu.navergo.dome.entity.Jb;
import icu.navergo.dome.mapper.JbMapper;
import icu.navergo.dome.service.JbService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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


    @Override
    public void selectJbAll(){

        List<Jb> jbs=jbMapper.selectJbAll();
        System.out.println(jbs);
    }


}
