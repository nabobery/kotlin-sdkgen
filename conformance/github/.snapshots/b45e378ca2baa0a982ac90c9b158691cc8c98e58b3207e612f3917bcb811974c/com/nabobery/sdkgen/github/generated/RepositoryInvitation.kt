package com.nabobery.sdkgen.github.generated

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
 * Repository invitations let you manage who you collaborate with.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-invitation
 */
@Serializable(with = RepositoryInvitation.Serializer::class)
public class RepositoryInvitation internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val htmlUrl: String,
  /**
   * Unique identifier of the repository invitation.
   */
  public val id: Long,
  public val invitee: NullableSimpleUser?,
  public val inviter: NullableSimpleUser?,
  public val nodeId: String,
  /**
   * The permission associated with the invitation.
   */
  public val permissions: InlineRepositoryInvitationPermissionsXe2c9647d,
  public val repository: MinimalRepository,
  /**
   * URL for the repository invitation
   */
  public val url: String,
  private val expiredState: FieldState<Boolean>,
) {
  /**
   * Whether or not the invitation has expired
   */
  public val expired: Boolean?
    get() = expiredState.valueOrNull()

  public constructor(
    createdAt: String,
    htmlUrl: String,
    id: Long,
    invitee: NullableSimpleUser?,
    inviter: NullableSimpleUser?,
    nodeId: String,
    permissions: InlineRepositoryInvitationPermissionsXe2c9647d,
    repository: MinimalRepository,
    url: String,
  ) : this(createdAt = createdAt,
  htmlUrl = htmlUrl,
  id = id,
  invitee = invitee,
  inviter = inviter,
  nodeId = nodeId,
  permissions = permissions,
  repository = repository,
  url = url,
  expiredState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `expired`.
   */
  public fun expiredPresence(): FieldPresence = expiredState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
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

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var permissionsValue: InlineRepositoryInvitationPermissionsXe2c9647d? = null

    public var permissions: InlineRepositoryInvitationPermissionsXe2c9647d
      get() = requireNotNull(permissionsValue) { "permissions is required" }
      set(`value`) {
        permissionsValue = value
      }

    private var repositoryValue: MinimalRepository? = null

    public var repository: MinimalRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var inviteeState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var invitee: NullableSimpleUser?
      get() = inviteeState.valueOrNull()
      set(`value`) {
        inviteeState = value.toNullableFieldState()
      }

    private var inviterState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var inviter: NullableSimpleUser?
      get() = inviterState.valueOrNull()
      set(`value`) {
        inviterState = value.toNullableFieldState()
      }

    private var expiredState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether or not the invitation has expired
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var expired: Boolean?
      get() = expiredState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "expired is not nullable; call unsetExpired() to omit it" }
        expiredState = FieldState.Value(present)
      }

    /**
     * Omits `expired` from serialized output.
     */
    public fun unsetExpired() {
      expiredState = FieldState.Absent
    }

    public fun build(): RepositoryInvitation {
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(permissionsValue != null) { "permissions is required" }
      check(repositoryValue != null) { "repository is required" }
      check(urlValue != null) { "url is required" }
      check(inviteeState !== FieldState.Absent) { "invitee is required, even when null" }
      check(inviterState !== FieldState.Absent) { "inviter is required, even when null" }
      return RepositoryInvitation(
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        invitee = inviteeState.valueOrNull(),
        inviter = inviterState.valueOrNull(),
        nodeId = nodeId,
        permissions = permissions,
        repository = repository,
        url = url,
        expiredState = expiredState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryInvitation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryInvitation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryInvitation {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryInvitation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryInvitation must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val permissions = json.decodeRequired<InlineRepositoryInvitationPermissionsXe2c9647d>(rawObject, "permissions")
      val repository = json.decodeRequired<MinimalRepository>(rawObject, "repository")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("invitee")) {
        throw SerializationException("RepositoryInvitation is missing required property 'invitee'")
      }
      val invitee = rawObject["invitee"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("inviter")) {
        throw SerializationException("RepositoryInvitation is missing required property 'inviter'")
      }
      val inviter = rawObject["inviter"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return RepositoryInvitation(
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        invitee = invitee,
        inviter = inviter,
        nodeId = nodeId,
        permissions = permissions,
        repository = repository,
        url = url,
        expiredState = json.decodeOptional(rawObject, "expired", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryInvitation) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryInvitation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("invitee", value.invitee?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("inviter", value.inviter?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("permissions", json.encodeToJsonElement(value.permissions))
        put("repository", json.encodeToJsonElement(value.repository))
        put("url", value.url)
        putState("expired", value.expiredState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryInvitation(block: RepositoryInvitation.Builder.() -> Unit): RepositoryInvitation = RepositoryInvitation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryInvitation is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("RepositoryInvitation property '" + name + "' is not nullable")
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
