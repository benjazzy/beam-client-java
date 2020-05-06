package com.mixer.api.resource.chat.events;

import com.mixer.api.resource.chat.AbstractChatEvent;
import com.mixer.api.resource.chat.events.data.UserTimeoutData;

public class UserTimeoutEvent extends AbstractChatEvent<UserTimeoutData> {
    public UserTimeoutEvent() {
        this.event = EventType.USER_TIMEOUT;
    }
}
