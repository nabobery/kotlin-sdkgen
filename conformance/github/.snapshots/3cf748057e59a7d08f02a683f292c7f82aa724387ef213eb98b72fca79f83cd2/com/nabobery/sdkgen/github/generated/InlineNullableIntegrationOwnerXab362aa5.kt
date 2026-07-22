package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineNullableIntegrationOwnerXab362aa5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineNullableIntegrationOwnerXab362aa5NoMatchException(
  message: String,
) : InlineNullableIntegrationOwnerXab362aa5DecodingException(message)

public class InlineNullableIntegrationOwnerXab362aa5AmbiguityException(
  message: String,
) : InlineNullableIntegrationOwnerXab362aa5DecodingException(message)

public class InlineNullableIntegrationOwnerXab362aa5BranchValidationException(
  message: String,
) : InlineNullableIntegrationOwnerXab362aa5DecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/nullable-integration/properties/owner.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-integration/properties/owner
 */
@Serializable(with = InlineNullableIntegrationOwnerXab362aa5.Serializer::class)
public sealed interface InlineNullableIntegrationOwnerXab362aa5 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class SimpleUser internal constructor(
    public val avatarUrl: String,
    public val eventsUrl: String,
    public val followersUrl: String,
    public val followingUrl: String,
    public val gistsUrl: String,
    public val gravatarId: String?,
    public val htmlUrl: String,
    public val id: Long,
    public val login: String,
    public val nodeId: String,
    public val organizationsUrl: String,
    public val receivedEventsUrl: String,
    public val reposUrl: String,
    public val siteAdmin: Boolean,
    public val starredUrl: String,
    public val subscriptionsUrl: String,
    public val type: String,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineNullableIntegrationOwnerXab362aa5 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        avatarUrl: String,
        eventsUrl: String,
        followersUrl: String,
        followingUrl: String,
        gistsUrl: String,
        gravatarId: String?,
        htmlUrl: String,
        id: Long,
        login: String,
        nodeId: String,
        organizationsUrl: String,
        receivedEventsUrl: String,
        reposUrl: String,
        siteAdmin: Boolean,
        starredUrl: String,
        subscriptionsUrl: String,
        type: String,
        url: String,
      ): SimpleUser {
        val raw = buildJsonObject {
              put("avatar_url", avatarUrl)
              put("events_url", eventsUrl)
              put("followers_url", followersUrl)
              put("following_url", followingUrl)
              put("gists_url", gistsUrl)
              put("gravatar_id", gravatarId)
              put("html_url", htmlUrl)
              put("id", SdkJson.encodeToJsonElement(id))
              put("login", login)
              put("node_id", nodeId)
              put("organizations_url", organizationsUrl)
              put("received_events_url", receivedEventsUrl)
              put("repos_url", reposUrl)
              put("site_admin", SdkJson.encodeToJsonElement(siteAdmin))
              put("starred_url", starredUrl)
              put("subscriptions_url", subscriptionsUrl)
              put("type", type)
              put("url", url)
            }
        val inspection = inspectInlineNullableIntegrationOwnerXab362aa5(raw)
        if (inspection.size == 0) {
          throw InlineNullableIntegrationOwnerXab362aa5NoMatchException("InlineNullableIntegrationOwnerXab362aa5 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.SimpleUserMatches) {
          throw InlineNullableIntegrationOwnerXab362aa5BranchValidationException("SimpleUser factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineNullableIntegrationOwnerXab362aa5AmbiguityException("InlineNullableIntegrationOwnerXab362aa5 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SimpleUser(
          avatarUrl = avatarUrl,
          eventsUrl = eventsUrl,
          followersUrl = followersUrl,
          followingUrl = followingUrl,
          gistsUrl = gistsUrl,
          gravatarId = gravatarId,
          htmlUrl = htmlUrl,
          id = id,
          login = login,
          nodeId = nodeId,
          organizationsUrl = organizationsUrl,
          receivedEventsUrl = receivedEventsUrl,
          reposUrl = reposUrl,
          siteAdmin = siteAdmin,
          starredUrl = starredUrl,
          subscriptionsUrl = subscriptionsUrl,
          type = type,
          url = url,
          raw = raw,
        )
      }
    }
  }

  public class Enterprise internal constructor(
    public val avatarUrl: String,
    public val createdAt: String?,
    public val htmlUrl: String,
    public val id: Int,
    public val name: String,
    public val nodeId: String,
    public val slug: String,
    public val updatedAt: String?,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineNullableIntegrationOwnerXab362aa5 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        avatarUrl: String,
        createdAt: String?,
        htmlUrl: String,
        id: Int,
        name: String,
        nodeId: String,
        slug: String,
        updatedAt: String?,
      ): Enterprise {
        val raw = buildJsonObject {
              put("avatar_url", avatarUrl)
              put("created_at", createdAt)
              put("html_url", htmlUrl)
              put("id", SdkJson.encodeToJsonElement(id))
              put("name", name)
              put("node_id", nodeId)
              put("slug", slug)
              put("updated_at", updatedAt)
            }
        val inspection = inspectInlineNullableIntegrationOwnerXab362aa5(raw)
        if (inspection.size == 0) {
          throw InlineNullableIntegrationOwnerXab362aa5NoMatchException("InlineNullableIntegrationOwnerXab362aa5 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.EnterpriseMatches) {
          throw InlineNullableIntegrationOwnerXab362aa5BranchValidationException("Enterprise factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineNullableIntegrationOwnerXab362aa5AmbiguityException("InlineNullableIntegrationOwnerXab362aa5 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return Enterprise(
          avatarUrl = avatarUrl,
          createdAt = createdAt,
          htmlUrl = htmlUrl,
          id = id,
          name = name,
          nodeId = nodeId,
          slug = slug,
          updatedAt = updatedAt,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineNullableIntegrationOwnerXab362aa5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNullableIntegrationOwnerXab362aa5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNullableIntegrationOwnerXab362aa5")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineNullableIntegrationOwnerXab362aa5NoMatchException("InlineNullableIntegrationOwnerXab362aa5 matched 0 branches: expected JSON object")
      val matches = inspectInlineNullableIntegrationOwnerXab362aa5(rawObject)
      if (matches.size == 0) {
        throw InlineNullableIntegrationOwnerXab362aa5NoMatchException("InlineNullableIntegrationOwnerXab362aa5 matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineNullableIntegrationOwnerXab362aa5AmbiguityException("InlineNullableIntegrationOwnerXab362aa5 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.SimpleUserMatches -> SimpleUser(avatarUrl = requireNotNull(matches.avatarUrl), eventsUrl = requireNotNull(matches.eventsUrl), followersUrl = requireNotNull(matches.followersUrl), followingUrl = requireNotNull(matches.followingUrl), gistsUrl = requireNotNull(matches.gistsUrl), gravatarId = matches.gravatarId, htmlUrl = requireNotNull(matches.htmlUrl), id = requireNotNull(matches.idState2), login = requireNotNull(matches.login), nodeId = requireNotNull(matches.nodeId), organizationsUrl = requireNotNull(matches.organizationsUrl), receivedEventsUrl = requireNotNull(matches.receivedEventsUrl), reposUrl = requireNotNull(matches.reposUrl), siteAdmin = requireNotNull(matches.siteAdmin), starredUrl = requireNotNull(matches.starredUrl), subscriptionsUrl = requireNotNull(matches.subscriptionsUrl), type = requireNotNull(matches.type), url = requireNotNull(matches.url), raw = rawObject)
        matches.EnterpriseMatches -> Enterprise(avatarUrl = requireNotNull(matches.avatarUrl), createdAt = matches.createdAt, htmlUrl = requireNotNull(matches.htmlUrl), id = requireNotNull(matches.idState1), name = requireNotNull(matches.name), nodeId = requireNotNull(matches.nodeId), slug = requireNotNull(matches.slug), updatedAt = matches.updatedAt, raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineNullableIntegrationOwnerXab362aa5) {
      encoder.requireJsonEncoder("InlineNullableIntegrationOwnerXab362aa5").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineNullableIntegrationOwnerXab362aa5Inspection(
  public val avatarUrl: String?,
  public val avatarUrlDecoded: Boolean,
  public val eventsUrl: String?,
  public val eventsUrlDecoded: Boolean,
  public val followersUrl: String?,
  public val followersUrlDecoded: Boolean,
  public val followingUrl: String?,
  public val followingUrlDecoded: Boolean,
  public val gistsUrl: String?,
  public val gistsUrlDecoded: Boolean,
  public val gravatarId: String?,
  public val gravatarIdPresent: Boolean,
  public val gravatarIdDecoded: Boolean,
  public val htmlUrl: String?,
  public val htmlUrlDecoded: Boolean,
  public val idState2: Long?,
  public val idState2Decoded: Boolean,
  public val login: String?,
  public val loginDecoded: Boolean,
  public val nodeId: String?,
  public val nodeIdDecoded: Boolean,
  public val organizationsUrl: String?,
  public val organizationsUrlDecoded: Boolean,
  public val receivedEventsUrl: String?,
  public val receivedEventsUrlDecoded: Boolean,
  public val reposUrl: String?,
  public val reposUrlDecoded: Boolean,
  public val siteAdmin: Boolean?,
  public val siteAdminDecoded: Boolean,
  public val starredUrl: String?,
  public val starredUrlDecoded: Boolean,
  public val subscriptionsUrl: String?,
  public val subscriptionsUrlDecoded: Boolean,
  public val type: String?,
  public val typeDecoded: Boolean,
  public val url: String?,
  public val urlDecoded: Boolean,
  public val createdAt: String?,
  public val createdAtPresent: Boolean,
  public val createdAtDecoded: Boolean,
  public val idState1: Int?,
  public val idState1Decoded: Boolean,
  public val name: String?,
  public val nameDecoded: Boolean,
  public val slug: String?,
  public val slugDecoded: Boolean,
  public val updatedAt: String?,
  public val updatedAtPresent: Boolean,
  public val updatedAtDecoded: Boolean,
  public val SimpleUserMatches: Boolean,
  public val EnterpriseMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (SimpleUserMatches) add("SimpleUser")
      if (EnterpriseMatches) add("Enterprise")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineNullableIntegrationOwnerXab362aa5(rawObject: JsonObject): InlineNullableIntegrationOwnerXab362aa5Inspection {
  val avatarUrlResult = rawObject["avatar_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val avatarUrl = avatarUrlResult?.getOrNull()
  val avatarUrlDecoded = avatarUrlResult?.isSuccess == true
  val eventsUrlResult = rawObject["events_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val eventsUrl = eventsUrlResult?.getOrNull()
  val eventsUrlDecoded = eventsUrlResult?.isSuccess == true
  val followersUrlResult = rawObject["followers_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val followersUrl = followersUrlResult?.getOrNull()
  val followersUrlDecoded = followersUrlResult?.isSuccess == true
  val followingUrlResult = rawObject["following_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val followingUrl = followingUrlResult?.getOrNull()
  val followingUrlDecoded = followingUrlResult?.isSuccess == true
  val gistsUrlResult = rawObject["gists_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val gistsUrl = gistsUrlResult?.getOrNull()
  val gistsUrlDecoded = gistsUrlResult?.isSuccess == true
  val gravatarIdResult = rawObject["gravatar_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val gravatarId = gravatarIdResult?.getOrNull()
  val gravatarIdPresent = rawObject.containsKey("gravatar_id")
  val gravatarIdDecoded = gravatarIdResult?.isSuccess == true
  val htmlUrlResult = rawObject["html_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val htmlUrl = htmlUrlResult?.getOrNull()
  val htmlUrlDecoded = htmlUrlResult?.isSuccess == true
  val idState2Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Long>(element) } }
  val idState2 = idState2Result?.getOrNull()
  val idState2Decoded = idState2Result?.isSuccess == true
  val loginResult = rawObject["login"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val login = loginResult?.getOrNull()
  val loginDecoded = loginResult?.isSuccess == true
  val nodeIdResult = rawObject["node_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val nodeId = nodeIdResult?.getOrNull()
  val nodeIdDecoded = nodeIdResult?.isSuccess == true
  val organizationsUrlResult = rawObject["organizations_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val organizationsUrl = organizationsUrlResult?.getOrNull()
  val organizationsUrlDecoded = organizationsUrlResult?.isSuccess == true
  val receivedEventsUrlResult = rawObject["received_events_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val receivedEventsUrl = receivedEventsUrlResult?.getOrNull()
  val receivedEventsUrlDecoded = receivedEventsUrlResult?.isSuccess == true
  val reposUrlResult = rawObject["repos_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val reposUrl = reposUrlResult?.getOrNull()
  val reposUrlDecoded = reposUrlResult?.isSuccess == true
  val siteAdminResult = rawObject["site_admin"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Boolean>(element) } }
  val siteAdmin = siteAdminResult?.getOrNull()
  val siteAdminDecoded = siteAdminResult?.isSuccess == true
  val starredUrlResult = rawObject["starred_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val starredUrl = starredUrlResult?.getOrNull()
  val starredUrlDecoded = starredUrlResult?.isSuccess == true
  val subscriptionsUrlResult = rawObject["subscriptions_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val subscriptionsUrl = subscriptionsUrlResult?.getOrNull()
  val subscriptionsUrlDecoded = subscriptionsUrlResult?.isSuccess == true
  val typeResult = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val type = typeResult?.getOrNull()
  val typeDecoded = typeResult?.isSuccess == true
  val urlResult = rawObject["url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val url = urlResult?.getOrNull()
  val urlDecoded = urlResult?.isSuccess == true
  val createdAtResult = rawObject["created_at"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val createdAt = createdAtResult?.getOrNull()
  val createdAtPresent = rawObject.containsKey("created_at")
  val createdAtDecoded = createdAtResult?.isSuccess == true
  val idState1Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val idState1 = idState1Result?.getOrNull()
  val idState1Decoded = idState1Result?.isSuccess == true
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val slugResult = rawObject["slug"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val slug = slugResult?.getOrNull()
  val slugDecoded = slugResult?.isSuccess == true
  val updatedAtResult = rawObject["updated_at"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val updatedAt = updatedAtResult?.getOrNull()
  val updatedAtPresent = rawObject.containsKey("updated_at")
  val updatedAtDecoded = updatedAtResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val SimpleUserMatches = avatarUrlDecoded && eventsUrlDecoded && followersUrlDecoded && followingUrlDecoded && gistsUrlDecoded && gravatarIdPresent && gravatarIdDecoded && htmlUrlDecoded && idState2Decoded && loginDecoded && nodeIdDecoded && organizationsUrlDecoded && receivedEventsUrlDecoded && reposUrlDecoded && siteAdminDecoded && starredUrlDecoded && subscriptionsUrlDecoded && typeDecoded && urlDecoded
  val EnterpriseMatches = avatarUrlDecoded && createdAtPresent && createdAtDecoded && htmlUrlDecoded && idState1Decoded && nameDecoded && nodeIdDecoded && slugDecoded && updatedAtPresent && updatedAtDecoded
  return InlineNullableIntegrationOwnerXab362aa5Inspection(
    avatarUrl = avatarUrl,
    avatarUrlDecoded = avatarUrlDecoded,
    eventsUrl = eventsUrl,
    eventsUrlDecoded = eventsUrlDecoded,
    followersUrl = followersUrl,
    followersUrlDecoded = followersUrlDecoded,
    followingUrl = followingUrl,
    followingUrlDecoded = followingUrlDecoded,
    gistsUrl = gistsUrl,
    gistsUrlDecoded = gistsUrlDecoded,
    gravatarId = gravatarId,
    gravatarIdPresent = gravatarIdPresent,
    gravatarIdDecoded = gravatarIdDecoded,
    htmlUrl = htmlUrl,
    htmlUrlDecoded = htmlUrlDecoded,
    idState2 = idState2,
    idState2Decoded = idState2Decoded,
    login = login,
    loginDecoded = loginDecoded,
    nodeId = nodeId,
    nodeIdDecoded = nodeIdDecoded,
    organizationsUrl = organizationsUrl,
    organizationsUrlDecoded = organizationsUrlDecoded,
    receivedEventsUrl = receivedEventsUrl,
    receivedEventsUrlDecoded = receivedEventsUrlDecoded,
    reposUrl = reposUrl,
    reposUrlDecoded = reposUrlDecoded,
    siteAdmin = siteAdmin,
    siteAdminDecoded = siteAdminDecoded,
    starredUrl = starredUrl,
    starredUrlDecoded = starredUrlDecoded,
    subscriptionsUrl = subscriptionsUrl,
    subscriptionsUrlDecoded = subscriptionsUrlDecoded,
    type = type,
    typeDecoded = typeDecoded,
    url = url,
    urlDecoded = urlDecoded,
    createdAt = createdAt,
    createdAtPresent = createdAtPresent,
    createdAtDecoded = createdAtDecoded,
    idState1 = idState1,
    idState1Decoded = idState1Decoded,
    name = name,
    nameDecoded = nameDecoded,
    slug = slug,
    slugDecoded = slugDecoded,
    updatedAt = updatedAt,
    updatedAtPresent = updatedAtPresent,
    updatedAtDecoded = updatedAtDecoded,
    SimpleUserMatches = SimpleUserMatches,
    EnterpriseMatches = EnterpriseMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!SimpleUserMatches) add("SimpleUser: branch predicate did not match properties 'avatar_url' and 'events_url' and 'followers_url' and 'following_url' and 'gists_url' and 'gravatar_id' and 'html_url' and 'id' and 'login' and 'node_id' and 'organizations_url' and 'received_events_url' and 'repos_url' and 'site_admin' and 'starred_url' and 'subscriptions_url' and 'type' and 'url'")
      if (!EnterpriseMatches) add("Enterprise: branch predicate did not match properties 'avatar_url' and 'created_at' and 'html_url' and 'id' and 'name' and 'node_id' and 'slug' and 'updated_at'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
