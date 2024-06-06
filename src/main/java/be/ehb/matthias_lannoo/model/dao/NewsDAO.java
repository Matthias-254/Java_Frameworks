package be.ehb.matthias_lannoo.model.dao;

import be.ehb.matthias_lannoo.model.tables.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsDAO extends CrudRepository<News, Integer>{
}
