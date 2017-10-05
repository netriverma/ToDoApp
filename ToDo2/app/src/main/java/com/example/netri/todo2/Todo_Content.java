package com.example.netri.todo2;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Netri on 24-03-2017.
 */
@Table(name ="Todo")
public class Todo_Content extends Model {
    @Column(name="Title")
    String todo_title;
    @Column(name="Desc")
    String todo_description;
    @Column
    long dateAndTime;
    @Column(name="List")
    String list;

    Todo_Content(String todo_title, String todo_description, long dateAndTime,String list)
    {
        this.todo_title=todo_title;
        this.todo_description=todo_description;
        this.dateAndTime=dateAndTime;
        this.list=list;
    }


}
