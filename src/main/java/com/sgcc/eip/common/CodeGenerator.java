package com.sgcc.eip.common;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {

    /**
     * 详细配置参数见官网
     */
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //>>>>>>>>>>>>>>更改此处输出目标路径
        gc.setOutputDir("D:\\eclipse\\work\\saidi\\back\\system-manage\\src\\main\\java");
        //<<<<<<<<<<<<<<
        gc.setAuthor("zch");
        gc.setOpen(false);
        gc.setSwagger2(true); //实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);

        //>>>>>>>>>>>>>>> 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://52.82.31.209:3306/gateway_new?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("gw");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //>>>>>>>>>>>>>>>>>>后缀包名
        pc.setModuleName("systemManage");
        //前缀包名
        pc.setParent("com.sgcc.eip");
        //<<<<<<<<<<<<<<<<<<
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        //>>>>>>>>>>>>>>>>>>>>表名,多参数的如(a,b,c)
        strategy.setInclude("user_info");
        //<<<<<<<<<<<<<<<<<<<<
        //驼峰式转换
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        mpg.execute();
    }
}
