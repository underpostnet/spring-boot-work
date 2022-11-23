package com.work.demo;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.work.demo.modules._files;
import com.work.demo.modules._paths;

@RestController
public class ReadJSON {
    @RequestMapping(value = { "json", "json-test" }, method = RequestMethod.GET)
    public String a() throws IOException {
        _paths confPath = new _paths("C:/dd/spring-boot/main/src/main/java/com/work/demo/");
        return _files.getRawContent(confPath.getPathFromRelative("./modules/test.json"));
    }
}