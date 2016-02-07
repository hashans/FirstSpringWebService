package web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hashan on 2/7/16.
 */
@RestController
public class PersonController {

    AtomicInteger atomicInteger = new AtomicInteger();

    @RequestMapping("/person")
    public Person person(){
        return new Person(atomicInteger.incrementAndGet(),"Hashan",25);
    }
}
