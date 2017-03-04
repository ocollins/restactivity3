package edu.matc.restactivity3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by student on 3/3/17.
 *
 * @author O Collins
 */
public class ActivityDaoTest {
    @Test
    public void getAllActivities() throws Exception {
        ActivityDao dao = new ActivityDao();
        List<Activity> activityList = new ArrayList<Activity>();
        activityList = dao.getAllActivities();

        assertEquals("tennis", activityList.get(7).getName());
        //assertEquals("??", activityList.toString());


    }

}