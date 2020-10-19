package location.proccessors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import location.entities.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

@Service
public class UserProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserProcessor.class);

    private List<Consumer<User>> listeners = new CopyOnWriteArrayList<>();

    public void register(Consumer<User> listener) {
        listeners.add(listener);
        LOGGER.info("Added a listener, for a total of {} listener{}", listeners.size(), listeners.size() > 1 ? "s" : "");
    }


    public void process(User user) {
    	System.out.println("Processing: "+user);
        listeners.forEach(c -> c.accept(user));
    }
}
