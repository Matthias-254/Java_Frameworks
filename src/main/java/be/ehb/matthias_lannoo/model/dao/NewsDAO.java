package be.ehb.matthias_lannoo.model.dao;

import be.ehb.matthias_lannoo.model.tables.News;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsDAO extends CrudRepository<News, Integer>{
    List<News> findTop10ByOrderByIdDesc();
}
