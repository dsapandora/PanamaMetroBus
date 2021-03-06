package pa.com.dsalab.metrobussandroid.api;

import java.util.List;

/**
 * Created by Ariel Vernaza on 04/29/15.
 */
public class QueryStationModel {

    public String status;
    public StationData data;

    public static class StationData {

        public int id;
        public String name;
        public double lat;
        public double lon;
        public List<Route> routes;
    }

    public static class Route {
        public List<Trip> trips;
        public String name;
        public String url;
        public int id;
    }

    public static class Trip{
        public int id;
        public String sequence;
        public int stop_id;
        public int trip_id;
    }

}