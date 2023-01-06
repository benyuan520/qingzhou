package icu.navergo.demo.Jbml.service;

import com.baomidou.mybatisplus.extension.service.IService;
import icu.navergo.demo.Jbml.entity.Jb;
import icu.navergo.demo.Uml.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author benyuan
 * @since 2023-01-04
 */
public interface JbService extends IService<Jb> {

    List<Jb> selectJbAll(int page,int pieces);
}
