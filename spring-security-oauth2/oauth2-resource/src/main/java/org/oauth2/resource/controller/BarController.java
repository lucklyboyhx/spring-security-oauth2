package org.oauth2.resource.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BarController {


    // API - read
//    @PreAuthorize("#oauth2.hasScope('bar')")
    @RequestMapping(method = RequestMethod.GET, value = "/api/bars/{id}")
    @ResponseBody
    public Long findById(@PathVariable final long id) {
        
        String username = (String) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        System.out.println(username);
        return id;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/api2/bars/{id}")
    @ResponseBody
    public Long findById2(@PathVariable final long id) {
        
//        String username = (String) SecurityContextHolder.getContext()
//                .getAuthentication().getPrincipal();
//        System.out.println(username);
        return id;
    }


}
