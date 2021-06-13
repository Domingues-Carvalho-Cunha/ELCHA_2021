package pt.iade.unimanagerdb.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.unimanagerdb.models.Avatar;
import pt.iade.unimanagerdb.models.exceptions.NotFoundException;
import pt.iade.unimanagerdb.models.repositories.AvatarRepository;


@RestController
@RequestMapping(path="/api/avatars")
public class AvatarController {
    private Logger logger = LoggerFactory.getLogger(AvatarController.class);
  @Autowired
  private AvatarRepository avatarRepository;
  
  @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
  public Iterable<Avatar> getAvatars() {
    logger.info("Sending all avatar");
    return avatarRepository.findAll();
  }

}