package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkAssignMembersResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BulkAssignMembersResponse
 */
@Serializable(with = BulkAssignMembersResponse.Serializer::class)
public class BulkAssignMembersResponse(
  /**
   * Number of members successfully assigned
   */
  public val assignedCount: Int,
) {
  public class Builder {
    private var assignedCountValue: Int? = null

    public var assignedCount: Int
      get() = requireNotNull(assignedCountValue) { "assignedCount is required" }
      set(`value`) {
        assignedCountValue = value
      }

    public fun build(): BulkAssignMembersResponse {
      check(assignedCountValue != null) { "assignedCount is required" }
      return BulkAssignMembersResponse(
        assignedCount = assignedCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkAssignMembersResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BulkAssignMembersResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkAssignMembersResponse {
      val jsonDecoder = decoder.requireJsonDecoder("BulkAssignMembersResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BulkAssignMembersResponse must be a JSON object")
      val assignedCount = json.decodeRequired<Int>(rawObject, "assigned_count")
      return BulkAssignMembersResponse(
        assignedCount = assignedCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkAssignMembersResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkAssignMembersResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assigned_count", json.encodeToJsonElement(value.assignedCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkAssignMembersResponse(block: BulkAssignMembersResponse.Builder.() -> Unit): BulkAssignMembersResponse = BulkAssignMembersResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkAssignMembersResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
