package edu.matc.restactivity3;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2/26/17.
 *
 * @author O Collins
 */
//Defines the base URI for all resource URIs.
@ApplicationPath("/")

//The java class declares root resource and provider classes
//Works with the jersey servlet. Allows accessing this as a service
public class FirstRestful extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(RestClass.class );
        h.add(RestClass2.class );
        return h;
    }
}