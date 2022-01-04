package com.example.soonami;

public class Event {

    /** Title of the earthquake event */
    public final String title;

    /** Time that the earthquake happened (in milliseconds) */
    public final long time;

    /** Whether or not a tsunami alert was issued (1 if it was issued, 0 if no alert was issued) */
    public final int tsunamiAlert;


    public Event(String eventTitle, long eventTime, int eventTsunamiAlert) {
        title = eventTitle;
        time = eventTime;
        tsunamiAlert = eventTsunamiAlert;
    }
}

