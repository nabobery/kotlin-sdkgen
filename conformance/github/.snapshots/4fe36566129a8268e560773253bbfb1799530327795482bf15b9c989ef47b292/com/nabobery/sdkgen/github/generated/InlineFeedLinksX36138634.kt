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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/feed/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/feed/properties/_links
 */
@Serializable(with = InlineFeedLinksX36138634.Serializer::class)
public class InlineFeedLinksX36138634(
  public val timeline: LinkWithType,
  public val user: LinkWithType,
  public val currentUser: LinkWithType? = null,
  public val currentUserActor: LinkWithType? = null,
  public val currentUserOrganization: LinkWithType? = null,
  currentUserOrganizations: List<LinkWithType>? = null,
  public val currentUserPublic: LinkWithType? = null,
  public val repositoryDiscussions: LinkWithType? = null,
  public val repositoryDiscussionsCategory: LinkWithType? = null,
  public val securityAdvisories: LinkWithType? = null,
) {
  public val currentUserOrganizations: List<LinkWithType>? =
      currentUserOrganizations?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var timelineValue: LinkWithType? = null

    public var timeline: LinkWithType
      get() = requireNotNull(timelineValue) { "timeline is required" }
      set(`value`) {
        timelineValue = value
      }

    private var userValue: LinkWithType? = null

    public var user: LinkWithType
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
      }

    public var currentUser: LinkWithType? = null

    public var currentUserActor: LinkWithType? = null

    public var currentUserOrganization: LinkWithType? = null

    private var currentUserOrganizationsValue: List<LinkWithType>? = null

    public var currentUserOrganizations: List<LinkWithType>?
      get() = currentUserOrganizationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        currentUserOrganizationsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var currentUserPublic: LinkWithType? = null

    public var repositoryDiscussions: LinkWithType? = null

    public var repositoryDiscussionsCategory: LinkWithType? = null

    public var securityAdvisories: LinkWithType? = null

    public fun build(): InlineFeedLinksX36138634 {
      check(timelineValue != null) { "timeline is required" }
      check(userValue != null) { "user is required" }
      return InlineFeedLinksX36138634(
        timeline = timeline,
        user = user,
        currentUser = currentUser,
        currentUserActor = currentUserActor,
        currentUserOrganization = currentUserOrganization,
        currentUserOrganizations = currentUserOrganizations,
        currentUserPublic = currentUserPublic,
        repositoryDiscussions = repositoryDiscussions,
        repositoryDiscussionsCategory = repositoryDiscussionsCategory,
        securityAdvisories = securityAdvisories,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFeedLinksX36138634 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFeedLinksX36138634> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFeedLinksX36138634 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFeedLinksX36138634")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFeedLinksX36138634 must be a JSON object")
      val timeline = json.decodeRequired<LinkWithType>(rawObject, "timeline")
      val user = json.decodeRequired<LinkWithType>(rawObject, "user")
      return InlineFeedLinksX36138634(
        timeline = timeline,
        user = user,
        currentUser = rawObject["current_user"]?.let { json.decodeFromJsonElement<LinkWithType>(it) },
        currentUserActor = rawObject["current_user_actor"]?.let { json.decodeFromJsonElement<LinkWithType>(it) },
        currentUserOrganization = rawObject["current_user_organization"]?.let { json.decodeFromJsonElement<LinkWithType>(it) },
        currentUserOrganizations = rawObject["current_user_organizations"]?.let { json.decodeFromJsonElement<List<LinkWithType>>(it) },
        currentUserPublic = rawObject["current_user_public"]?.let { json.decodeFromJsonElement<LinkWithType>(it) },
        repositoryDiscussions = rawObject["repository_discussions"]?.let { json.decodeFromJsonElement<LinkWithType>(it) },
        repositoryDiscussionsCategory = rawObject["repository_discussions_category"]?.let { json.decodeFromJsonElement<LinkWithType>(it) },
        securityAdvisories = rawObject["security_advisories"]?.let { json.decodeFromJsonElement<LinkWithType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFeedLinksX36138634) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFeedLinksX36138634")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("timeline", json.encodeToJsonElement(value.timeline))
        put("user", json.encodeToJsonElement(value.user))
        value.currentUser?.let { put("current_user", json.encodeToJsonElement(it)) }
        value.currentUserActor?.let { put("current_user_actor", json.encodeToJsonElement(it)) }
        value.currentUserOrganization?.let { put("current_user_organization", json.encodeToJsonElement(it)) }
        value.currentUserOrganizations?.let { put("current_user_organizations", json.encodeToJsonElement(it)) }
        value.currentUserPublic?.let { put("current_user_public", json.encodeToJsonElement(it)) }
        value.repositoryDiscussions?.let { put("repository_discussions", json.encodeToJsonElement(it)) }
        value.repositoryDiscussionsCategory?.let { put("repository_discussions_category", json.encodeToJsonElement(it)) }
        value.securityAdvisories?.let { put("security_advisories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFeedLinksX36138634(block: InlineFeedLinksX36138634.Builder.() -> Unit): InlineFeedLinksX36138634 = InlineFeedLinksX36138634.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFeedLinksX36138634 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
