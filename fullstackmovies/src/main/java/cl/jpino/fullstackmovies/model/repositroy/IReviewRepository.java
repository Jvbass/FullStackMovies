package cl.jpino.fullstackmovies.model.repositroy;

import cl.jpino.fullstackmovies.model.entity.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReviewRepository extends MongoRepository<Review, ObjectId> {

}
