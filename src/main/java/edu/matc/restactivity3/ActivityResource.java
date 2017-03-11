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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString(activityList.get(7));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return Response.status(200).entity(jsonInString).build();
    }

    @GET
    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAllActivities() throws JsonProcessingException {
        List<Activity> activityList;

        ActivityDao dao = new ActivityDao();
        activityList = dao.getAllActivities();

        ObjectMapper mapper = new ObjectMapper();
        String allActivities = null;

        for (Activity activity : activityList) {
            allActivities = allActivities + mapper.writeValueAsString(activity);

        }


        return Response.status(200).entity(allActivities).build();

    }



}
