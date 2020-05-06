package com.mixer.api.resource.chat.events.data;

import com.google.gson.annotations.SerializedName;
import com.mixer.api.resource.MixerUser;
import com.mixer.api.resource.chat.AbstractChatEvent;

import java.util.List;

public class UserUpdateData extends AbstractChatEvent.EventData {
    public @SerializedName("user") int userId;
    public List<MixerUser.Role> roles;
}
