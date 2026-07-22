package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/root.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/root
 */
@Serializable(with = Root.Serializer::class)
public class Root(
  public val authorizationsUrl: String,
  public val codeSearchUrl: String,
  public val commitSearchUrl: String,
  public val currentUserAuthorizationsHtmlUrl: String,
  public val currentUserRepositoriesUrl: String,
  public val currentUserUrl: String,
  public val emailsUrl: String,
  public val emojisUrl: String,
  public val eventsUrl: String,
  public val feedsUrl: String,
  public val followersUrl: String,
  public val followingUrl: String,
  public val gistsUrl: String,
  public val issueSearchUrl: String,
  public val issuesUrl: String,
  public val keysUrl: String,
  public val labelSearchUrl: String,
  public val notificationsUrl: String,
  public val organizationRepositoriesUrl: String,
  public val organizationTeamsUrl: String,
  public val organizationUrl: String,
  public val publicGistsUrl: String,
  public val rateLimitUrl: String,
  public val repositorySearchUrl: String,
  public val repositoryUrl: String,
  public val starredGistsUrl: String,
  public val starredUrl: String,
  public val userOrganizationsUrl: String,
  public val userRepositoriesUrl: String,
  public val userSearchUrl: String,
  public val userUrl: String,
  public val hubUrl: String? = null,
  public val topicSearchUrl: String? = null,
) {
  public class Builder {
    private var authorizationsUrlValue: String? = null

    public var authorizationsUrl: String
      get() = requireNotNull(authorizationsUrlValue) { "authorizationsUrl is required" }
      set(`value`) {
        authorizationsUrlValue = value
      }

    private var codeSearchUrlValue: String? = null

    public var codeSearchUrl: String
      get() = requireNotNull(codeSearchUrlValue) { "codeSearchUrl is required" }
      set(`value`) {
        codeSearchUrlValue = value
      }

    private var commitSearchUrlValue: String? = null

    public var commitSearchUrl: String
      get() = requireNotNull(commitSearchUrlValue) { "commitSearchUrl is required" }
      set(`value`) {
        commitSearchUrlValue = value
      }

    private var currentUserAuthorizationsHtmlUrlValue: String? = null

    public var currentUserAuthorizationsHtmlUrl: String
      get() = requireNotNull(currentUserAuthorizationsHtmlUrlValue) { "currentUserAuthorizationsHtmlUrl is required" }
      set(`value`) {
        currentUserAuthorizationsHtmlUrlValue = value
      }

    private var currentUserRepositoriesUrlValue: String? = null

    public var currentUserRepositoriesUrl: String
      get() = requireNotNull(currentUserRepositoriesUrlValue) { "currentUserRepositoriesUrl is required" }
      set(`value`) {
        currentUserRepositoriesUrlValue = value
      }

    private var currentUserUrlValue: String? = null

    public var currentUserUrl: String
      get() = requireNotNull(currentUserUrlValue) { "currentUserUrl is required" }
      set(`value`) {
        currentUserUrlValue = value
      }

    private var emailsUrlValue: String? = null

    public var emailsUrl: String
      get() = requireNotNull(emailsUrlValue) { "emailsUrl is required" }
      set(`value`) {
        emailsUrlValue = value
      }

    private var emojisUrlValue: String? = null

    public var emojisUrl: String
      get() = requireNotNull(emojisUrlValue) { "emojisUrl is required" }
      set(`value`) {
        emojisUrlValue = value
      }

    private var eventsUrlValue: String? = null

    public var eventsUrl: String
      get() = requireNotNull(eventsUrlValue) { "eventsUrl is required" }
      set(`value`) {
        eventsUrlValue = value
      }

    private var feedsUrlValue: String? = null

    public var feedsUrl: String
      get() = requireNotNull(feedsUrlValue) { "feedsUrl is required" }
      set(`value`) {
        feedsUrlValue = value
      }

    private var followersUrlValue: String? = null

    public var followersUrl: String
      get() = requireNotNull(followersUrlValue) { "followersUrl is required" }
      set(`value`) {
        followersUrlValue = value
      }

    private var followingUrlValue: String? = null

    public var followingUrl: String
      get() = requireNotNull(followingUrlValue) { "followingUrl is required" }
      set(`value`) {
        followingUrlValue = value
      }

    private var gistsUrlValue: String? = null

    public var gistsUrl: String
      get() = requireNotNull(gistsUrlValue) { "gistsUrl is required" }
      set(`value`) {
        gistsUrlValue = value
      }

    private var issueSearchUrlValue: String? = null

    public var issueSearchUrl: String
      get() = requireNotNull(issueSearchUrlValue) { "issueSearchUrl is required" }
      set(`value`) {
        issueSearchUrlValue = value
      }

    private var issuesUrlValue: String? = null

    public var issuesUrl: String
      get() = requireNotNull(issuesUrlValue) { "issuesUrl is required" }
      set(`value`) {
        issuesUrlValue = value
      }

    private var keysUrlValue: String? = null

    public var keysUrl: String
      get() = requireNotNull(keysUrlValue) { "keysUrl is required" }
      set(`value`) {
        keysUrlValue = value
      }

    private var labelSearchUrlValue: String? = null

    public var labelSearchUrl: String
      get() = requireNotNull(labelSearchUrlValue) { "labelSearchUrl is required" }
      set(`value`) {
        labelSearchUrlValue = value
      }

    private var notificationsUrlValue: String? = null

    public var notificationsUrl: String
      get() = requireNotNull(notificationsUrlValue) { "notificationsUrl is required" }
      set(`value`) {
        notificationsUrlValue = value
      }

    private var organizationRepositoriesUrlValue: String? = null

    public var organizationRepositoriesUrl: String
      get() = requireNotNull(organizationRepositoriesUrlValue) { "organizationRepositoriesUrl is required" }
      set(`value`) {
        organizationRepositoriesUrlValue = value
      }

    private var organizationTeamsUrlValue: String? = null

    public var organizationTeamsUrl: String
      get() = requireNotNull(organizationTeamsUrlValue) { "organizationTeamsUrl is required" }
      set(`value`) {
        organizationTeamsUrlValue = value
      }

    private var organizationUrlValue: String? = null

    public var organizationUrl: String
      get() = requireNotNull(organizationUrlValue) { "organizationUrl is required" }
      set(`value`) {
        organizationUrlValue = value
      }

    private var publicGistsUrlValue: String? = null

    public var publicGistsUrl: String
      get() = requireNotNull(publicGistsUrlValue) { "publicGistsUrl is required" }
      set(`value`) {
        publicGistsUrlValue = value
      }

    private var rateLimitUrlValue: String? = null

    public var rateLimitUrl: String
      get() = requireNotNull(rateLimitUrlValue) { "rateLimitUrl is required" }
      set(`value`) {
        rateLimitUrlValue = value
      }

    private var repositorySearchUrlValue: String? = null

    public var repositorySearchUrl: String
      get() = requireNotNull(repositorySearchUrlValue) { "repositorySearchUrl is required" }
      set(`value`) {
        repositorySearchUrlValue = value
      }

    private var repositoryUrlValue: String? = null

    public var repositoryUrl: String
      get() = requireNotNull(repositoryUrlValue) { "repositoryUrl is required" }
      set(`value`) {
        repositoryUrlValue = value
      }

    private var starredGistsUrlValue: String? = null

    public var starredGistsUrl: String
      get() = requireNotNull(starredGistsUrlValue) { "starredGistsUrl is required" }
      set(`value`) {
        starredGistsUrlValue = value
      }

    private var starredUrlValue: String? = null

    public var starredUrl: String
      get() = requireNotNull(starredUrlValue) { "starredUrl is required" }
      set(`value`) {
        starredUrlValue = value
      }

    private var userOrganizationsUrlValue: String? = null

    public var userOrganizationsUrl: String
      get() = requireNotNull(userOrganizationsUrlValue) { "userOrganizationsUrl is required" }
      set(`value`) {
        userOrganizationsUrlValue = value
      }

    private var userRepositoriesUrlValue: String? = null

    public var userRepositoriesUrl: String
      get() = requireNotNull(userRepositoriesUrlValue) { "userRepositoriesUrl is required" }
      set(`value`) {
        userRepositoriesUrlValue = value
      }

    private var userSearchUrlValue: String? = null

    public var userSearchUrl: String
      get() = requireNotNull(userSearchUrlValue) { "userSearchUrl is required" }
      set(`value`) {
        userSearchUrlValue = value
      }

    private var userUrlValue: String? = null

    public var userUrl: String
      get() = requireNotNull(userUrlValue) { "userUrl is required" }
      set(`value`) {
        userUrlValue = value
      }

    public var hubUrl: String? = null

    public var topicSearchUrl: String? = null

    public fun build(): Root {
      check(authorizationsUrlValue != null) { "authorizationsUrl is required" }
      check(codeSearchUrlValue != null) { "codeSearchUrl is required" }
      check(commitSearchUrlValue != null) { "commitSearchUrl is required" }
      check(currentUserAuthorizationsHtmlUrlValue != null) { "currentUserAuthorizationsHtmlUrl is required" }
      check(currentUserRepositoriesUrlValue != null) { "currentUserRepositoriesUrl is required" }
      check(currentUserUrlValue != null) { "currentUserUrl is required" }
      check(emailsUrlValue != null) { "emailsUrl is required" }
      check(emojisUrlValue != null) { "emojisUrl is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(feedsUrlValue != null) { "feedsUrl is required" }
      check(followersUrlValue != null) { "followersUrl is required" }
      check(followingUrlValue != null) { "followingUrl is required" }
      check(gistsUrlValue != null) { "gistsUrl is required" }
      check(issueSearchUrlValue != null) { "issueSearchUrl is required" }
      check(issuesUrlValue != null) { "issuesUrl is required" }
      check(keysUrlValue != null) { "keysUrl is required" }
      check(labelSearchUrlValue != null) { "labelSearchUrl is required" }
      check(notificationsUrlValue != null) { "notificationsUrl is required" }
      check(organizationRepositoriesUrlValue != null) { "organizationRepositoriesUrl is required" }
      check(organizationTeamsUrlValue != null) { "organizationTeamsUrl is required" }
      check(organizationUrlValue != null) { "organizationUrl is required" }
      check(publicGistsUrlValue != null) { "publicGistsUrl is required" }
      check(rateLimitUrlValue != null) { "rateLimitUrl is required" }
      check(repositorySearchUrlValue != null) { "repositorySearchUrl is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(starredGistsUrlValue != null) { "starredGistsUrl is required" }
      check(starredUrlValue != null) { "starredUrl is required" }
      check(userOrganizationsUrlValue != null) { "userOrganizationsUrl is required" }
      check(userRepositoriesUrlValue != null) { "userRepositoriesUrl is required" }
      check(userSearchUrlValue != null) { "userSearchUrl is required" }
      check(userUrlValue != null) { "userUrl is required" }
      return Root(
        authorizationsUrl = authorizationsUrl,
        codeSearchUrl = codeSearchUrl,
        commitSearchUrl = commitSearchUrl,
        currentUserAuthorizationsHtmlUrl = currentUserAuthorizationsHtmlUrl,
        currentUserRepositoriesUrl = currentUserRepositoriesUrl,
        currentUserUrl = currentUserUrl,
        emailsUrl = emailsUrl,
        emojisUrl = emojisUrl,
        eventsUrl = eventsUrl,
        feedsUrl = feedsUrl,
        followersUrl = followersUrl,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        issueSearchUrl = issueSearchUrl,
        issuesUrl = issuesUrl,
        keysUrl = keysUrl,
        labelSearchUrl = labelSearchUrl,
        notificationsUrl = notificationsUrl,
        organizationRepositoriesUrl = organizationRepositoriesUrl,
        organizationTeamsUrl = organizationTeamsUrl,
        organizationUrl = organizationUrl,
        publicGistsUrl = publicGistsUrl,
        rateLimitUrl = rateLimitUrl,
        repositorySearchUrl = repositorySearchUrl,
        repositoryUrl = repositoryUrl,
        starredGistsUrl = starredGistsUrl,
        starredUrl = starredUrl,
        userOrganizationsUrl = userOrganizationsUrl,
        userRepositoriesUrl = userRepositoriesUrl,
        userSearchUrl = userSearchUrl,
        userUrl = userUrl,
        hubUrl = hubUrl,
        topicSearchUrl = topicSearchUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Root = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Root> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Root {
      val jsonDecoder = decoder.requireJsonDecoder("Root")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Root must be a JSON object")
      val authorizationsUrl = json.decodeRequired<String>(rawObject, "authorizations_url")
      val codeSearchUrl = json.decodeRequired<String>(rawObject, "code_search_url")
      val commitSearchUrl = json.decodeRequired<String>(rawObject, "commit_search_url")
      val currentUserAuthorizationsHtmlUrl = json.decodeRequired<String>(rawObject, "current_user_authorizations_html_url")
      val currentUserRepositoriesUrl = json.decodeRequired<String>(rawObject, "current_user_repositories_url")
      val currentUserUrl = json.decodeRequired<String>(rawObject, "current_user_url")
      val emailsUrl = json.decodeRequired<String>(rawObject, "emails_url")
      val emojisUrl = json.decodeRequired<String>(rawObject, "emojis_url")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val feedsUrl = json.decodeRequired<String>(rawObject, "feeds_url")
      val followersUrl = json.decodeRequired<String>(rawObject, "followers_url")
      val followingUrl = json.decodeRequired<String>(rawObject, "following_url")
      val gistsUrl = json.decodeRequired<String>(rawObject, "gists_url")
      val issueSearchUrl = json.decodeRequired<String>(rawObject, "issue_search_url")
      val issuesUrl = json.decodeRequired<String>(rawObject, "issues_url")
      val keysUrl = json.decodeRequired<String>(rawObject, "keys_url")
      val labelSearchUrl = json.decodeRequired<String>(rawObject, "label_search_url")
      val notificationsUrl = json.decodeRequired<String>(rawObject, "notifications_url")
      val organizationRepositoriesUrl = json.decodeRequired<String>(rawObject, "organization_repositories_url")
      val organizationTeamsUrl = json.decodeRequired<String>(rawObject, "organization_teams_url")
      val organizationUrl = json.decodeRequired<String>(rawObject, "organization_url")
      val publicGistsUrl = json.decodeRequired<String>(rawObject, "public_gists_url")
      val rateLimitUrl = json.decodeRequired<String>(rawObject, "rate_limit_url")
      val repositorySearchUrl = json.decodeRequired<String>(rawObject, "repository_search_url")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val starredGistsUrl = json.decodeRequired<String>(rawObject, "starred_gists_url")
      val starredUrl = json.decodeRequired<String>(rawObject, "starred_url")
      val userOrganizationsUrl = json.decodeRequired<String>(rawObject, "user_organizations_url")
      val userRepositoriesUrl = json.decodeRequired<String>(rawObject, "user_repositories_url")
      val userSearchUrl = json.decodeRequired<String>(rawObject, "user_search_url")
      val userUrl = json.decodeRequired<String>(rawObject, "user_url")
      return Root(
        authorizationsUrl = authorizationsUrl,
        codeSearchUrl = codeSearchUrl,
        commitSearchUrl = commitSearchUrl,
        currentUserAuthorizationsHtmlUrl = currentUserAuthorizationsHtmlUrl,
        currentUserRepositoriesUrl = currentUserRepositoriesUrl,
        currentUserUrl = currentUserUrl,
        emailsUrl = emailsUrl,
        emojisUrl = emojisUrl,
        eventsUrl = eventsUrl,
        feedsUrl = feedsUrl,
        followersUrl = followersUrl,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        issueSearchUrl = issueSearchUrl,
        issuesUrl = issuesUrl,
        keysUrl = keysUrl,
        labelSearchUrl = labelSearchUrl,
        notificationsUrl = notificationsUrl,
        organizationRepositoriesUrl = organizationRepositoriesUrl,
        organizationTeamsUrl = organizationTeamsUrl,
        organizationUrl = organizationUrl,
        publicGistsUrl = publicGistsUrl,
        rateLimitUrl = rateLimitUrl,
        repositorySearchUrl = repositorySearchUrl,
        repositoryUrl = repositoryUrl,
        starredGistsUrl = starredGistsUrl,
        starredUrl = starredUrl,
        userOrganizationsUrl = userOrganizationsUrl,
        userRepositoriesUrl = userRepositoriesUrl,
        userSearchUrl = userSearchUrl,
        userUrl = userUrl,
        hubUrl = rawObject["hub_url"]?.let { json.decodeFromJsonElement<String>(it) },
        topicSearchUrl = rawObject["topic_search_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Root) {
      val jsonEncoder = encoder.requireJsonEncoder("Root")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("authorizations_url", value.authorizationsUrl)
        put("code_search_url", value.codeSearchUrl)
        put("commit_search_url", value.commitSearchUrl)
        put("current_user_authorizations_html_url", value.currentUserAuthorizationsHtmlUrl)
        put("current_user_repositories_url", value.currentUserRepositoriesUrl)
        put("current_user_url", value.currentUserUrl)
        put("emails_url", value.emailsUrl)
        put("emojis_url", value.emojisUrl)
        put("events_url", value.eventsUrl)
        put("feeds_url", value.feedsUrl)
        put("followers_url", value.followersUrl)
        put("following_url", value.followingUrl)
        put("gists_url", value.gistsUrl)
        put("issue_search_url", value.issueSearchUrl)
        put("issues_url", value.issuesUrl)
        put("keys_url", value.keysUrl)
        put("label_search_url", value.labelSearchUrl)
        put("notifications_url", value.notificationsUrl)
        put("organization_repositories_url", value.organizationRepositoriesUrl)
        put("organization_teams_url", value.organizationTeamsUrl)
        put("organization_url", value.organizationUrl)
        put("public_gists_url", value.publicGistsUrl)
        put("rate_limit_url", value.rateLimitUrl)
        put("repository_search_url", value.repositorySearchUrl)
        put("repository_url", value.repositoryUrl)
        put("starred_gists_url", value.starredGistsUrl)
        put("starred_url", value.starredUrl)
        put("user_organizations_url", value.userOrganizationsUrl)
        put("user_repositories_url", value.userRepositoriesUrl)
        put("user_search_url", value.userSearchUrl)
        put("user_url", value.userUrl)
        value.hubUrl?.let { put("hub_url", it) }
        value.topicSearchUrl?.let { put("topic_search_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun root(block: Root.Builder.() -> Unit): Root = Root.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Root is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
