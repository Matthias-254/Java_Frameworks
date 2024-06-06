package be.ehb.matthias_lannoo.model.dao;

import be.ehb.matthias_lannoo.model.tables.Reporter;
import org.springframework.data.repository.CrudRepository;

public interface ReporterDAO extends CrudRepository<Reporter, Integer> {
}
