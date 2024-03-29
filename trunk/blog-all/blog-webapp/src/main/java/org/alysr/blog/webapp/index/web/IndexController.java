package org.alysr.blog.webapp.index.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alysr.framework.core.object.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @Email <a href="mailto:alysrazorr@foxmail.com">alysrazorr@foxmail.com</a>
 * @author alysr
 * @DateTime 2015年12月20日 下午3:45:37
 */
@Controller
@RequestMapping(value = "")
public class IndexController extends BaseController {

    private static final String INDEX_PATH = "/index/";

    @RequestMapping(value = "/index.do")
    public String getView(HttpServletRequest req, HttpServletResponse resp) {

        Map<String, String[]> paramMap = req.getParameterMap();
        for (String key : paramMap.keySet()) {
            for (String str : paramMap.get(key)) {
                logger.info(key + "=" + str);
            }
        }
        return INDEX_PATH + "index.jsp";
    }
}
