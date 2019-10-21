package conn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
    @RequestMapping("index")
    public String index(){
        System.out.println("访问到了indexController...");
        return "test";
    }
    @RequestMapping("{module}")
    public String doModuleUI(
            @PathVariable String module) {
        return module;
    }
}
