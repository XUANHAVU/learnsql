package com.thanglongedu.learnsql.repository.search;

import com.thanglongedu.learnsql.domain.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Customer entity.
 */
public interface CustomerSearchRepository extends ElasticsearchRepository<Customer, Long> {
}
