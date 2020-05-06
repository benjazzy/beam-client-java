package com.mixer.api.resource.chat.replies;

import com.google.gson.annotations.SerializedName;
import com.mixer.api.resource.chat.AbstractChatReply;

public class VoteStartReply extends AbstractChatReply {
    public @SerializedName("data") String message;
}
