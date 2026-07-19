package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkUnassignKeysResponse.
 */
@Serializable(with = BulkUnassignKeysResponse.Serializer::class)
public class BulkUnassignKeysResponse(
  /**
   * Number of keys successfully unassigned
   */
  public val unassignedCount: Int,
) {
  public class Builder {
    private var unassignedCountValue: Int? = null

    public var unassignedCount: Int
      get() = requireNotNull(unassignedCountValue) { "unassignedCount is required" }
      set(`value`) {
        unassignedCountValue = value
      }

    public fun build(): BulkUnassignKeysResponse {
      check(unassignedCountValue != null) { "unassignedCount is required" }
      return BulkUnassignKeysResponse(
        unassignedCount = unassignedCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkUnassignKeysResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BulkUnassignKeysResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkUnassignKeysResponse {
      val jsonDecoder = decoder.requireJsonDecoder("BulkUnassignKeysResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("BulkUnassignKeysResponse must be a JSON object")
      val unassignedCount = json.decodeRequired<Int>(raw, "unassigned_count")
      return BulkUnassignKeysResponse(
        unassignedCount = unassignedCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkUnassignKeysResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkUnassignKeysResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("unassigned_count", json.encodeToJsonElement(value.unassignedCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkUnassignKeysResponse(block: BulkUnassignKeysResponse.Builder.() -> Unit): BulkUnassignKeysResponse =
  BulkUnassignKeysResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkUnassignKeysResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
