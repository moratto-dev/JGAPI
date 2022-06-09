package dev.JGAPI.JG_API.Events.TeamChannel;

import dev.JGAPI.JG_API.Entities.Channels.ServerChannel;
import dev.JGAPI.JG_API.JG_API;

public class TeamChannelCreatedEvent extends GenericTeamChannelEvent {
    public TeamChannelCreatedEvent(JG_API jg_api, String serverId, ServerChannel channel) {
        super(jg_api, serverId, channel);
    }
}