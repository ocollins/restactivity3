package edu.matc.restactivity3;

import edu.matc.restactivity3.Activity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.*;

/**
 * Created by student on 3/3/17.
 *
 * @author O Collins
 */
public class ActivityDao {
    private final Logger logger = Logger.getLogger(this.getClass());

        /** Return a list of all activities
         *
         * @return All activities
         */
        public List<Activity> getAllActivities() {
            List<Activity> activities = new ArrayList<Activity>();
            Session session = SessionFactoryProvider.getSessionFactory().openSession();

            try {
                activities = session.createCriteria(Activity.class).list();
            } catch (HibernateException he) {
                logger.info("Hibernate Exception " + he);
            } finally {
                session.close();
            }
            return activities;
        }

}
