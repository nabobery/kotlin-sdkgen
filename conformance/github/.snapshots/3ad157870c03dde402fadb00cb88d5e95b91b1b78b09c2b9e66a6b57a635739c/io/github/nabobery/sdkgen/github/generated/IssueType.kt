package io.github.nabobery.sdkgen.github.generated

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
 * The type assigned to the issue. This is only present for issues in repositories where issue types are supported.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-type
 */
@Serializable(with = IssueType.Serializer::class)
public class IssueType internal constructor(
  /**
   * The description of the issue type.
   */
  public val description: String?,
  /**
   * The unique identifier of the issue type.
   */
  public val id: Int,
  /**
   * The name of the issue type.
   */
  public val name: String,
  /**
   * The node identifier of the issue type.
   */
  public val nodeId: String,
  private val colorState: FieldState<InlineIssueTypeColorX8798faf3?>,
  private val createdAtState: FieldState<String>,
  private val isEnabledState: FieldState<Boolean>,
  private val updatedAtState: FieldState<String>,
) {
  /**
   * The color of the issue type.
   */
  public val color: InlineIssueTypeColorX8798faf3?
    get() = colorState.valueOrNull()

  /**
   * The time the issue type created.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String?
    get() = createdAtState.valueOrNull()

  /**
   * The enabled state of the issue type.
   */
  public val isEnabled: Boolean?
    get() = isEnabledState.valueOrNull()

  /**
   * The time the issue type last updated.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public constructor(
    description: String?,
    id: Int,
    name: String,
    nodeId: String,
  ) : this(description = description,
  id = id,
  name = name,
  nodeId = nodeId,
  colorState = FieldState.Absent,
  createdAtState = FieldState.Absent,
  isEnabledState = FieldState.Absent,
  updatedAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `color`.
   */
  public fun colorPresence(): FieldPresence = colorState.presence

  /**
   * Returns the wire presence of `created_at`.
   */
  public fun createdAtPresence(): FieldPresence = createdAtState.presence

  /**
   * Returns the wire presence of `is_enabled`.
   */
  public fun isEnabledPresence(): FieldPresence = isEnabledState.presence

  /**
   * Returns the wire presence of `updated_at`.
   */
  public fun updatedAtPresence(): FieldPresence = updatedAtState.presence

  public class Builder {
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

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * The description of the issue type.
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var colorState: FieldState<InlineIssueTypeColorX8798faf3?> = FieldState.Absent

    /**
     * The color of the issue type.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var color: InlineIssueTypeColorX8798faf3?
      get() = colorState.valueOrNull()
      set(`value`) {
        colorState = value.toNullableFieldState()
      }

    private var createdAtState: FieldState<String> = FieldState.Absent

    /**
     * The time the issue type created.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "createdAt is not nullable; call unsetCreatedAt() to omit it" }
        createdAtState = FieldState.Value(present)
      }

    private var isEnabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * The enabled state of the issue type.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isEnabled: Boolean?
      get() = isEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "isEnabled is not nullable; call unsetIsEnabled() to omit it" }
        isEnabledState = FieldState.Value(present)
      }

    private var updatedAtState: FieldState<String> = FieldState.Absent

    /**
     * The time the issue type last updated.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "updatedAt is not nullable; call unsetUpdatedAt() to omit it" }
        updatedAtState = FieldState.Value(present)
      }

    /**
     * Omits `color` from serialized output.
     */
    public fun unsetColor() {
      colorState = FieldState.Absent
    }

    /**
     * Omits `created_at` from serialized output.
     */
    public fun unsetCreatedAt() {
      createdAtState = FieldState.Absent
    }

    /**
     * Omits `is_enabled` from serialized output.
     */
    public fun unsetIsEnabled() {
      isEnabledState = FieldState.Absent
    }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    public fun build(): IssueType {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return IssueType(
        description = descriptionState.valueOrNull(),
        id = id,
        name = name,
        nodeId = nodeId,
        colorState = colorState,
        createdAtState = createdAtState,
        isEnabledState = isEnabledState,
        updatedAtState = updatedAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueType = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssueType> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueType {
      val jsonDecoder = decoder.requireJsonDecoder("IssueType")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueType must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("IssueType is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return IssueType(
        description = description,
        id = id,
        name = name,
        nodeId = nodeId,
        colorState = json.decodeOptional(rawObject, "color", nullable = true),
        createdAtState = json.decodeOptional(rawObject, "created_at", nullable = false),
        isEnabledState = json.decodeOptional(rawObject, "is_enabled", nullable = false),
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueType) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueType")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        putState("color", value.colorState, json::encodeToJsonElement)
        putState("created_at", value.createdAtState, json::encodeToJsonElement)
        putState("is_enabled", value.isEnabledState, json::encodeToJsonElement)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueType(block: IssueType.Builder.() -> Unit): IssueType = IssueType.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueType is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("IssueType property '" + name + "' is not nullable")
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
