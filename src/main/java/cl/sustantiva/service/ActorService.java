package cl.sustantiva.service;

import cl.sustantiva.entity.Actor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActorService {

    public void create(Actor a);
    public List<Actor> read();
    public Actor read(int actor_id);
    public void update(Actor a);
    public void delete(int actor_id);

}
