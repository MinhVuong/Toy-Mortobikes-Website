package com.toy.motobike.controller;

import com.toy.motobike.core.Log;
import com.toy.motobike.core.Request;
import com.toy.motobike.core.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LAP11292-local
 */
@RestController
@RequestMapping("/user/login")
public class UserController extends BaseController{

    @Override
    protected int verifyParams(Request request, Log log) {
        return 1;
    }

    @Override
    protected Response process(Log log) {
        return new Response(1);
    }
    
    
}
