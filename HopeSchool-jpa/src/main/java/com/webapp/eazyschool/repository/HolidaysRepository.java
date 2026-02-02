package com.webapp.eazyschool.repository;

import com..eazyschool.model.Holiday;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
@Repository stereotype annotation is used to add a bean of this class
type to the Spring context and indicate that given Bean is used to perform
DB related operations and
* */
@Repository
public interface HolidaysRepository extends CrudRepository<com.eazybytes.eazyschool.model.Holiday, String>  {


}