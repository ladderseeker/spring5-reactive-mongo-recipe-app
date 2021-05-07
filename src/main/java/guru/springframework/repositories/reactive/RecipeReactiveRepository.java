package guru.springframework.repositories.reactive;

import guru.springframework.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author XIAO JIN
 * @date 2021/05/07/ 10:12
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String>{
}
