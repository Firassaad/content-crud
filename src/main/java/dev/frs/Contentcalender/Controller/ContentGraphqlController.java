package dev.frs.Contentcalender.Controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import dev.frs.Contentcalender.Model.Content;
import dev.frs.Contentcalender.Repository.ContentCollectionRepository;
import dev.frs.Contentcalender.Repository.ContentRepository;

@Controller
public class ContentGraphqlController {
    private final ContentCollectionRepository contentRepository;

    public ContentGraphqlController(ContentCollectionRepository contentRepository) {
        this.contentRepository = contentRepository;
    }



    // @QueryMapping
    @SchemaMapping(typeName = "Query", value = "AllContent")
    public List<Content> AllContent(){
        System.out.println("test ------------------------+"+contentRepository.findAll().get(0).toString());
        return (List<Content>) contentRepository.findAll();
      
    }

    
}
