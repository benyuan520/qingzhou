package icu.navergo.dome.service.impl;

import icu.navergo.dome.entity.JbAct;
import icu.navergo.dome.mapper.JbActMapper;
import icu.navergo.dome.service.JbActService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
