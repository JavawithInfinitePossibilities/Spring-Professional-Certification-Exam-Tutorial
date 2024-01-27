package com.sid.tutorials.spring.module01.beans;

import org.springframework.stereotype.Component;

@Component
class Gearbox {
    void putIntoDrivePosition() {
        System.out.println("Putting Gearbox into Drive Position");
    }
}
