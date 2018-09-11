package org.oauth2.server.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class UserControllor {

    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    @ResponseBody
    public Long findUser(@PathVariable final long id) {
        return id;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/user2/{id}")
    @ResponseBody
    public Long findUser2(@PathVariable final long id) {
        return id + 1;
    }
}
