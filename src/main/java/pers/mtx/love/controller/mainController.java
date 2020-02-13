package pers.mtx.love.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class mainController {

    @GetMapping("/map")
    public String mtxMap(String wd, String jd, Map<String,String> map){
        map.put("wd",wd);
        map.put("jd",jd);
        System.out.println(wd);
        System.out.println(jd);
        return "map";
    }
}
