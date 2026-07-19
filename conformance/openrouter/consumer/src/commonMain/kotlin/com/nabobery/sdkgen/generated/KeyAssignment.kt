package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/KeyAssignment.
 */
@Serializable(with = KeyAssignment.Serializer::class)
public class KeyAssignment(
  /**
   * User ID of who made the assignment
   */
  public val assignedBy: String?,
  /**
   * ISO 8601 timestamp of when the assignment was created
   */
  public val createdAt: String,
  /**
   * ID of the guardrail
   */
  public val guardrailId: String,
  /**
   * Unique identifier for the assignment
   */
  public val id: String,
  /**
   * Hash of the assigned API key
   */
  public val keyHash: String,
  /**
   * Label of the API key
   */
  public val keyLabel: String,
  /**
   * Name of the API key
   */
  public val keyName: String,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var guardrailIdValue: String? = null

    public var guardrailId: String
      get() = requireNotNull(guardrailIdValue) { "guardrailId is required" }
      set(`value`) {
        guardrailIdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var keyHashValue: String? = null

    public var keyHash: String
      get() = requireNotNull(keyHashValue) { "keyHash is required" }
      set(`value`) {
        keyHashValue = value
      }

    private var keyLabelValue: String? = null

    public var keyLabel: String
      get() = requireNotNull(keyLabelValue) { "keyLabel is required" }
      set(`value`) {
        keyLabelValue = value
      }

    private var keyNameValue: String? = null

    public var keyName: String
      get() = requireNotNull(keyNameValue) { "keyName is required" }
      set(`value`) {
        keyNameValue = value
      }

    private var assignedByState: FieldState<String?> = FieldState.Absent

    /**
     * User ID of who made the assignment
     * Required nullable field; assigning `null` records present-null.
     */
    public var assignedBy: String?
      get() = assignedByState.valueOrNull()
      set(`value`) {
        assignedByState = value.toNullableFieldState()
      }

    public fun build(): KeyAssignment {
      check(createdAtValue != null) { "createdAt is required" }
      check(guardrailIdValue != null) { "guardrailId is required" }
      check(idValue != null) { "id is required" }
      check(keyHashValue != null) { "keyHash is required" }
      check(keyLabelValue != null) { "keyLabel is required" }
      check(keyNameValue != null) { "keyName is required" }
      check(assignedByState !== FieldState.Absent) { "assignedBy is required, even when null" }
      return KeyAssignment(
        assignedBy = assignedByState.valueOrNull(),
        createdAt = createdAt,
        guardrailId = guardrailId,
        id = id,
        keyHash = keyHash,
        keyLabel = keyLabel,
        keyName = keyName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): KeyAssignment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<KeyAssignment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): KeyAssignment {
      val jsonDecoder = decoder.requireJsonDecoder("KeyAssignment")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("KeyAssignment must be a JSON object")
      val createdAt = json.decodeRequired<String>(raw, "created_at")
      val guardrailId = json.decodeRequired<String>(raw, "guardrail_id")
      val id = json.decodeRequired<String>(raw, "id")
      val keyHash = json.decodeRequired<String>(raw, "key_hash")
      val keyLabel = json.decodeRequired<String>(raw, "key_label")
      val keyName = json.decodeRequired<String>(raw, "key_name")
      if (!raw.containsKey("assigned_by")) {
        throw SerializationException("KeyAssignment is missing required property 'assigned_by'")
      }
      val assignedBy = raw["assigned_by"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return KeyAssignment(
        assignedBy = assignedBy,
        createdAt = createdAt,
        guardrailId = guardrailId,
        id = id,
        keyHash = keyHash,
        keyLabel = keyLabel,
        keyName = keyName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: KeyAssignment) {
      val jsonEncoder = encoder.requireJsonEncoder("KeyAssignment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assigned_by", value.assignedBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("guardrail_id", value.guardrailId)
        put("id", value.id)
        put("key_hash", value.keyHash)
        put("key_label", value.keyLabel)
        put("key_name", value.keyName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun keyAssignment(block: KeyAssignment.Builder.() -> Unit): KeyAssignment = KeyAssignment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("KeyAssignment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("KeyAssignment property '" + name + "' is not nullable")
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
