package dev.jgapi.jg_api.entities.docs;

import dev.jgapi.jg_api.JG_API;
import dev.jgapi.jg_api.entities.GuildedObject;
import dev.jgapi.jg_api.entities.channels.Mentions;
import dev.jgapi.jg_api.rest.RestAction;

import java.time.Instant;

public class Doc extends GuildedObject {
    private int id;
    private String serverId;
    private String channelId;
    private String title;
    private String content;
    private Mentions mentions;
    private Instant createdAt;
    private String createdby;
    private Instant updatedAt;
    private String updatedBy;
    public Doc(JG_API jg_api, int id, String serverId, String channelId, String title, String content, Mentions mentions, Instant createdAt, String createdBy, Instant updatedAt, String updatedBy) {
        super(jg_api);
        this.id = id;
        this.serverId = serverId;
        this.channelId = channelId;
        this.title = title;
        this.content = content;
        this.mentions = mentions;
        this.createdAt = createdAt;
        this.createdby = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public int getId() {
        return this.id;
    }

    public String getServerId() {
        return this.serverId;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public Mentions getMentions() {
        return this.mentions;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedby() {
        return this.createdby;
    }

    public Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public RestAction delete() {
        return jg_api.getRestClient().deleteDoc(this.channelId, this.id);
    }
    public RestAction update(String title, String content) {
        return jg_api.getRestClient().updateDoc(this.channelId, this.id, title, content);
    }
    public RestAction setTitle(String title) {
        return jg_api.getRestClient().updateDoc(this.channelId, this.id, title, this.content);
    }
    public RestAction setContent(String content) {
        return jg_api.getRestClient().updateDoc(this.channelId, this.id, this.title, content);
    }
}
