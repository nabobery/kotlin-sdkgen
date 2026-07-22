package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes/properties/owner/p
 * roperties/from/properties/organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes/properties/owner/p
 * roperties/from/properties/organization
 */
@Serializable(with = InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac.Serializer::class)
public class InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac internal constructor(
  public val avatarUrl: String,
  public val description: String?,
  public val eventsUrl: String,
  public val hooksUrl: String,
  public val id: Int,
  public val issuesUrl: String,
  public val login: String,
  public val membersUrl: String,
  public val nodeId: String,
  public val publicMembersUrl: String,
  public val reposUrl: String,
  public val url: String,
  private val htmlUrlState: FieldState<String>,
) {
  public val htmlUrl: String?
    get() = htmlUrlState.valueOrNull()

  public constructor(
    avatarUrl: String,
    description: String?,
    eventsUrl: String,
    hooksUrl: String,
    id: Int,
    issuesUrl: String,
    login: String,
    membersUrl: String,
    nodeId: String,
    publicMembersUrl: String,
    reposUrl: String,
    url: String,
  ) : this(avatarUrl = avatarUrl,
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
  htmlUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `html_url`.
   */
  public fun htmlUrlPresence(): FieldPresence = htmlUrlState.presence

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

    private var htmlUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var htmlUrl: String?
      get() = htmlUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "htmlUrl is not nullable; call unsetHtmlUrl() to omit it" }
        htmlUrlState = FieldState.Value(present)
      }

    /**
     * Omits `html_url` from serialized output.
     */
    public fun unsetHtmlUrl() {
      htmlUrlState = FieldState.Absent
    }

    public fun build(): InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac {
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
      return InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac(
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
        htmlUrlState = htmlUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac must be a JSON object")
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
        throw SerializationException("InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac(
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
        htmlUrlState = json.decodeOptional(rawObject, "html_url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac")
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
        putState("html_url", value.htmlUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac(block: InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac.Builder.() -> Unit): InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac = InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac property '" + name + "' is not nullable")
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
