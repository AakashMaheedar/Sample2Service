package com.freshworks.com.resources;

import com.freshworks.com.domain.Sample2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Sample2Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Sample2 greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Sample2(counter.incrementAndGet(),
                String.format(template, name));
    }
}
