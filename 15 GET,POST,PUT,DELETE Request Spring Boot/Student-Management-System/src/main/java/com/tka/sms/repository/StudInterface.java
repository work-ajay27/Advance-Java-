package com.tka.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.tka.sms.model.Student;

public interface StudInterface extends JpaRepository<Student, Integer> {

}
