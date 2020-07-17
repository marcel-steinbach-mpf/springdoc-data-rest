package test;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ChildPropertyRepository extends PagingAndSortingRepository<ChildProperty, Long> {
}