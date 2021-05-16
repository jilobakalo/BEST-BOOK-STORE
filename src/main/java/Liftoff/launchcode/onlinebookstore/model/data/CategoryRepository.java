package Liftoff.launchcode.onlinebookstore.model.data;

import Liftoff.launchcode.onlinebookstore.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CategoryRepository extends CrudRepository<Category,Integer> {
}
