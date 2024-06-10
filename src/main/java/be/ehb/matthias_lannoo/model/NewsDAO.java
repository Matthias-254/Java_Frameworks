package be.ehb.matthias_lannoo.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsDAO extends CrudRepository<News, Integer>{
    List<News> findTop10ByOrderByIdDesc();
}
