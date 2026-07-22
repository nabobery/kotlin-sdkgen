package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Feed
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/feed
 */
@Serializable(with = Feed.Serializer::class)
public class Feed(
  public val links: InlineFeedLinksX36138634,
  public val timelineUrl: String,
  public val userUrl: String,
  public val currentUserActorUrl: String? = null,
  public val currentUserOrganizationUrl: String? = null,
  public val currentUserOrganizationUrls: List<String>? = null,
  public val currentUserPublicUrl: String? = null,
  public val currentUserUrl: String? = null,
  /**
   * A feed of discussions for a given repository and category.
   */
  public val repositoryDiscussionsCategoryUrl: String? = null,
  /**
   * A feed of discussions for a given repository.
   */
  public val repositoryDiscussionsUrl: String? = null,
  public val securityAdvisoriesUrl: String? = null,
) {
  public class Builder {
    private var linksValue: InlineFeedLinksX36138634? = null

    public var links: InlineFeedLinksX36138634
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var timelineUrlValue: String? = null

    public var timelineUrl: String
      get() = requireNotNull(timelineUrlValue) { "timelineUrl is required" }
      set(`value`) {
        timelineUrlValue = value
      }

    private var userUrlValue: String? = null

    public var userUrl: String
      get() = requireNotNull(userUrlValue) { "userUrl is required" }
      set(`value`) {
        userUrlValue = value
      }

    public var currentUserActorUrl: String? = null

    public var currentUserOrganizationUrl: String? = null

    public var currentUserOrganizationUrls: List<String>? = null

    public var currentUserPublicUrl: String? = null

    public var currentUserUrl: String? = null

    /**
     * A feed of discussions for a given repository and category.
     */
    public var repositoryDiscussionsCategoryUrl: String? = null

    /**
     * A feed of discussions for a given repository.
     */
    public var repositoryDiscussionsUrl: String? = null

    public var securityAdvisoriesUrl: String? = null

    public fun build(): Feed {
      check(linksValue != null) { "links is required" }
      check(timelineUrlValue != null) { "timelineUrl is required" }
      check(userUrlValue != null) { "userUrl is required" }
      return Feed(
        links = links,
        timelineUrl = timelineUrl,
        userUrl = userUrl,
        currentUserActorUrl = currentUserActorUrl,
        currentUserOrganizationUrl = currentUserOrganizationUrl,
        currentUserOrganizationUrls = currentUserOrganizationUrls,
        currentUserPublicUrl = currentUserPublicUrl,
        currentUserUrl = currentUserUrl,
        repositoryDiscussionsCategoryUrl = repositoryDiscussionsCategoryUrl,
        repositoryDiscussionsUrl = repositoryDiscussionsUrl,
        securityAdvisoriesUrl = securityAdvisoriesUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Feed = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Feed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Feed {
      val jsonDecoder = decoder.requireJsonDecoder("Feed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Feed must be a JSON object")
      val links = json.decodeRequired<InlineFeedLinksX36138634>(rawObject, "_links")
      val timelineUrl = json.decodeRequired<String>(rawObject, "timeline_url")
      val userUrl = json.decodeRequired<String>(rawObject, "user_url")
      return Feed(
        links = links,
        timelineUrl = timelineUrl,
        userUrl = userUrl,
        currentUserActorUrl = rawObject["current_user_actor_url"]?.let { json.decodeFromJsonElement<String>(it) },
        currentUserOrganizationUrl = rawObject["current_user_organization_url"]?.let { json.decodeFromJsonElement<String>(it) },
        currentUserOrganizationUrls = rawObject["current_user_organization_urls"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        currentUserPublicUrl = rawObject["current_user_public_url"]?.let { json.decodeFromJsonElement<String>(it) },
        currentUserUrl = rawObject["current_user_url"]?.let { json.decodeFromJsonElement<String>(it) },
        repositoryDiscussionsCategoryUrl = rawObject["repository_discussions_category_url"]?.let { json.decodeFromJsonElement<String>(it) },
        repositoryDiscussionsUrl = rawObject["repository_discussions_url"]?.let { json.decodeFromJsonElement<String>(it) },
        securityAdvisoriesUrl = rawObject["security_advisories_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Feed) {
      val jsonEncoder = encoder.requireJsonEncoder("Feed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("timeline_url", value.timelineUrl)
        put("user_url", value.userUrl)
        value.currentUserActorUrl?.let { put("current_user_actor_url", it) }
        value.currentUserOrganizationUrl?.let { put("current_user_organization_url", it) }
        value.currentUserOrganizationUrls?.let { put("current_user_organization_urls", json.encodeToJsonElement(it)) }
        value.currentUserPublicUrl?.let { put("current_user_public_url", it) }
        value.currentUserUrl?.let { put("current_user_url", it) }
        value.repositoryDiscussionsCategoryUrl?.let { put("repository_discussions_category_url", it) }
        value.repositoryDiscussionsUrl?.let { put("repository_discussions_url", it) }
        value.securityAdvisoriesUrl?.let { put("security_advisories_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun feed(block: Feed.Builder.() -> Unit): Feed = Feed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Feed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
