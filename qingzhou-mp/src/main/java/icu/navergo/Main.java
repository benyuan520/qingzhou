package icu.navergo;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        String url ="jdbc:mysql://localhost:3306/qingzhou";
        String username = "root";
        String password="sun12345";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("benyuan") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(".\\qingzhou-mp\\src\\main\\java\\"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("icu.navergo") // 设置父包名
                            .moduleName("MP") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "../MP")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("jb","jb_act") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();



    }



}