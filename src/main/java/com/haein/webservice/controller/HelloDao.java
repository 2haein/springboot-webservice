package com.haein.webservice.controller;

import org.springframework.data.jpa.repository.JpaRepository;


public interface HelloDao extends JpaRepository <Hello, Integer> {

}