package com.mixer.api.resource.chat.events;

import com.mixer.api.resource.chat.AbstractChatEvent;
import com.mixer.api.resource.chat.events.data.ClearMessagesData;

public class ClearMessagesEvent extends AbstractChatEvent<ClearMessagesData> {
    public ClearMessagesEvent() {
        this.type = Type.EVENT;
    }
}
