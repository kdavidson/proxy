package com.sw.proxy;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ProxyApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FencersControllerIT {

    @LocalServerPort
    private int port;
    
    @Before
    public void setup() {
    	RestAssured.port = port;
    }
    
    @Test
    public void unknownRequest_returnsNotFound() {
    	get("/unknown")
    	.then()
    	.statusCode(404);
    }
    
    @Test
    public void getFencerRequest_returnsFencer() {
    	get("/fencer")
    	.then()
    	.statusCode(200)
    	.body(containsString("licenceNo"));
    }
}
