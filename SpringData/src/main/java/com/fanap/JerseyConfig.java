package com.fanap;

import com.fanap.Service.EmployeeService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest")
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(EmployeeService.class);
    }

}
