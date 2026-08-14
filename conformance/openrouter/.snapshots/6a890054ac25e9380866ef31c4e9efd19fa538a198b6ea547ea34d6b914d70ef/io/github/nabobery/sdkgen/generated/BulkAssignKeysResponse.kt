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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkAssignKeysResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BulkAssignKeysResponse
 */
@Serializable(with = BulkAssignKeysResponse.Serializer::class)
public class BulkAssignKeysResponse(
  /**
   * Number of keys successfully assigned
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

    public fun build(): BulkAssignKeysResponse {
      check(assignedCountValue != null) { "assignedCount is required" }
      return BulkAssignKeysResponse(
        assignedCount = assignedCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkAssignKeysResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BulkAssignKeysResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkAssignKeysResponse {
      val jsonDecoder = decoder.requireJsonDecoder("BulkAssignKeysResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BulkAssignKeysResponse must be a JSON object")
      val assignedCount = json.decodeRequired<Int>(rawObject, "assigned_count")
      return BulkAssignKeysResponse(
        assignedCount = assignedCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkAssignKeysResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkAssignKeysResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assigned_count", json.encodeToJsonElement(value.assignedCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkAssignKeysResponse(block: BulkAssignKeysResponse.Builder.() -> Unit): BulkAssignKeysResponse = BulkAssignKeysResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkAssignKeysResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
