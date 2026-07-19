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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MemberAssignment.
 */
@Serializable(with = MemberAssignment.Serializer::class)
public class MemberAssignment(
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
   * Organization ID
   */
  public val organizationId: String,
  /**
   * Clerk user ID of the assigned member
   */
  public val userId: String,
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

    private var organizationIdValue: String? = null

    public var organizationId: String
      get() = requireNotNull(organizationIdValue) { "organizationId is required" }
      set(`value`) {
        organizationIdValue = value
      }

    private var userIdValue: String? = null

    public var userId: String
      get() = requireNotNull(userIdValue) { "userId is required" }
      set(`value`) {
        userIdValue = value
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

    public fun build(): MemberAssignment {
      check(createdAtValue != null) { "createdAt is required" }
      check(guardrailIdValue != null) { "guardrailId is required" }
      check(idValue != null) { "id is required" }
      check(organizationIdValue != null) { "organizationId is required" }
      check(userIdValue != null) { "userId is required" }
      check(assignedByState !== FieldState.Absent) { "assignedBy is required, even when null" }
      return MemberAssignment(
        assignedBy = assignedByState.valueOrNull(),
        createdAt = createdAt,
        guardrailId = guardrailId,
        id = id,
        organizationId = organizationId,
        userId = userId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MemberAssignment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MemberAssignment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MemberAssignment {
      val jsonDecoder = decoder.requireJsonDecoder("MemberAssignment")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("MemberAssignment must be a JSON object")
      val createdAt = json.decodeRequired<String>(raw, "created_at")
      val guardrailId = json.decodeRequired<String>(raw, "guardrail_id")
      val id = json.decodeRequired<String>(raw, "id")
      val organizationId = json.decodeRequired<String>(raw, "organization_id")
      val userId = json.decodeRequired<String>(raw, "user_id")
      if (!raw.containsKey("assigned_by")) {
        throw SerializationException("MemberAssignment is missing required property 'assigned_by'")
      }
      val assignedBy = raw["assigned_by"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return MemberAssignment(
        assignedBy = assignedBy,
        createdAt = createdAt,
        guardrailId = guardrailId,
        id = id,
        organizationId = organizationId,
        userId = userId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MemberAssignment) {
      val jsonEncoder = encoder.requireJsonEncoder("MemberAssignment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assigned_by", value.assignedBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("guardrail_id", value.guardrailId)
        put("id", value.id)
        put("organization_id", value.organizationId)
        put("user_id", value.userId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun memberAssignment(block: MemberAssignment.Builder.() -> Unit): MemberAssignment = MemberAssignment
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MemberAssignment is missing required property '" + name +
    "'")
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
    if (!nullable) throw SerializationException("MemberAssignment property '" + name + "' is not nullable")
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
