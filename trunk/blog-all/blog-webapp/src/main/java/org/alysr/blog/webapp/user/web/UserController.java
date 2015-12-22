/**
 * 
 */
package org.alysr.blog.webapp.user.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alysr.framework.core.object.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <a href="mailto:alysrazorr@foxmail.com">alysrazorr@foxmail.com</a>
 * 
 * @author alysr
 * @DateTime 2015年12月6日 下午3:57:39
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    private static final String INDEX_PATH = "/user/";

    @RequestMapping(value = "/index.do")
    public String getView() {

        return INDEX_PATH + "index.jsp";
    }

    @ResponseBody
    @RequestMapping(value = "/getUser.do", method = RequestMethod.POST)
    public Object getUser(HttpServletRequest req, HttpServletResponse resp) {

        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/receive.do", method = RequestMethod.POST)
    public Object receive(HttpServletRequest req, HttpServletResponse resp) {

        Map<String, String[]> paramsMap = req.getParameterMap();
        for (String key : paramsMap.keySet()) {
            logger.info("key:" + key + " valuesArr:" + paramsMap.get(key));
        }
        return null;
    }

}
