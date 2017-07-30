package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/27.
 */
@Controller
public class Upload {

    @RequestMapping(value = "go")
    public String go(){

        return "upload";
    }

    @RequestMapping(value = "success")
    public String success(@RequestParam("file1") CommonsMultipartFile file1,
        @RequestParam("file2") CommonsMultipartFile file2){
//                          @RequestParam("dataX") String dataX,
//                          @RequestParam("dataY") String dataY,
//                          @RequestParam("dataWidth") String dataWidth,
//                          @RequestParam("dataHeight") String dataHeight){
        System.out.println("wo shi hout tai");
        InputStream inputStream1;
        InputStream inputStream2;
        System.out.println(file1.getOriginalFilename());
        try {
            //底图的流
            inputStream1= file1.getInputStream();
            //二维码的流
            inputStream2 = file2.getInputStream();

            Image img1 = ImageIO.read(inputStream1);
            Image img2 = ImageIO.read(inputStream2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success";
    }
}
