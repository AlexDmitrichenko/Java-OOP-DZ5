package models;
import java.util.Date;

public class Reservation {
    private static int counter = 100;
    private final int id;
    private Date date;
    private String name;

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    {
        id = ++counter;
    }

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
