package dev.frs.Contentcalender.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import dev.frs.Contentcalender.Model.Content;
import dev.frs.Contentcalender.Repository.ContentRepository;

@RestController
@RequestMapping("/api/content")
public class ContentController {
//to inject the repo with its methods inside to controller so it can be used
    @Autowired
    private ContentRepository repository;
   
    public ContentController(ContentRepository repo){
       repo = this.repository;

    }
    @GetMapping("")
    public List<Content> findAll(){
        return (List<Content>) repository.findAll();
    }
    @GetMapping("/{id}")
    public Content getById(@PathVariable Integer id ){
        System.out.println("by id");
        return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "content not found"));
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create (@RequestBody Content content){
        repository.save(content);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody Content content ,@PathVariable Integer id){
        if(!repository.existsById(id)){
            System.out.println("here in update function to execut the put http method");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Content not found");
        }
       // repository.delete(getById(id));
       Optional<Content> content1 = repository.findById(id);
       content1.get().setStatus(content.getStatus());
       content1.get().setTitle(content.getTitle());
       content1.get().setType(content.getType());
       content1.get().setDescription(content.getDescription());
       content1.get().setUrl(content.getUrl());
       content1.get().setDateUpdate(content.getDateUpdate());
       content1.get().setDateCreated(content.getDateCreated());

        repository.save(content1.get());

    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }

    // @GetMapping("/filter/{keyword}")
    // public List<Content> getByTitle(@PathVariable String keyword){
    //     return repository.findAllByTitleContains(keyword);
    // }
}
