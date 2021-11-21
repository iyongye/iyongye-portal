package com.iyongye.website.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 本项目由www.iyongye.com所有，侵权必究
 *
 * 页面跳转
 * @author wangbencheng
 * @version 1.0
 * @className PortalViewController
 * @since 2021/11/15 00:37
 */
@Controller
public class PortalViewController {

    /**
     * 首页跳转
     * @param map
     * @param request
     * @return
     */
    @RequestMapping("/")
    public String index(ModelMap map, HttpServletRequest request) {
        return "index-2.html";
    }

    /**
     * 关于我们页面跳转
     * @param map
     * @param request
     * @return
     */
    @RequestMapping("/about/us.html")
    public String aboutUs(ModelMap map, HttpServletRequest request) {
        return "about.html";
    }

    /**
     * 业务范围页面跳转
     * @param map
     * @param request
     * @return
     */
    @RequestMapping("/business.html")
    public String businessPage(ModelMap map, HttpServletRequest request) {
        return "business.html";
    }

    /**
     * 业务详情内容
     * @param map
     * @param request
     * @return
     */
    @RequestMapping("/business/detail.html")
    public String businessDetailPage(ModelMap map, HttpServletRequest request) {
        return "bussiness-detail.html";
    }

    /**
     * 产品中心页面跳转
     * @param map
     * @param request
     * @return
     */
    @RequestMapping("/products.html")
    public String productPage(ModelMap map, HttpServletRequest request) {
        return "products.html";
    }

    /**
     * 产品中心页面跳转
     * @param map
     * @param request
     * @return
     */
    @RequestMapping("/product/detail.html")
    public String productDetailPage(ModelMap map, HttpServletRequest request) {
        return "product-detail.html";
    }

    /**
     * 联系我们页面跳转
     * @param map
     * @param request
     * @return
     */
    @RequestMapping("/contact.html")
    public String contactPage(ModelMap map, HttpServletRequest request) {
        return "contact.html";
    }

    /**
     * 404页面跳转
     * @param map
     * @param request
     * @return
     */
    @RequestMapping("/404.html")
    public String error404Page(ModelMap map, HttpServletRequest request) {
        return "error-404.html";
    }


}
