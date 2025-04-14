package com.Hari.RabbitMq.controller;

import com.Hari.RabbitMq.service.RabbitMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rabbit")
public class RabbitMqController {

        @Autowired
        private RabbitMqProducer producer;

        @PostMapping("/send")
        public String send(@RequestParam String message) {
            producer.sendMessage(message);
            return "Message sent!";
        }


}
