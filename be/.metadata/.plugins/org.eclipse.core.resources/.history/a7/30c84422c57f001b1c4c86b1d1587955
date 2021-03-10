package com.example.demo.hal.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.exh.domain.Exhbn;

import lombok.Getter;

@Entity @Getter @Table(name = "halls")
public class Hall {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hall_num") private int hallNum;
    @Column(name = "hall_name") private String hallName;
    @Column(name = "hall_location") private String hallLocation;
    @Column(name = "hall_time") private String hallTime;
    @Column(name = "hall_closed") private String hallClosed;
    @Column(name = "hall_pnumber") private String hallPnumber;
    @Column(name = "hall_info")private String hallInfo;
    @Column(name = "hall_image")private String hallImage;
    
    
    @OneToMany(mappedBy = "hall")
    private List<Exhbn> exhbnList = new ArrayList<>();
}
/*
create table shows(
   show_num int primary key auto_increment,
   title varchar(30),
   period varchar(30),
   time varchar(20),
   venue varchar(20),
   admission varchar(20),
   price varchar(100),
   host varchar(20),
   management varchar(20),
   inquiry varchar(20)
   );
   poster_image varchar(100)*/