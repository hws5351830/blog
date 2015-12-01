/**
 * 
 */
package org.alysr.blog.webapp.index.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alysr.framework.object.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <a href="mailto:alysrazorr@foxmail.com">alysrazorr@foxmail.com</a>
 * 
 * @author alysr
 * @DateTime 2015年12月1日 下午10:44:35
 */
@Controller
@RequestMapping(value = "")
public class IndexController extends BaseController {

    private static final String PATH = "/index/";

    @RequestMapping(value = "/index.do")
    public String getView(HttpServletRequest req, HttpServletResponse resp) {

        return PATH + "index.jsp";
    }
}
