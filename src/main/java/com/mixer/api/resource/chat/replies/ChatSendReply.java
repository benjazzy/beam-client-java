package com.mixer.api.resource.chat.replies;

import com.google.gson.annotations.SerializedName;
import com.mixer.api.resource.chat.AbstractChatReply;
import com.mixer.api.resource.chat.events.data.IncomingMessageData;

public class ChatSendReply extends AbstractChatReply {
    public @SerializedName("data") IncomingMessageData message;
}
