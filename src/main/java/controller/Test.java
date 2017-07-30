package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by Administrator on 2017/7/28.
 */
@Controller
public class Test {

    @RequestMapping("/test")
    public String test(){

        return "test";
    }

    @RequestMapping("/testGo")
    public String testGO(@RequestParam("file")CommonsMultipartFile file){
        System.out.println(file.getOriginalFilename());
        return "adf";
    }
}
