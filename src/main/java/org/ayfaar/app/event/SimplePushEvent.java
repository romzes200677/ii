package org.ayfaar.app.event;

public class SimplePushEvent extends PushEvent {
    public SimplePushEvent(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public SimplePushEvent(String title) {
        this.title = title;
    }
}
