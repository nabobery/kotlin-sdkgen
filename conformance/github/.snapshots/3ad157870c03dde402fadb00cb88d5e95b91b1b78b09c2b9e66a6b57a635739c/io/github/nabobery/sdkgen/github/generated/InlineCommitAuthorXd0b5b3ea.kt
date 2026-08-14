package io.github.nabobery.sdkgen.github.generated

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

public sealed class InlineCommitAuthorXd0b5b3eaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCommitAuthorXd0b5b3eaNoMatchException(
  message: String,
) : InlineCommitAuthorXd0b5b3eaDecodingException(message)

public class InlineCommitAuthorXd0b5b3eaAmbiguityException(
  message: String,
) : InlineCommitAuthorXd0b5b3eaDecodingException(message)

public class InlineCommitAuthorXd0b5b3eaBranchValidationException(
  message: String,
) : InlineCommitAuthorXd0b5b3eaDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/commit/properties/author.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit/properties/author
 */
@Serializable(with = InlineCommitAuthorXd0b5b3eaSerializer::class)
public sealed interface InlineCommitAuthorXd0b5b3ea {
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
  ) : InlineCommitAuthorXd0b5b3ea {
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
        val inspection = inspectInlineCommitAuthorXd0b5b3ea(raw)
        if (inspection.size == 0) {
          throw InlineCommitAuthorXd0b5b3eaNoMatchException("InlineCommitAuthorXd0b5b3ea matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.simpleUserMatches) {
          throw InlineCommitAuthorXd0b5b3eaBranchValidationException("SimpleUser factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineCommitAuthorXd0b5b3eaAmbiguityException("InlineCommitAuthorXd0b5b3ea matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
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

  public class EmptyObject internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineCommitAuthorXd0b5b3ea {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(): EmptyObject {
        val raw = buildJsonObject {
        }
        val inspection = inspectInlineCommitAuthorXd0b5b3ea(raw)
        if (inspection.size == 0) {
          throw InlineCommitAuthorXd0b5b3eaNoMatchException("InlineCommitAuthorXd0b5b3ea matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.emptyObjectMatches) {
          throw InlineCommitAuthorXd0b5b3eaBranchValidationException("EmptyObject factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineCommitAuthorXd0b5b3eaAmbiguityException("InlineCommitAuthorXd0b5b3ea matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return EmptyObject(
          raw = raw,
        )
      }
    }
  }
}

internal object InlineCommitAuthorXd0b5b3eaSerializer : KSerializer<InlineCommitAuthorXd0b5b3ea> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineCommitAuthorXd0b5b3ea {
    val jsonDecoder = decoder.requireJsonDecoder("InlineCommitAuthorXd0b5b3ea")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineCommitAuthorXd0b5b3eaNoMatchException("InlineCommitAuthorXd0b5b3ea matched 0 branches: expected JSON object")
    val matches = inspectInlineCommitAuthorXd0b5b3ea(rawObject)
    if (matches.size == 0) {
      throw InlineCommitAuthorXd0b5b3eaNoMatchException("InlineCommitAuthorXd0b5b3ea matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineCommitAuthorXd0b5b3eaAmbiguityException("InlineCommitAuthorXd0b5b3ea matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.simpleUserMatches -> InlineCommitAuthorXd0b5b3ea.SimpleUser(avatarUrl = requireNotNull(matches.avatarUrl), eventsUrl = requireNotNull(matches.eventsUrl), followersUrl = requireNotNull(matches.followersUrl), followingUrl = requireNotNull(matches.followingUrl), gistsUrl = requireNotNull(matches.gistsUrl), gravatarId = matches.gravatarId, htmlUrl = requireNotNull(matches.htmlUrl), id = requireNotNull(matches.id), login = requireNotNull(matches.login), nodeId = requireNotNull(matches.nodeId), organizationsUrl = requireNotNull(matches.organizationsUrl), receivedEventsUrl = requireNotNull(matches.receivedEventsUrl), reposUrl = requireNotNull(matches.reposUrl), siteAdmin = requireNotNull(matches.siteAdmin), starredUrl = requireNotNull(matches.starredUrl), subscriptionsUrl = requireNotNull(matches.subscriptionsUrl), type = requireNotNull(matches.type), url = requireNotNull(matches.url), raw = rawObject)
      matches.emptyObjectMatches -> InlineCommitAuthorXd0b5b3ea.EmptyObject(raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineCommitAuthorXd0b5b3ea) {
    encoder.requireJsonEncoder("InlineCommitAuthorXd0b5b3ea").encodeJsonElement(value.raw)
  }
}

internal data class InlineCommitAuthorXd0b5b3eaInspection(
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
  public val id: Long?,
  public val idDecoded: Boolean,
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
  public val simpleUserMatches: Boolean,
  public val emptyObjectMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (simpleUserMatches) add("SimpleUser")
      if (emptyObjectMatches) add("EmptyObject")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineCommitAuthorXd0b5b3ea(rawObject: JsonObject): InlineCommitAuthorXd0b5b3eaInspection {
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
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Long>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
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
  val rawEmpty = rawObject.isEmpty()
  val simpleUserMatches = avatarUrlDecoded && eventsUrlDecoded && followersUrlDecoded && followingUrlDecoded && gistsUrlDecoded && gravatarIdPresent && gravatarIdDecoded && htmlUrlDecoded && idDecoded && loginDecoded && nodeIdDecoded && organizationsUrlDecoded && receivedEventsUrlDecoded && reposUrlDecoded && siteAdminDecoded && starredUrlDecoded && subscriptionsUrlDecoded && typeDecoded && urlDecoded
  val emptyObjectMatches = rawEmpty
  return InlineCommitAuthorXd0b5b3eaInspection(
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
    id = id,
    idDecoded = idDecoded,
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
    simpleUserMatches = simpleUserMatches,
    emptyObjectMatches = emptyObjectMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!simpleUserMatches) add("SimpleUser: branch predicate did not match properties 'avatar_url' and 'events_url' and 'followers_url' and 'following_url' and 'gists_url' and 'gravatar_id' and 'html_url' and 'id' and 'login' and 'node_id' and 'organizations_url' and 'received_events_url' and 'repos_url' and 'site_admin' and 'starred_url' and 'subscriptions_url' and 'type' and 'url'")
      if (!emptyObjectMatches) add("EmptyObject: expected a closed empty object")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
