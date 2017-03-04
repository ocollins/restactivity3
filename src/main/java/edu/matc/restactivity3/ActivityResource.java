package edu.matc.restactivity3;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.*;

/**
 * Activity service
 *
 * @author O Collins
 */
@Path("/activity")
public class ActivityResource {
    private final Logger logger = Logger.getLogger(this.getClass());

    @GET
    @Path("/one")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getActivity() {
        List<Activity> activityList;
        ActivityDao dao = new ActivityDao();
        activityList = dao.getAllActivities();
        return Response.status(200).entity(activityList.get(7).getName()).build();
    }

    @GET
    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAllActivities() {
        List<Activity> activityList;
        ActivityDao dao = new ActivityDao();
        activityList = dao.getAllActivities();
        String allActivities = null;
        for(Activity activity: activityList) {
            allActivities = allActivities + activity.toString();

        }

        return Response.status(200).entity(allActivities).build();

        //logger.info("&&&&&&&&&&&&&&& " + activityList.get(7).getName());
        //return Response.status(200).entity(activityList.get(7).getName()).build();
        //return Response.ok().type(MediaType.APPLICATION_JSON_TYPE).build();

    }



}
