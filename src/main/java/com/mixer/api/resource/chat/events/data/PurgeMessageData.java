package com.mixer.api.resource.chat.events.data;

import com.google.gson.annotations.SerializedName;
import com.mixer.api.resource.chat.AbstractChatEvent;

public class PurgeMessageData extends AbstractChatEvent.EventData {
    public ModeratorData moderator;
    @SerializedName("user_id") public int userId;
    public CauseData cause;
}
