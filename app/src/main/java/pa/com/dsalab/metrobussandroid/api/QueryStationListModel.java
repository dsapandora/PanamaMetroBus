package pa.com.dsalab.metrobussandroid.api;

import java.util.ArrayList;

/**
 * Created by Ariel Vernaza on 04/29/15.
 */
public class QueryStationListModel {

    public String status;
    public ArrayList<Station> data;

    public static class Station {
            public String id;
            public String name;
            public double lat;
            public double lon;
    }
}
