package cl.sustantiva.service;

import cl.sustantiva.entity.Actor;
import cl.sustantiva.repos.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    ActorRepo ar;
    @Override
    public void create(Actor a) {
        ar.save(a);
    }

    @Override
    public List<Actor> read() {
        return ar.findAll();
    }

    @Override
    public Actor read(int actor_id) {
        return ar.findById(actor_id).orElse(new Actor());
    }

    @Override
    public void update(Actor a) {
        ar.save(a);
    }

    @Override
    public void delete(int actor_id) {
        ar.delete(ar.getOne(actor_id));
    }
}
