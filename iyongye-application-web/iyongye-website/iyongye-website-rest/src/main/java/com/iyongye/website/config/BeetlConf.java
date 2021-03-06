package com.iyongye.website.config;


/**
 * 本项目由www.iyongye.com所有，侵权必究
 *
 * beetl配置类
 * @author wangbencheng
 * @version 1.0
 * @className BeetlConfig
 * @since 2021/11/14 23:55
 */
//@Configuration
//public class BeetlConf {
//
//
//    @Value("${beetl.templatesPath}")
//    String templatesPath; //模板根目录 ，比如 "templates"
//
//    @Bean(name = "beetlConfig")
//    public BeetlGroupUtilConfiguration getBeetlGroupUtilConfiguration() {
//        BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
//        //获取Spring Boot 的ClassLoader
//        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        if(loader==null){
//            loader = BeetlConf.class.getClassLoader();
//        }
////        beetlGroupUtilConfiguration.setConfigProperties(extProperties);//额外的配置，可以覆盖默认配置，一般不需要
//        ClasspathResourceLoader cploder = new ClasspathResourceLoader(loader,
//                templatesPath);
//        beetlGroupUtilConfiguration.setResourceLoader(cploder);
//        beetlGroupUtilConfiguration.init();
//        //如果使用了优化编译器，涉及到字节码操作，需要添加ClassLoader
//        beetlGroupUtilConfiguration.getGroupTemplate().setClassLoader(loader);
//        return beetlGroupUtilConfiguration;
//
//    }
//
//    /**
//     * beetl的视图解析器
//     */
//    @Bean(name = "beetlViewResolver")
//    public BeetlSpringViewResolver getBeetlSpringViewResolver(@Qualifier("beetlConfig") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
//        BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
//        beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
//        beetlSpringViewResolver.setOrder(0);
//        beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
//        return beetlSpringViewResolver;
//    }

//}
