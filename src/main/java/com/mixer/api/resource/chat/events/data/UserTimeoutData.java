package com.mixer.api.resource.chat.events.data;

import com.mixer.api.resource.chat.AbstractChatEvent;

public class UserTimeoutData extends AbstractChatEvent.EventData {
    public UserData user;
    public int duration;
}
