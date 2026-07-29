package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class OrganizationSimpleView(
  @SerialName("avatar_url")
  public val avatarUrl: String,
  public val description: String?,
  @SerialName("events_url")
  public val eventsUrl: String,
  @SerialName("hooks_url")
  public val hooksUrl: String,
  public val id: Int,
  @SerialName("issues_url")
  public val issuesUrl: String,
  public val login: String,
  @SerialName("members_url")
  public val membersUrl: String,
  @SerialName("node_id")
  public val nodeId: String,
  @SerialName("public_members_url")
  public val publicMembersUrl: String,
  @SerialName("repos_url")
  public val reposUrl: String,
  public val url: String,
)

/**
 * A GitHub organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-simple
 */
@Serializable(with = OrganizationSimple.Serializer::class)
public class OrganizationSimple(
  public val avatarUrl: String,
  public val description: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val eventsUrl: String,
  public val hooksUrl: String,
  public val id: Int,
  public val issuesUrl: String,
  public val login: String,
  public val membersUrl: String,
  public val nodeId: String,
  public val publicMembersUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reposUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var avatarUrlValue: String? = null

    public var avatarUrl: String
      get() = requireNotNull(avatarUrlValue) { "avatarUrl is required" }
      set(`value`) {
        avatarUrlValue = value
      }

    private var eventsUrlValue: String? = null

    public var eventsUrl: String
      get() = requireNotNull(eventsUrlValue) { "eventsUrl is required" }
      set(`value`) {
        eventsUrlValue = value
      }

    private var hooksUrlValue: String? = null

    public var hooksUrl: String
      get() = requireNotNull(hooksUrlValue) { "hooksUrl is required" }
      set(`value`) {
        hooksUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var issuesUrlValue: String? = null

    public var issuesUrl: String
      get() = requireNotNull(issuesUrlValue) { "issuesUrl is required" }
      set(`value`) {
        issuesUrlValue = value
      }

    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var membersUrlValue: String? = null

    public var membersUrl: String
      get() = requireNotNull(membersUrlValue) { "membersUrl is required" }
      set(`value`) {
        membersUrlValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var publicMembersUrlValue: String? = null

    public var publicMembersUrl: String
      get() = requireNotNull(publicMembersUrlValue) { "publicMembersUrl is required" }
      set(`value`) {
        publicMembersUrlValue = value
      }

    private var reposUrlValue: String? = null

    public var reposUrl: String
      get() = requireNotNull(reposUrlValue) { "reposUrl is required" }
      set(`value`) {
        reposUrlValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    public fun build(): OrganizationSimple {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(hooksUrlValue != null) { "hooksUrl is required" }
      check(idValue != null) { "id is required" }
      check(issuesUrlValue != null) { "issuesUrl is required" }
      check(loginValue != null) { "login is required" }
      check(membersUrlValue != null) { "membersUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(publicMembersUrlValue != null) { "publicMembersUrl is required" }
      check(reposUrlValue != null) { "reposUrl is required" }
      check(urlValue != null) { "url is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return OrganizationSimple(
        avatarUrl = avatarUrl,
        description = descriptionState.valueOrNull(),
        eventsUrl = eventsUrl,
        hooksUrl = hooksUrl,
        id = id,
        issuesUrl = issuesUrl,
        login = login,
        membersUrl = membersUrl,
        nodeId = nodeId,
        publicMembersUrl = publicMembersUrl,
        reposUrl = reposUrl,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrganizationSimple = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OrganizationSimple> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationSimple {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationSimple")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationSimple must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val hooksUrl = json.decodeRequired<String>(rawObject, "hooks_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val issuesUrl = json.decodeRequired<String>(rawObject, "issues_url")
      val login = json.decodeRequired<String>(rawObject, "login")
      val membersUrl = json.decodeRequired<String>(rawObject, "members_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val publicMembersUrl = json.decodeRequired<String>(rawObject, "public_members_url")
      val reposUrl = json.decodeRequired<String>(rawObject, "repos_url")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("OrganizationSimple is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return OrganizationSimple(
        avatarUrl = avatarUrl,
        description = description,
        eventsUrl = eventsUrl,
        hooksUrl = hooksUrl,
        id = id,
        issuesUrl = issuesUrl,
        login = login,
        membersUrl = membersUrl,
        nodeId = nodeId,
        publicMembersUrl = publicMembersUrl,
        reposUrl = reposUrl,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationSimple) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationSimple")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("events_url", value.eventsUrl)
        put("hooks_url", value.hooksUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("issues_url", value.issuesUrl)
        put("login", value.login)
        put("members_url", value.membersUrl)
        put("node_id", value.nodeId)
        put("public_members_url", value.publicMembersUrl)
        put("repos_url", value.reposUrl)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun organizationSimple(block: OrganizationSimple.Builder.() -> Unit): OrganizationSimple = OrganizationSimple.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrganizationSimple is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("OrganizationSimple property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
