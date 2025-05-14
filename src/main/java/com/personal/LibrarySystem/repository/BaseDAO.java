package com.personal.LibrarySystem.repository;

import java.sql.SQLException;
import java.util.List;

public interface BaseDAO <T,ID>{

    void save (T entity);
    void update (T entity);
    void delete (T entity);
    T findById (int id);
    List<T> findAll ();

}
