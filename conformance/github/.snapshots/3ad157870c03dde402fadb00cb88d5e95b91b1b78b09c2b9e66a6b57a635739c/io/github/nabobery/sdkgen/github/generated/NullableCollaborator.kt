package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Long
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Collaborator
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-collaborator
 */
@Serializable(with = NullableCollaborator.Serializer::class)
public class NullableCollaborator internal constructor(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val avatarUrl: String,
  public val eventsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val followersUrl: String,
  public val followingUrl: String,
  public val gistsUrl: String,
  public val gravatarId: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Long,
  public val login: String,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val organizationsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val receivedEventsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reposUrl: String,
  public val roleName: String,
  public val siteAdmin: Boolean,
  public val starredUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val subscriptionsUrl: String,
  public val type: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val emailState: FieldState<String?>,
  private val nameState: FieldState<String?>,
  private val permissionsState: FieldState<InlineNullableCollaboratorPermissionsX123dc9bf>,
  private val userViewTypeState: FieldState<String>,
) {
  public val email: String?
    get() = emailState.valueOrNull()

  public val name: String?
    get() = nameState.valueOrNull()

  public val permissions: InlineNullableCollaboratorPermissionsX123dc9bf?
    get() = permissionsState.valueOrNull()

  public val userViewType: String?
    get() = userViewTypeState.valueOrNull()

  public constructor(
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
    roleName: String,
    siteAdmin: Boolean,
    starredUrl: String,
    subscriptionsUrl: String,
    type: String,
    url: String,
  ) : this(avatarUrl = avatarUrl,
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
  roleName = roleName,
  siteAdmin = siteAdmin,
  starredUrl = starredUrl,
  subscriptionsUrl = subscriptionsUrl,
  type = type,
  url = url,
  emailState = FieldState.Absent,
  nameState = FieldState.Absent,
  permissionsState = FieldState.Absent,
  userViewTypeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `email`.
   */
  public fun emailPresence(): FieldPresence = emailState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `permissions`.
   */
  public fun permissionsPresence(): FieldPresence = permissionsState.presence

  /**
   * Returns the wire presence of `user_view_type`.
   */
  public fun userViewTypePresence(): FieldPresence = userViewTypeState.presence

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

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var organizationsUrlValue: String? = null

    public var organizationsUrl: String
      get() = requireNotNull(organizationsUrlValue) { "organizationsUrl is required" }
      set(`value`) {
        organizationsUrlValue = value
      }

    private var receivedEventsUrlValue: String? = null

    public var receivedEventsUrl: String
      get() = requireNotNull(receivedEventsUrlValue) { "receivedEventsUrl is required" }
      set(`value`) {
        receivedEventsUrlValue = value
      }

    private var reposUrlValue: String? = null

    public var reposUrl: String
      get() = requireNotNull(reposUrlValue) { "reposUrl is required" }
      set(`value`) {
        reposUrlValue = value
      }

    private var roleNameValue: String? = null

    public var roleName: String
      get() = requireNotNull(roleNameValue) { "roleName is required" }
      set(`value`) {
        roleNameValue = value
      }

    private var siteAdminValue: Boolean? = null

    public var siteAdmin: Boolean
      get() = requireNotNull(siteAdminValue) { "siteAdmin is required" }
      set(`value`) {
        siteAdminValue = value
      }

    private var starredUrlValue: String? = null

    public var starredUrl: String
      get() = requireNotNull(starredUrlValue) { "starredUrl is required" }
      set(`value`) {
        starredUrlValue = value
      }

    private var subscriptionsUrlValue: String? = null

    public var subscriptionsUrl: String
      get() = requireNotNull(subscriptionsUrlValue) { "subscriptionsUrl is required" }
      set(`value`) {
        subscriptionsUrlValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var gravatarIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var gravatarId: String?
      get() = gravatarIdState.valueOrNull()
      set(`value`) {
        gravatarIdState = value.toNullableFieldState()
      }

    private var emailState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        emailState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    private var permissionsState: FieldState<InlineNullableCollaboratorPermissionsX123dc9bf> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permissions: InlineNullableCollaboratorPermissionsX123dc9bf?
      get() = permissionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permissions is not nullable; call unsetPermissions() to omit it" }
        permissionsState = FieldState.Value(present)
      }

    private var userViewTypeState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var userViewType: String?
      get() = userViewTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "userViewType is not nullable; call unsetUserViewType() to omit it" }
        userViewTypeState = FieldState.Value(present)
      }

    /**
     * Omits `email` from serialized output.
     */
    public fun unsetEmail() {
      emailState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `permissions` from serialized output.
     */
    public fun unsetPermissions() {
      permissionsState = FieldState.Absent
    }

    /**
     * Omits `user_view_type` from serialized output.
     */
    public fun unsetUserViewType() {
      userViewTypeState = FieldState.Absent
    }

    public fun build(): NullableCollaborator {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(followersUrlValue != null) { "followersUrl is required" }
      check(followingUrlValue != null) { "followingUrl is required" }
      check(gistsUrlValue != null) { "gistsUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(organizationsUrlValue != null) { "organizationsUrl is required" }
      check(receivedEventsUrlValue != null) { "receivedEventsUrl is required" }
      check(reposUrlValue != null) { "reposUrl is required" }
      check(roleNameValue != null) { "roleName is required" }
      check(siteAdminValue != null) { "siteAdmin is required" }
      check(starredUrlValue != null) { "starredUrl is required" }
      check(subscriptionsUrlValue != null) { "subscriptionsUrl is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(gravatarIdState !== FieldState.Absent) { "gravatarId is required, even when null" }
      return NullableCollaborator(
        avatarUrl = avatarUrl,
        eventsUrl = eventsUrl,
        followersUrl = followersUrl,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        gravatarId = gravatarIdState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        login = login,
        nodeId = nodeId,
        organizationsUrl = organizationsUrl,
        receivedEventsUrl = receivedEventsUrl,
        reposUrl = reposUrl,
        roleName = roleName,
        siteAdmin = siteAdmin,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        type = type,
        url = url,
        emailState = emailState,
        nameState = nameState,
        permissionsState = permissionsState,
        userViewTypeState = userViewTypeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullableCollaborator = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NullableCollaborator> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableCollaborator {
      val jsonDecoder = decoder.requireJsonDecoder("NullableCollaborator")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableCollaborator must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val followersUrl = json.decodeRequired<String>(rawObject, "followers_url")
      val followingUrl = json.decodeRequired<String>(rawObject, "following_url")
      val gistsUrl = json.decodeRequired<String>(rawObject, "gists_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val organizationsUrl = json.decodeRequired<String>(rawObject, "organizations_url")
      val receivedEventsUrl = json.decodeRequired<String>(rawObject, "received_events_url")
      val reposUrl = json.decodeRequired<String>(rawObject, "repos_url")
      val roleName = json.decodeRequired<String>(rawObject, "role_name")
      val siteAdmin = json.decodeRequired<Boolean>(rawObject, "site_admin")
      val starredUrl = json.decodeRequired<String>(rawObject, "starred_url")
      val subscriptionsUrl = json.decodeRequired<String>(rawObject, "subscriptions_url")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("gravatar_id")) {
        throw SerializationException("NullableCollaborator is missing required property 'gravatar_id'")
      }
      val gravatarId = rawObject["gravatar_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return NullableCollaborator(
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
        roleName = roleName,
        siteAdmin = siteAdmin,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        type = type,
        url = url,
        emailState = json.decodeOptional(rawObject, "email", nullable = true),
        nameState = json.decodeOptional(rawObject, "name", nullable = true),
        permissionsState = json.decodeOptional(rawObject, "permissions", nullable = false),
        userViewTypeState = json.decodeOptional(rawObject, "user_view_type", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableCollaborator) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableCollaborator")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("events_url", value.eventsUrl)
        put("followers_url", value.followersUrl)
        put("following_url", value.followingUrl)
        put("gists_url", value.gistsUrl)
        put("gravatar_id", value.gravatarId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
        put("node_id", value.nodeId)
        put("organizations_url", value.organizationsUrl)
        put("received_events_url", value.receivedEventsUrl)
        put("repos_url", value.reposUrl)
        put("role_name", value.roleName)
        put("site_admin", json.encodeToJsonElement(value.siteAdmin))
        put("starred_url", value.starredUrl)
        put("subscriptions_url", value.subscriptionsUrl)
        put("type", value.type)
        put("url", value.url)
        putState("email", value.emailState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("permissions", value.permissionsState, json::encodeToJsonElement)
        putState("user_view_type", value.userViewTypeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullableCollaborator(block: NullableCollaborator.Builder.() -> Unit): NullableCollaborator = NullableCollaborator.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NullableCollaborator is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("NullableCollaborator property '" + name + "' is not nullable")
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
