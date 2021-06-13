package pt.iade.unimanagerdb.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.unimanagerdb.models.Avatar;


public interface AvatarRepository extends CrudRepository<Avatar,Integer> {
    
}
