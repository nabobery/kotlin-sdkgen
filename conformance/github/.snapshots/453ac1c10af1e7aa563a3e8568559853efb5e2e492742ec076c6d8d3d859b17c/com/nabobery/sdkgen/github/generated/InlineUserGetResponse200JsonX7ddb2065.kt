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

public sealed class InlineUserGetResponse200JsonX7ddb2065DecodingException(
  message: String,
) : SerializationException(message)

public class InlineUserGetResponse200JsonX7ddb2065NoMatchException(
  message: String,
) : InlineUserGetResponse200JsonX7ddb2065DecodingException(message)

public class InlineUserGetResponse200JsonX7ddb2065AmbiguityException(
  message: String,
) : InlineUserGetResponse200JsonX7ddb2065DecodingException(message)

public class InlineUserGetResponse200JsonX7ddb2065BranchValidationException(
  message: String,
) : InlineUserGetResponse200JsonX7ddb2065DecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/paths/~1user~1{account_id}/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1{account_id}/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineUserGetResponse200JsonX7ddb2065.Serializer::class)
public sealed interface InlineUserGetResponse200JsonX7ddb2065 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class PrivateUser internal constructor(
    public val avatarUrl: String,
    public val bio: String?,
    public val blog: String?,
    public val collaborators: Int,
    public val company: String?,
    public val createdAt: String,
    public val diskUsage: Int,
    public val email: String?,
    public val eventsUrl: String,
    public val followers: Int,
    public val followersUrl: String,
    public val following: Int,
    public val followingUrl: String,
    public val gistsUrl: String,
    public val gravatarId: String?,
    public val hireable: Boolean?,
    public val htmlUrl: String,
    public val id: Long,
    public val location: String?,
    public val login: String,
    public val name: String?,
    public val nodeId: String,
    public val organizationsUrl: String,
    public val ownedPrivateRepos: Int,
    public val privateGists: Int,
    public val publicGists: Int,
    public val publicRepos: Int,
    public val receivedEventsUrl: String,
    public val reposUrl: String,
    public val siteAdmin: Boolean,
    public val starredUrl: String,
    public val subscriptionsUrl: String,
    public val totalPrivateRepos: Int,
    public val twoFactorAuthentication: Boolean,
    public val type: String,
    public val updatedAt: String,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUserGetResponse200JsonX7ddb2065 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        avatarUrl: String,
        bio: String?,
        blog: String?,
        collaborators: Int,
        company: String?,
        createdAt: String,
        diskUsage: Int,
        email: String?,
        eventsUrl: String,
        followers: Int,
        followersUrl: String,
        following: Int,
        followingUrl: String,
        gistsUrl: String,
        gravatarId: String?,
        hireable: Boolean?,
        htmlUrl: String,
        id: Long,
        location: String?,
        login: String,
        name: String?,
        nodeId: String,
        organizationsUrl: String,
        ownedPrivateRepos: Int,
        privateGists: Int,
        publicGists: Int,
        publicRepos: Int,
        receivedEventsUrl: String,
        reposUrl: String,
        siteAdmin: Boolean,
        starredUrl: String,
        subscriptionsUrl: String,
        totalPrivateRepos: Int,
        twoFactorAuthentication: Boolean,
        type: String,
        updatedAt: String,
        url: String,
      ): PrivateUser {
        val raw = buildJsonObject {
          put("avatar_url", avatarUrl)
          put("bio", bio)
          put("blog", blog)
          put("collaborators", SdkJson.encodeToJsonElement(collaborators))
          put("company", company)
          put("created_at", createdAt)
          put("disk_usage", SdkJson.encodeToJsonElement(diskUsage))
          put("email", email)
          put("events_url", eventsUrl)
          put("followers", SdkJson.encodeToJsonElement(followers))
          put("followers_url", followersUrl)
          put("following", SdkJson.encodeToJsonElement(following))
          put("following_url", followingUrl)
          put("gists_url", gistsUrl)
          put("gravatar_id", gravatarId)
          put("hireable", SdkJson.encodeToJsonElement(hireable))
          put("html_url", htmlUrl)
          put("id", SdkJson.encodeToJsonElement(id))
          put("location", location)
          put("login", login)
          put("name", name)
          put("node_id", nodeId)
          put("organizations_url", organizationsUrl)
          put("owned_private_repos", SdkJson.encodeToJsonElement(ownedPrivateRepos))
          put("private_gists", SdkJson.encodeToJsonElement(privateGists))
          put("public_gists", SdkJson.encodeToJsonElement(publicGists))
          put("public_repos", SdkJson.encodeToJsonElement(publicRepos))
          put("received_events_url", receivedEventsUrl)
          put("repos_url", reposUrl)
          put("site_admin", SdkJson.encodeToJsonElement(siteAdmin))
          put("starred_url", starredUrl)
          put("subscriptions_url", subscriptionsUrl)
          put("total_private_repos", SdkJson.encodeToJsonElement(totalPrivateRepos))
          put("two_factor_authentication", SdkJson.encodeToJsonElement(twoFactorAuthentication))
          put("type", type)
          put("updated_at", updatedAt)
          put("url", url)
        }
        val inspection = inspectInlineUserGetResponse200JsonX7ddb2065(raw)
        if (inspection.size == 0) {
          throw InlineUserGetResponse200JsonX7ddb2065NoMatchException("InlineUserGetResponse200JsonX7ddb2065 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.privateUserMatches) {
          throw InlineUserGetResponse200JsonX7ddb2065BranchValidationException("PrivateUser factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUserGetResponse200JsonX7ddb2065AmbiguityException("InlineUserGetResponse200JsonX7ddb2065 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return PrivateUser(
          avatarUrl = avatarUrl,
          bio = bio,
          blog = blog,
          collaborators = collaborators,
          company = company,
          createdAt = createdAt,
          diskUsage = diskUsage,
          email = email,
          eventsUrl = eventsUrl,
          followers = followers,
          followersUrl = followersUrl,
          following = following,
          followingUrl = followingUrl,
          gistsUrl = gistsUrl,
          gravatarId = gravatarId,
          hireable = hireable,
          htmlUrl = htmlUrl,
          id = id,
          location = location,
          login = login,
          name = name,
          nodeId = nodeId,
          organizationsUrl = organizationsUrl,
          ownedPrivateRepos = ownedPrivateRepos,
          privateGists = privateGists,
          publicGists = publicGists,
          publicRepos = publicRepos,
          receivedEventsUrl = receivedEventsUrl,
          reposUrl = reposUrl,
          siteAdmin = siteAdmin,
          starredUrl = starredUrl,
          subscriptionsUrl = subscriptionsUrl,
          totalPrivateRepos = totalPrivateRepos,
          twoFactorAuthentication = twoFactorAuthentication,
          type = type,
          updatedAt = updatedAt,
          url = url,
          raw = raw,
        )
      }
    }
  }

  public class PublicUser internal constructor(
    public val avatarUrl: String,
    public val bio: String?,
    public val blog: String?,
    public val company: String?,
    public val createdAt: String,
    public val email: String?,
    public val eventsUrl: String,
    public val followers: Int,
    public val followersUrl: String,
    public val following: Int,
    public val followingUrl: String,
    public val gistsUrl: String,
    public val gravatarId: String?,
    public val hireable: Boolean?,
    public val htmlUrl: String,
    public val id: Long,
    public val location: String?,
    public val login: String,
    public val name: String?,
    public val nodeId: String,
    public val organizationsUrl: String,
    public val publicGists: Int,
    public val publicRepos: Int,
    public val receivedEventsUrl: String,
    public val reposUrl: String,
    public val siteAdmin: Boolean,
    public val starredUrl: String,
    public val subscriptionsUrl: String,
    public val type: String,
    public val updatedAt: String,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUserGetResponse200JsonX7ddb2065 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        avatarUrl: String,
        bio: String?,
        blog: String?,
        company: String?,
        createdAt: String,
        email: String?,
        eventsUrl: String,
        followers: Int,
        followersUrl: String,
        following: Int,
        followingUrl: String,
        gistsUrl: String,
        gravatarId: String?,
        hireable: Boolean?,
        htmlUrl: String,
        id: Long,
        location: String?,
        login: String,
        name: String?,
        nodeId: String,
        organizationsUrl: String,
        publicGists: Int,
        publicRepos: Int,
        receivedEventsUrl: String,
        reposUrl: String,
        siteAdmin: Boolean,
        starredUrl: String,
        subscriptionsUrl: String,
        type: String,
        updatedAt: String,
        url: String,
      ): PublicUser {
        val raw = buildJsonObject {
          put("avatar_url", avatarUrl)
          put("bio", bio)
          put("blog", blog)
          put("company", company)
          put("created_at", createdAt)
          put("email", email)
          put("events_url", eventsUrl)
          put("followers", SdkJson.encodeToJsonElement(followers))
          put("followers_url", followersUrl)
          put("following", SdkJson.encodeToJsonElement(following))
          put("following_url", followingUrl)
          put("gists_url", gistsUrl)
          put("gravatar_id", gravatarId)
          put("hireable", SdkJson.encodeToJsonElement(hireable))
          put("html_url", htmlUrl)
          put("id", SdkJson.encodeToJsonElement(id))
          put("location", location)
          put("login", login)
          put("name", name)
          put("node_id", nodeId)
          put("organizations_url", organizationsUrl)
          put("public_gists", SdkJson.encodeToJsonElement(publicGists))
          put("public_repos", SdkJson.encodeToJsonElement(publicRepos))
          put("received_events_url", receivedEventsUrl)
          put("repos_url", reposUrl)
          put("site_admin", SdkJson.encodeToJsonElement(siteAdmin))
          put("starred_url", starredUrl)
          put("subscriptions_url", subscriptionsUrl)
          put("type", type)
          put("updated_at", updatedAt)
          put("url", url)
        }
        val inspection = inspectInlineUserGetResponse200JsonX7ddb2065(raw)
        if (inspection.size == 0) {
          throw InlineUserGetResponse200JsonX7ddb2065NoMatchException("InlineUserGetResponse200JsonX7ddb2065 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.publicUserMatches) {
          throw InlineUserGetResponse200JsonX7ddb2065BranchValidationException("PublicUser factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUserGetResponse200JsonX7ddb2065AmbiguityException("InlineUserGetResponse200JsonX7ddb2065 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return PublicUser(
          avatarUrl = avatarUrl,
          bio = bio,
          blog = blog,
          company = company,
          createdAt = createdAt,
          email = email,
          eventsUrl = eventsUrl,
          followers = followers,
          followersUrl = followersUrl,
          following = following,
          followingUrl = followingUrl,
          gistsUrl = gistsUrl,
          gravatarId = gravatarId,
          hireable = hireable,
          htmlUrl = htmlUrl,
          id = id,
          location = location,
          login = login,
          name = name,
          nodeId = nodeId,
          organizationsUrl = organizationsUrl,
          publicGists = publicGists,
          publicRepos = publicRepos,
          receivedEventsUrl = receivedEventsUrl,
          reposUrl = reposUrl,
          siteAdmin = siteAdmin,
          starredUrl = starredUrl,
          subscriptionsUrl = subscriptionsUrl,
          type = type,
          updatedAt = updatedAt,
          url = url,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineUserGetResponse200JsonX7ddb2065> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserGetResponse200JsonX7ddb2065 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserGetResponse200JsonX7ddb2065")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineUserGetResponse200JsonX7ddb2065NoMatchException("InlineUserGetResponse200JsonX7ddb2065 matched 0 branches: expected JSON object")
      val matches = inspectInlineUserGetResponse200JsonX7ddb2065(rawObject)
      if (matches.size == 0) {
        throw InlineUserGetResponse200JsonX7ddb2065NoMatchException("InlineUserGetResponse200JsonX7ddb2065 matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineUserGetResponse200JsonX7ddb2065AmbiguityException("InlineUserGetResponse200JsonX7ddb2065 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.privateUserMatches -> PrivateUser(avatarUrl = requireNotNull(matches.avatarUrl), bio = matches.bio, blog = matches.blog, collaborators = requireNotNull(matches.collaborators), company = matches.company, createdAt = requireNotNull(matches.createdAt), diskUsage = requireNotNull(matches.diskUsage), email = matches.email, eventsUrl = requireNotNull(matches.eventsUrl), followers = requireNotNull(matches.followers), followersUrl = requireNotNull(matches.followersUrl), following = requireNotNull(matches.following), followingUrl = requireNotNull(matches.followingUrl), gistsUrl = requireNotNull(matches.gistsUrl), gravatarId = matches.gravatarId, hireable = matches.hireable, htmlUrl = requireNotNull(matches.htmlUrl), id = requireNotNull(matches.id), location = matches.location, login = requireNotNull(matches.login), name = matches.name, nodeId = requireNotNull(matches.nodeId), organizationsUrl = requireNotNull(matches.organizationsUrl), ownedPrivateRepos = requireNotNull(matches.ownedPrivateRepos), privateGists = requireNotNull(matches.privateGists), publicGists = requireNotNull(matches.publicGists), publicRepos = requireNotNull(matches.publicRepos), receivedEventsUrl = requireNotNull(matches.receivedEventsUrl), reposUrl = requireNotNull(matches.reposUrl), siteAdmin = requireNotNull(matches.siteAdmin), starredUrl = requireNotNull(matches.starredUrl), subscriptionsUrl = requireNotNull(matches.subscriptionsUrl), totalPrivateRepos = requireNotNull(matches.totalPrivateRepos), twoFactorAuthentication = requireNotNull(matches.twoFactorAuthentication), type = requireNotNull(matches.type), updatedAt = requireNotNull(matches.updatedAt), url = requireNotNull(matches.url), raw = rawObject)
        matches.publicUserMatches -> PublicUser(avatarUrl = requireNotNull(matches.avatarUrl), bio = matches.bio, blog = matches.blog, company = matches.company, createdAt = requireNotNull(matches.createdAt), email = matches.email, eventsUrl = requireNotNull(matches.eventsUrl), followers = requireNotNull(matches.followers), followersUrl = requireNotNull(matches.followersUrl), following = requireNotNull(matches.following), followingUrl = requireNotNull(matches.followingUrl), gistsUrl = requireNotNull(matches.gistsUrl), gravatarId = matches.gravatarId, hireable = matches.hireable, htmlUrl = requireNotNull(matches.htmlUrl), id = requireNotNull(matches.id), location = matches.location, login = requireNotNull(matches.login), name = matches.name, nodeId = requireNotNull(matches.nodeId), organizationsUrl = requireNotNull(matches.organizationsUrl), publicGists = requireNotNull(matches.publicGists), publicRepos = requireNotNull(matches.publicRepos), receivedEventsUrl = requireNotNull(matches.receivedEventsUrl), reposUrl = requireNotNull(matches.reposUrl), siteAdmin = requireNotNull(matches.siteAdmin), starredUrl = requireNotNull(matches.starredUrl), subscriptionsUrl = requireNotNull(matches.subscriptionsUrl), type = requireNotNull(matches.type), updatedAt = requireNotNull(matches.updatedAt), url = requireNotNull(matches.url), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserGetResponse200JsonX7ddb2065) {
      encoder.requireJsonEncoder("InlineUserGetResponse200JsonX7ddb2065").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineUserGetResponse200JsonX7ddb2065Inspection(
  public val userViewType: String?,
  public val userViewTypeDecoded: Boolean,
  public val avatarUrl: String?,
  public val avatarUrlDecoded: Boolean,
  public val bio: String?,
  public val bioPresent: Boolean,
  public val bioDecoded: Boolean,
  public val blog: String?,
  public val blogPresent: Boolean,
  public val blogDecoded: Boolean,
  public val collaborators: Int?,
  public val collaboratorsDecoded: Boolean,
  public val company: String?,
  public val companyPresent: Boolean,
  public val companyDecoded: Boolean,
  public val createdAt: String?,
  public val createdAtDecoded: Boolean,
  public val diskUsage: Int?,
  public val diskUsageDecoded: Boolean,
  public val email: String?,
  public val emailPresent: Boolean,
  public val emailDecoded: Boolean,
  public val eventsUrl: String?,
  public val eventsUrlDecoded: Boolean,
  public val followers: Int?,
  public val followersDecoded: Boolean,
  public val followersUrl: String?,
  public val followersUrlDecoded: Boolean,
  public val following: Int?,
  public val followingDecoded: Boolean,
  public val followingUrl: String?,
  public val followingUrlDecoded: Boolean,
  public val gistsUrl: String?,
  public val gistsUrlDecoded: Boolean,
  public val gravatarId: String?,
  public val gravatarIdPresent: Boolean,
  public val gravatarIdDecoded: Boolean,
  public val hireable: Boolean?,
  public val hireablePresent: Boolean,
  public val hireableDecoded: Boolean,
  public val htmlUrl: String?,
  public val htmlUrlDecoded: Boolean,
  public val id: Long?,
  public val idDecoded: Boolean,
  public val location: String?,
  public val locationPresent: Boolean,
  public val locationDecoded: Boolean,
  public val login: String?,
  public val loginDecoded: Boolean,
  public val name: String?,
  public val namePresent: Boolean,
  public val nameDecoded: Boolean,
  public val nodeId: String?,
  public val nodeIdDecoded: Boolean,
  public val organizationsUrl: String?,
  public val organizationsUrlDecoded: Boolean,
  public val ownedPrivateRepos: Int?,
  public val ownedPrivateReposDecoded: Boolean,
  public val privateGists: Int?,
  public val privateGistsDecoded: Boolean,
  public val publicGists: Int?,
  public val publicGistsDecoded: Boolean,
  public val publicRepos: Int?,
  public val publicReposDecoded: Boolean,
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
  public val totalPrivateRepos: Int?,
  public val totalPrivateReposDecoded: Boolean,
  public val twoFactorAuthentication: Boolean?,
  public val twoFactorAuthenticationDecoded: Boolean,
  public val type: String?,
  public val typeDecoded: Boolean,
  public val updatedAt: String?,
  public val updatedAtDecoded: Boolean,
  public val url: String?,
  public val urlDecoded: Boolean,
  public val privateUserMatches: Boolean,
  public val publicUserMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (privateUserMatches) add("PrivateUser")
      if (publicUserMatches) add("PublicUser")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineUserGetResponse200JsonX7ddb2065(rawObject: JsonObject): InlineUserGetResponse200JsonX7ddb2065Inspection {
  val userViewTypeResult = rawObject["user_view_type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val userViewType = userViewTypeResult?.getOrNull()
  val userViewTypeDecoded = userViewTypeResult?.isSuccess == true
  val avatarUrlResult = rawObject["avatar_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val avatarUrl = avatarUrlResult?.getOrNull()
  val avatarUrlDecoded = avatarUrlResult?.isSuccess == true
  val bioResult = rawObject["bio"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val bio = bioResult?.getOrNull()
  val bioPresent = rawObject.containsKey("bio")
  val bioDecoded = bioResult?.isSuccess == true
  val blogResult = rawObject["blog"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val blog = blogResult?.getOrNull()
  val blogPresent = rawObject.containsKey("blog")
  val blogDecoded = blogResult?.isSuccess == true
  val collaboratorsResult = rawObject["collaborators"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val collaborators = collaboratorsResult?.getOrNull()
  val collaboratorsDecoded = collaboratorsResult?.isSuccess == true
  val companyResult = rawObject["company"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val company = companyResult?.getOrNull()
  val companyPresent = rawObject.containsKey("company")
  val companyDecoded = companyResult?.isSuccess == true
  val createdAtResult = rawObject["created_at"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val createdAt = createdAtResult?.getOrNull()
  val createdAtDecoded = createdAtResult?.isSuccess == true
  val diskUsageResult = rawObject["disk_usage"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val diskUsage = diskUsageResult?.getOrNull()
  val diskUsageDecoded = diskUsageResult?.isSuccess == true
  val emailResult = rawObject["email"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val email = emailResult?.getOrNull()
  val emailPresent = rawObject.containsKey("email")
  val emailDecoded = emailResult?.isSuccess == true
  val eventsUrlResult = rawObject["events_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val eventsUrl = eventsUrlResult?.getOrNull()
  val eventsUrlDecoded = eventsUrlResult?.isSuccess == true
  val followersResult = rawObject["followers"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val followers = followersResult?.getOrNull()
  val followersDecoded = followersResult?.isSuccess == true
  val followersUrlResult = rawObject["followers_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val followersUrl = followersUrlResult?.getOrNull()
  val followersUrlDecoded = followersUrlResult?.isSuccess == true
  val followingResult = rawObject["following"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val following = followingResult?.getOrNull()
  val followingDecoded = followingResult?.isSuccess == true
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
  val hireableResult = rawObject["hireable"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Boolean?>(element) } }
  val hireable = hireableResult?.getOrNull()
  val hireablePresent = rawObject.containsKey("hireable")
  val hireableDecoded = hireableResult?.isSuccess == true
  val htmlUrlResult = rawObject["html_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val htmlUrl = htmlUrlResult?.getOrNull()
  val htmlUrlDecoded = htmlUrlResult?.isSuccess == true
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Long>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val locationResult = rawObject["location"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val location = locationResult?.getOrNull()
  val locationPresent = rawObject.containsKey("location")
  val locationDecoded = locationResult?.isSuccess == true
  val loginResult = rawObject["login"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val login = loginResult?.getOrNull()
  val loginDecoded = loginResult?.isSuccess == true
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val name = nameResult?.getOrNull()
  val namePresent = rawObject.containsKey("name")
  val nameDecoded = nameResult?.isSuccess == true
  val nodeIdResult = rawObject["node_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val nodeId = nodeIdResult?.getOrNull()
  val nodeIdDecoded = nodeIdResult?.isSuccess == true
  val organizationsUrlResult = rawObject["organizations_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val organizationsUrl = organizationsUrlResult?.getOrNull()
  val organizationsUrlDecoded = organizationsUrlResult?.isSuccess == true
  val ownedPrivateReposResult = rawObject["owned_private_repos"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val ownedPrivateRepos = ownedPrivateReposResult?.getOrNull()
  val ownedPrivateReposDecoded = ownedPrivateReposResult?.isSuccess == true
  val privateGistsResult = rawObject["private_gists"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val privateGists = privateGistsResult?.getOrNull()
  val privateGistsDecoded = privateGistsResult?.isSuccess == true
  val publicGistsResult = rawObject["public_gists"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val publicGists = publicGistsResult?.getOrNull()
  val publicGistsDecoded = publicGistsResult?.isSuccess == true
  val publicReposResult = rawObject["public_repos"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val publicRepos = publicReposResult?.getOrNull()
  val publicReposDecoded = publicReposResult?.isSuccess == true
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
  val totalPrivateReposResult = rawObject["total_private_repos"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val totalPrivateRepos = totalPrivateReposResult?.getOrNull()
  val totalPrivateReposDecoded = totalPrivateReposResult?.isSuccess == true
  val twoFactorAuthenticationResult = rawObject["two_factor_authentication"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Boolean>(element) } }
  val twoFactorAuthentication = twoFactorAuthenticationResult?.getOrNull()
  val twoFactorAuthenticationDecoded = twoFactorAuthenticationResult?.isSuccess == true
  val typeResult = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val type = typeResult?.getOrNull()
  val typeDecoded = typeResult?.isSuccess == true
  val updatedAtResult = rawObject["updated_at"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val updatedAt = updatedAtResult?.getOrNull()
  val updatedAtDecoded = updatedAtResult?.isSuccess == true
  val urlResult = rawObject["url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val url = urlResult?.getOrNull()
  val urlDecoded = urlResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val privateUserMatches = userViewTypeDecoded && avatarUrlDecoded && bioPresent && bioDecoded && blogPresent && blogDecoded && collaboratorsDecoded && companyPresent && companyDecoded && createdAtDecoded && diskUsageDecoded && emailPresent && emailDecoded && eventsUrlDecoded && followersDecoded && followersUrlDecoded && followingDecoded && followingUrlDecoded && gistsUrlDecoded && gravatarIdPresent && gravatarIdDecoded && hireablePresent && hireableDecoded && htmlUrlDecoded && idDecoded && locationPresent && locationDecoded && loginDecoded && namePresent && nameDecoded && nodeIdDecoded && organizationsUrlDecoded && ownedPrivateReposDecoded && privateGistsDecoded && publicGistsDecoded && publicReposDecoded && receivedEventsUrlDecoded && reposUrlDecoded && siteAdminDecoded && starredUrlDecoded && subscriptionsUrlDecoded && totalPrivateReposDecoded && twoFactorAuthenticationDecoded && typeDecoded && updatedAtDecoded && urlDecoded
  val publicUserMatches = userViewTypeDecoded && avatarUrlDecoded && bioPresent && bioDecoded && blogPresent && blogDecoded && companyPresent && companyDecoded && createdAtDecoded && emailPresent && emailDecoded && eventsUrlDecoded && followersDecoded && followersUrlDecoded && followingDecoded && followingUrlDecoded && gistsUrlDecoded && gravatarIdPresent && gravatarIdDecoded && hireablePresent && hireableDecoded && htmlUrlDecoded && idDecoded && locationPresent && locationDecoded && loginDecoded && namePresent && nameDecoded && nodeIdDecoded && organizationsUrlDecoded && publicGistsDecoded && publicReposDecoded && receivedEventsUrlDecoded && reposUrlDecoded && siteAdminDecoded && starredUrlDecoded && subscriptionsUrlDecoded && typeDecoded && updatedAtDecoded && urlDecoded
  return InlineUserGetResponse200JsonX7ddb2065Inspection(
    userViewType = userViewType,
    userViewTypeDecoded = userViewTypeDecoded,
    avatarUrl = avatarUrl,
    avatarUrlDecoded = avatarUrlDecoded,
    bio = bio,
    bioPresent = bioPresent,
    bioDecoded = bioDecoded,
    blog = blog,
    blogPresent = blogPresent,
    blogDecoded = blogDecoded,
    collaborators = collaborators,
    collaboratorsDecoded = collaboratorsDecoded,
    company = company,
    companyPresent = companyPresent,
    companyDecoded = companyDecoded,
    createdAt = createdAt,
    createdAtDecoded = createdAtDecoded,
    diskUsage = diskUsage,
    diskUsageDecoded = diskUsageDecoded,
    email = email,
    emailPresent = emailPresent,
    emailDecoded = emailDecoded,
    eventsUrl = eventsUrl,
    eventsUrlDecoded = eventsUrlDecoded,
    followers = followers,
    followersDecoded = followersDecoded,
    followersUrl = followersUrl,
    followersUrlDecoded = followersUrlDecoded,
    following = following,
    followingDecoded = followingDecoded,
    followingUrl = followingUrl,
    followingUrlDecoded = followingUrlDecoded,
    gistsUrl = gistsUrl,
    gistsUrlDecoded = gistsUrlDecoded,
    gravatarId = gravatarId,
    gravatarIdPresent = gravatarIdPresent,
    gravatarIdDecoded = gravatarIdDecoded,
    hireable = hireable,
    hireablePresent = hireablePresent,
    hireableDecoded = hireableDecoded,
    htmlUrl = htmlUrl,
    htmlUrlDecoded = htmlUrlDecoded,
    id = id,
    idDecoded = idDecoded,
    location = location,
    locationPresent = locationPresent,
    locationDecoded = locationDecoded,
    login = login,
    loginDecoded = loginDecoded,
    name = name,
    namePresent = namePresent,
    nameDecoded = nameDecoded,
    nodeId = nodeId,
    nodeIdDecoded = nodeIdDecoded,
    organizationsUrl = organizationsUrl,
    organizationsUrlDecoded = organizationsUrlDecoded,
    ownedPrivateRepos = ownedPrivateRepos,
    ownedPrivateReposDecoded = ownedPrivateReposDecoded,
    privateGists = privateGists,
    privateGistsDecoded = privateGistsDecoded,
    publicGists = publicGists,
    publicGistsDecoded = publicGistsDecoded,
    publicRepos = publicRepos,
    publicReposDecoded = publicReposDecoded,
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
    totalPrivateRepos = totalPrivateRepos,
    totalPrivateReposDecoded = totalPrivateReposDecoded,
    twoFactorAuthentication = twoFactorAuthentication,
    twoFactorAuthenticationDecoded = twoFactorAuthenticationDecoded,
    type = type,
    typeDecoded = typeDecoded,
    updatedAt = updatedAt,
    updatedAtDecoded = updatedAtDecoded,
    url = url,
    urlDecoded = urlDecoded,
    privateUserMatches = privateUserMatches,
    publicUserMatches = publicUserMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!privateUserMatches) add("PrivateUser: branch predicate did not match properties 'user_view_type' and 'avatar_url' and 'bio' and 'blog' and 'collaborators' and 'company' and 'created_at' and 'disk_usage' and 'email' and 'events_url' and 'followers' and 'followers_url' and 'following' and 'following_url' and 'gists_url' and 'gravatar_id' and 'hireable' and 'html_url' and 'id' and 'location' and 'login' and 'name' and 'node_id' and 'organizations_url' and 'owned_private_repos' and 'private_gists' and 'public_gists' and 'public_repos' and 'received_events_url' and 'repos_url' and 'site_admin' and 'starred_url' and 'subscriptions_url' and 'total_private_repos' and 'two_factor_authentication' and 'type' and 'updated_at' and 'url'")
      if (!publicUserMatches) add("PublicUser: branch predicate did not match properties 'user_view_type' and 'avatar_url' and 'bio' and 'blog' and 'company' and 'created_at' and 'email' and 'events_url' and 'followers' and 'followers_url' and 'following' and 'following_url' and 'gists_url' and 'gravatar_id' and 'hireable' and 'html_url' and 'id' and 'location' and 'login' and 'name' and 'node_id' and 'organizations_url' and 'public_gists' and 'public_repos' and 'received_events_url' and 'repos_url' and 'site_admin' and 'starred_url' and 'subscriptions_url' and 'type' and 'updated_at' and 'url'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
