package com.practice.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.files.model.DatabaseFile;


@Repository
public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, String> {

}
