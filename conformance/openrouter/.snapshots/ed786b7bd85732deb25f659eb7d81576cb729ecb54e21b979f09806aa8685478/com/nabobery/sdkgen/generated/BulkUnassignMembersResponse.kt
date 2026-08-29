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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkUnassignMembersResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BulkUnassignMembersResponse
 */
@Serializable(with = BulkUnassignMembersResponse.Serializer::class)
public class BulkUnassignMembersResponse(
  /**
   * Number of members successfully unassigned
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

    public fun build(): BulkUnassignMembersResponse {
      check(unassignedCountValue != null) { "unassignedCount is required" }
      return BulkUnassignMembersResponse(
        unassignedCount = unassignedCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkUnassignMembersResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BulkUnassignMembersResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkUnassignMembersResponse {
      val jsonDecoder = decoder.requireJsonDecoder("BulkUnassignMembersResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BulkUnassignMembersResponse must be a JSON object")
      val unassignedCount = json.decodeRequired<Int>(rawObject, "unassigned_count")
      return BulkUnassignMembersResponse(
        unassignedCount = unassignedCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkUnassignMembersResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkUnassignMembersResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("unassigned_count", json.encodeToJsonElement(value.unassignedCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkUnassignMembersResponse(block: BulkUnassignMembersResponse.Builder.() -> Unit): BulkUnassignMembersResponse = BulkUnassignMembersResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkUnassignMembersResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
