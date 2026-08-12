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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/simple-commit-status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-commit-status
 */
@Serializable(with = SimpleCommitStatus.Serializer::class)
public class SimpleCommitStatus internal constructor(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val avatarUrl: String?,
  public val context: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val description: String?,
  public val id: Int,
  public val nodeId: String,
  public val state: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val targetUrl: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val requiredState: FieldState<Boolean?>,
) {
  public val required: Boolean?
    get() = requiredState.valueOrNull()

  public constructor(
    avatarUrl: String?,
    context: String,
    createdAt: String,
    description: String?,
    id: Int,
    nodeId: String,
    state: String,
    targetUrl: String?,
    updatedAt: String,
    url: String,
  ) : this(avatarUrl = avatarUrl,
  context = context,
  createdAt = createdAt,
  description = description,
  id = id,
  nodeId = nodeId,
  state = state,
  targetUrl = targetUrl,
  updatedAt = updatedAt,
  url = url,
  requiredState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `required`.
   */
  public fun requiredPresence(): FieldPresence = requiredState.presence

  public class Builder {
    private var contextValue: String? = null

    public var context: String
      get() = requireNotNull(contextValue) { "context is required" }
      set(`value`) {
        contextValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Int? = null

    public var id: Int
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

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var avatarUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var avatarUrl: String?
      get() = avatarUrlState.valueOrNull()
      set(`value`) {
        avatarUrlState = value.toNullableFieldState()
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

    private var targetUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var targetUrl: String?
      get() = targetUrlState.valueOrNull()
      set(`value`) {
        targetUrlState = value.toNullableFieldState()
      }

    private var requiredState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var required: Boolean?
      get() = requiredState.valueOrNull()
      set(`value`) {
        requiredState = value.toNullableFieldState()
      }

    /**
     * Omits `required` from serialized output.
     */
    public fun unsetRequired() {
      requiredState = FieldState.Absent
    }

    public fun build(): SimpleCommitStatus {
      check(contextValue != null) { "context is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(stateValue != null) { "state is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(avatarUrlState !== FieldState.Absent) { "avatarUrl is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(targetUrlState !== FieldState.Absent) { "targetUrl is required, even when null" }
      return SimpleCommitStatus(
        avatarUrl = avatarUrlState.valueOrNull(),
        context = context,
        createdAt = createdAt,
        description = descriptionState.valueOrNull(),
        id = id,
        nodeId = nodeId,
        state = state,
        targetUrl = targetUrlState.valueOrNull(),
        updatedAt = updatedAt,
        url = url,
        requiredState = requiredState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SimpleCommitStatus = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SimpleCommitStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SimpleCommitStatus {
      val jsonDecoder = decoder.requireJsonDecoder("SimpleCommitStatus")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SimpleCommitStatus must be a JSON object")
      val context = json.decodeRequired<String>(rawObject, "context")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val state = json.decodeRequired<String>(rawObject, "state")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("avatar_url")) {
        throw SerializationException("SimpleCommitStatus is missing required property 'avatar_url'")
      }
      val avatarUrl = rawObject["avatar_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("SimpleCommitStatus is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("target_url")) {
        throw SerializationException("SimpleCommitStatus is missing required property 'target_url'")
      }
      val targetUrl = rawObject["target_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return SimpleCommitStatus(
        avatarUrl = avatarUrl,
        context = context,
        createdAt = createdAt,
        description = description,
        id = id,
        nodeId = nodeId,
        state = state,
        targetUrl = targetUrl,
        updatedAt = updatedAt,
        url = url,
        requiredState = json.decodeOptional(rawObject, "required", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: SimpleCommitStatus) {
      val jsonEncoder = encoder.requireJsonEncoder("SimpleCommitStatus")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("context", value.context)
        put("created_at", value.createdAt)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("state", value.state)
        put("target_url", value.targetUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("required", value.requiredState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun simpleCommitStatus(block: SimpleCommitStatus.Builder.() -> Unit): SimpleCommitStatus = SimpleCommitStatus.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SimpleCommitStatus is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("SimpleCommitStatus property '" + name + "' is not nullable")
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
