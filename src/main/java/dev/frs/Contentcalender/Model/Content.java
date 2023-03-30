package dev.frs.Contentcalender.Model;

import java.time.LocalDateTime;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@EntityScan
public class Content {
    @Id
    Integer id;
    String title;
    String description;
    Status status;
    Type type;
    @Column(value="datecreated")
    LocalDateTime dateCreated;
     @Column(value ="dateupdate")
    LocalDateTime dateUpdate;
    String url;





    
    public Content() {
    }
    
    public Content(Integer id, String title, String description, Status status, Type type, LocalDateTime dateCreated,
            LocalDateTime dateUpdate, String url) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.type = type;
        this.dateCreated = dateCreated;
     
        this.dateUpdate = dateUpdate;
        this.url = url;
    }

    


    public Content(String title, String description, Status status, Type type, LocalDateTime dateCreated,
            LocalDateTime dateUpdate, String url) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.type = type;
        this.dateCreated = dateCreated;
        this.dateUpdate = dateUpdate;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }
    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    

    
}
