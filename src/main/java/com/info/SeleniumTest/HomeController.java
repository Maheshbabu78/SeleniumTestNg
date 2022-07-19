package com.info.SeleniumTest;

import java.io.IOException;
import java.io.InputStream;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.JsonObject;

@RestController
public class HomeController {
	
	@Autowired
    ResourceLoader resourceLoader;
	
	@PostMapping("/api/saveQuery")
	public Object data() throws IOException {
		Resource resource = resourceLoader.getResource("./Reports/Extent.html");
		InputStream input = resource.getInputStream();
		java.io.File file = resource.getFile();
		System.out.println(file);
		return new Object();
	}

}
