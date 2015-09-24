package com.marbink.spring.hr.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class StubHumanResourceService implements HumanResourceService {

    private static final Logger LOG = LoggerFactory.getLogger(StubHumanResourceService.class);

    public void bookHoliday(Date startDate, Date endDate, String name) {

        LOG.debug("{} : bookHoliday(..)", this.getClass());

        System.out.println("Booking holiday for [" + startDate + "-" + endDate + "] for [" + name + "] ");
    }
}