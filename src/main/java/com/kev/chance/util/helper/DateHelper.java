/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kev.chance.util.helper;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 *
 * @author Kevin
 */
public class DateHelper {

    public static long getStartOfCurrentWeekEpoch() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startOfWeek = now.with(DayOfWeek.MONDAY).withHour(0).withMinute(0).withSecond(0).withNano(0);
        Instant instant = startOfWeek.atZone(ZoneId.systemDefault()).toInstant();
        return instant.toEpochMilli();
    }

    public static long getEndOfCurrentWeekEpoch() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endOfWeek = now.with(DayOfWeek.SUNDAY).withHour(23).withMinute(59).withSecond(59).withNano(999999999);
        Instant instant = endOfWeek.atZone(ZoneId.systemDefault()).toInstant();
        return instant.toEpochMilli();
    }
}
