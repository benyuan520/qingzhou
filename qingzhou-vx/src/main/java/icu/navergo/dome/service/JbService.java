package icu.navergo.dome.service;

import icu.navergo.dome.entity.Jb;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author benyuan
 * @since 2023-01-04
 */
public interface JbService extends IService<Jb> {

    void selectJbAll();
}
