package dev.frs.Contentcalender.Repository;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import dev.frs.Contentcalender.Model.Content;
import dev.frs.Contentcalender.Model.Status;
import dev.frs.Contentcalender.Model.Type;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository(){

    }
    public List<Content> findAll(){
        Integer id = Integer.valueOf(1);
        Content c = new Content(id, "video", "video to test", Status.IDEA, Type.VIDEO, LocalDateTime.now(), LocalDateTime.now(), "http:www");
        contentList.add(c);
    
        return contentList;
    }

    public Optional<Content> findById( Integer id){
        return contentList.stream().filter(c -> c.getId().equals(id)).findFirst();
    }
    @PostConstruct
    private void init(){
       Integer id = Integer.valueOf(1);
        Content c = new Content(
            id, "video",
         "video to test", 
         Status.IDEA,
          Type.VIDEO,
           LocalDateTime.now(),
           LocalDateTime.now(),
            "http:www");
        contentList.add(c);
    }

    public void save(@RequestBody Content content) {
        contentList.removeIf(c -> c.getId().equals(content.getId()));
        contentList.add(content); 
    }
    public boolean existByid(Integer id) {
        // if(findById(id)!=null){
        //     return true;
        // }
        // return false;
        return contentList.stream().filter(c->c.getId().equals(id)).count()==1;
    }
    public void deleteById(Integer id) {
        contentList.removeIf(c -> c.getId().equals(id));
    }
   
}
