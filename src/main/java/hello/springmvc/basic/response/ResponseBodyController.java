package hello.springmvc.basic.response;


import hello.springmvc.basic.HelloData;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseBodyController {

    @GetMapping("/response-body-string-v1")
    public void responseBodyV1(HttpServletResponse response) throws IOException {
        response.getWriter().write("OK");
    }

    @GetMapping("/response-body-string-v2")
    public ResponseEntity<String> responseBodyV2(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping("/response-body-string-v3")
    @ResponseBody
    public String ResponseBodyV3(){
        return "OK";
    }

    @GetMapping("/response-body-string-json-v1")
    public ResponseEntity<HelloData> ResponseBodyJsonV1(){
        HelloData helloData = new HelloData();
        helloData.setUsername("이서연");
        helloData.setAge(25);

        return new ResponseEntity<>(helloData,HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/response-body-string-json-v2")
    public HelloData ResponseBodyJsonV2(){
        HelloData helloData = new HelloData();
        helloData.setUsername("이서연");
        helloData.setAge(25);

        return helloData;
    }
}
