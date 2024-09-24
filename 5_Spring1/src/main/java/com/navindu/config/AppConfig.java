package com.navindu.config;

import com.navindu.Alien;
import com.navindu.Computer;
import com.navindu.Desktop;
import com.navindu.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.navindu")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer com) {  // @Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(24);
//        obj.setCom(com);
//        return obj;
//    }
//
////    @Bean(name = {"com2", "desktop1", "beast"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }

}
