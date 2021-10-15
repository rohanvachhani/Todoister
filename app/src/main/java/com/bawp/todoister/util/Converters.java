package com.bawp.todoister.util;

import androidx.room.TypeConverter;

import com.bawp.todoister.model.Priority;

import java.util.Date;

public class Converters {

    //long to date
    @TypeConverter
    public static Date fromTimeStamp(Long value){
        return value == null ? null : new Date(value);
    }

    //date to Long
    @TypeConverter
    public static Long dateToTimeStamp(Date date){
        return date == null ? null : date.getTime();
    }

    //Priority enum to string
    @TypeConverter
    public static String fromPriority(Priority priority){
        return priority == null ? null : Priority.HIGH.toString();
    }

    //string to priority enum
    @TypeConverter
    public static Priority toPriority(String priority){
        return priority == null ? null : Priority.valueOf(priority);
    }


}
