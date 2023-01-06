package icu.navergo.demo.Jbml.controller;

import icu.navergo.demo.Jbml.service.JbActService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author benyuan
 * @since 2023-01-04
 */
@RestController
public class JbActController {
    @Autowired
    JbActService jbActService;

}
