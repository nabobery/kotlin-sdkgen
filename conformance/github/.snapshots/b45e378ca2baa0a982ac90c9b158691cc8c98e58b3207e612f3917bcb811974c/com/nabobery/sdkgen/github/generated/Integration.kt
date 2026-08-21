package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
 * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
 * first class actors within GitHub.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/integration
 */
@Serializable(with = Integration.Serializer::class)
public class Integration internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val description: String?,
  events: List<String>,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val externalUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the GitHub app
   */
  public val id: Int,
  /**
   * The name of the GitHub app
   */
  public val name: String,
  public val nodeId: String,
  public val owner: InlineIntegrationOwnerX90da16c1,
  /**
   * The set of permissions for the GitHub app
   */
  public val permissions: InlineIntegrationPermissionsXff8f9bc6,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  private val clientIdState: FieldState<String>,
  private val installationsCountState: FieldState<Int>,
  private val slugState: FieldState<String>,
) {
  /**
   * The list of events for the GitHub app. Note that the `installation_target`, `security_advisory`, and `meta` events
   * are not included because they are global events and not specific to an installation.
   */
  public val events: List<String> = events.toList()

  public val clientId: String?
    get() = clientIdState.valueOrNull()

  /**
   * The number of installations associated with the GitHub app. Only returned when the integration is requesting
   * details about itself.
   */
  public val installationsCount: Int?
    get() = installationsCountState.valueOrNull()

  /**
   * The slug name of the GitHub app
   */
  public val slug: String?
    get() = slugState.valueOrNull()

  public constructor(
    createdAt: String,
    description: String?,
    events: List<String>,
    externalUrl: String,
    htmlUrl: String,
    id: Int,
    name: String,
    nodeId: String,
    owner: InlineIntegrationOwnerX90da16c1,
    permissions: InlineIntegrationPermissionsXff8f9bc6,
    updatedAt: String,
  ) : this(createdAt = createdAt,
  description = description,
  events = events,
  externalUrl = externalUrl,
  htmlUrl = htmlUrl,
  id = id,
  name = name,
  nodeId = nodeId,
  owner = owner,
  permissions = permissions,
  updatedAt = updatedAt,
  clientIdState = FieldState.Absent,
  installationsCountState = FieldState.Absent,
  slugState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `client_id`.
   */
  public fun clientIdPresence(): FieldPresence = clientIdState.presence

  /**
   * Returns the wire presence of `installations_count`.
   */
  public fun installationsCountPresence(): FieldPresence = installationsCountState.presence

  /**
   * Returns the wire presence of `slug`.
   */
  public fun slugPresence(): FieldPresence = slugState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var eventsValue: List<String>? = null

    public var events: List<String>
      get() = requireNotNull(eventsValue) { "events is required" }.toList()
      set(`value`) {
        eventsValue = value.toList()
      }

    private var externalUrlValue: String? = null

    public var externalUrl: String
      get() = requireNotNull(externalUrlValue) { "externalUrl is required" }
      set(`value`) {
        externalUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var ownerValue: InlineIntegrationOwnerX90da16c1? = null

    public var owner: InlineIntegrationOwnerX90da16c1
      get() = requireNotNull(ownerValue) { "owner is required" }
      set(`value`) {
        ownerValue = value
      }

    private var permissionsValue: InlineIntegrationPermissionsXff8f9bc6? = null

    public var permissions: InlineIntegrationPermissionsXff8f9bc6
      get() = requireNotNull(permissionsValue) { "permissions is required" }
      set(`value`) {
        permissionsValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
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

    private var clientIdState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var clientId: String?
      get() = clientIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "clientId is not nullable; call unsetClientId() to omit it" }
        clientIdState = FieldState.Value(present)
      }

    private var installationsCountState: FieldState<Int> = FieldState.Absent

    /**
     * The number of installations associated with the GitHub app. Only returned when the integration is requesting
     * details about itself.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var installationsCount: Int?
      get() = installationsCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "installationsCount is not nullable; call unsetInstallationsCount() to omit it" }
        installationsCountState = FieldState.Value(present)
      }

    private var slugState: FieldState<String> = FieldState.Absent

    /**
     * The slug name of the GitHub app
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var slug: String?
      get() = slugState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "slug is not nullable; call unsetSlug() to omit it" }
        slugState = FieldState.Value(present)
      }

    /**
     * Omits `client_id` from serialized output.
     */
    public fun unsetClientId() {
      clientIdState = FieldState.Absent
    }

    /**
     * Omits `installations_count` from serialized output.
     */
    public fun unsetInstallationsCount() {
      installationsCountState = FieldState.Absent
    }

    /**
     * Omits `slug` from serialized output.
     */
    public fun unsetSlug() {
      slugState = FieldState.Absent
    }

    public fun build(): Integration {
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsValue != null) { "events is required" }
      check(externalUrlValue != null) { "externalUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(ownerValue != null) { "owner is required" }
      check(permissionsValue != null) { "permissions is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return Integration(
        createdAt = createdAt,
        description = descriptionState.valueOrNull(),
        events = events,
        externalUrl = externalUrl,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        owner = owner,
        permissions = permissions,
        updatedAt = updatedAt,
        clientIdState = clientIdState,
        installationsCountState = installationsCountState,
        slugState = slugState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Integration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Integration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Integration {
      val jsonDecoder = decoder.requireJsonDecoder("Integration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Integration must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val events = json.decodeRequired<List<String>>(rawObject, "events")
      val externalUrl = json.decodeRequired<String>(rawObject, "external_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val owner = json.decodeRequired<InlineIntegrationOwnerX90da16c1>(rawObject, "owner")
      val permissions = json.decodeRequired<InlineIntegrationPermissionsXff8f9bc6>(rawObject, "permissions")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("Integration is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Integration(
        createdAt = createdAt,
        description = description,
        events = events,
        externalUrl = externalUrl,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        owner = owner,
        permissions = permissions,
        updatedAt = updatedAt,
        clientIdState = json.decodeOptional(rawObject, "client_id", nullable = false),
        installationsCountState = json.decodeOptional(rawObject, "installations_count", nullable = false),
        slugState = json.decodeOptional(rawObject, "slug", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Integration) {
      val jsonEncoder = encoder.requireJsonEncoder("Integration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("events", json.encodeToJsonElement(value.events))
        put("external_url", value.externalUrl)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("owner", json.encodeToJsonElement(value.owner))
        put("permissions", json.encodeToJsonElement(value.permissions))
        put("updated_at", value.updatedAt)
        putState("client_id", value.clientIdState, json::encodeToJsonElement)
        putState("installations_count", value.installationsCountState, json::encodeToJsonElement)
        putState("slug", value.slugState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun integration(block: Integration.Builder.() -> Unit): Integration = Integration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Integration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("Integration property '" + name + "' is not nullable")
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
