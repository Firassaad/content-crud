package dev.frs.Contentcalender.Repository;

import org.springframework.data.repository.CrudRepository;

import dev.frs.Contentcalender.Model.Content;

public interface ContentRepository extends CrudRepository<Content,Integer>
 {
    //  @Query(
        
    //     'SELECT * FROM Content Where title like "%?1%';)
    // List<Content> findAllByTitleContains(String keyword);
//      {
//         return null;
//     }
 }
