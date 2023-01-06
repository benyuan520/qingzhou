package icu.navergo.demo.Jbml.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.navergo.demo.Jbml.entity.JbAct;
import icu.navergo.demo.Jbml.mapper.JbActMapper;
import icu.navergo.demo.Jbml.service.JbActService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author benyuan
 * @since 2023-01-04
 */
@Service
public class JbActServiceImpl extends ServiceImpl<JbActMapper, JbAct> implements JbActService {
    @Autowired
    JbActMapper jbActMapper;



}
