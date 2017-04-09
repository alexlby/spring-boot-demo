package com.alexlby.springdemo.resource;

import com.alexlby.springdemo.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alex on 2017/4/9.
 */
@RestController
@RequestMapping("/users")
public class UserResource {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public UserDto getUserById(@RequestParam(value="id", defaultValue="default_id_001") String id) {
        return new UserDto().setId(id).setName(">alex<");
    }

    /*
     * The above example specified GET vs. PUT, POST, and so forth,
     * if without such specify, @RequestMapping maps all HTTP operations by default.
     * so please Use @RequestMapping(method=GET) to narrow this mapping.
     */

}
