package test;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PropertyRepository extends PagingAndSortingRepository<Property, Long> {
}