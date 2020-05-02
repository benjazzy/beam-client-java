package com.mixer.api.resource.chat.events;

import com.mixer.api.resource.chat.AbstractChatEvent;
import com.mixer.api.resource.chat.events.data.DeleteMessageData;

public class ClearMessagesEvent extends AbstractChatEvent<DeleteMessageData> {
    public ClearMessagesEvent() {
        this.type = Type.EVENT;
    }
}
