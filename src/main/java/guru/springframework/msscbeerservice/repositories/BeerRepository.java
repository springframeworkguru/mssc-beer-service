package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by jt on 2019-05-17.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
