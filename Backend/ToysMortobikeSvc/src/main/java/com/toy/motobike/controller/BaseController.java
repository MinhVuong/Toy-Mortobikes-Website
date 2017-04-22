package com.toy.motobike.controller;

import com.toy.motobike.core.Log;
import com.toy.motobike.core.Request;
import com.toy.motobike.core.Response;
import com.toy.motobike.core.ResponseCode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author VuongTM
 */

public abstract class BaseController {
    
    @RequestMapping
    @ResponseBody
    public Response execute(@RequestBody Request request, Log log) {
        try{
            int code = this.verifyParams(request, log);
            if (ResponseCode.SUCCESS != code) {
                return new Response(code);
            }
            
            return this.process(log);
        } catch(Throwable t) {
            t.printStackTrace();
            log.appendValue("execute.exception = " + t.getMessage());
            return new Response(ResponseCode.SYSTEM_ERROR);
        }
    }
    
    protected abstract int verifyParams(Request request, Log log);
    
    protected abstract Response process(Log log);
}
