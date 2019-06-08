package com.toushishu.helloservice.com.toushishu.helloservice.controllers;

import com.toushishu.helloservice.com.toushishu.helloservice.models.Hello;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * The type Hello controller.
 */
@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    /**
     * Name hello.
     *
     * @param name the name
     * @return the hello
     */
    @RequestMapping(value = "/name/{name}", produces = "application/json")
    public Hello name(@PathVariable String name) {
        Hello hello = new Hello(name, "unknown", 1, new Date());
        return hello;
    }

    /**
     * Genre hello.
     *
     * @param genre the genre
     * @return the hello
     */
    @RequestMapping(value = "/genre/{genre}", produces = "application/json")
    public Hello genre(@PathVariable String genre) {
        Hello hello = new Hello("Franklin", genre, 1, new Date());
        return hello;
    }

    /**
     * Times hello.
     *
     * @param times the times
     * @return the hello
     */
    @RequestMapping(value = "/times/{times}", produces = "application/json")
    public Hello times(@PathVariable int times) {
        Hello hello = new Hello("Franklin", "unknown", times, new Date());
        return hello;
    }

    /**
     * Home hello.
     *
     * @return the hello
     */
    @RequestMapping(value = "/", produces = "application/json")
    public Hello home() {
        Hello hello = new Hello("Test", "female", 300, new Date());
        return hello;
    }
}
