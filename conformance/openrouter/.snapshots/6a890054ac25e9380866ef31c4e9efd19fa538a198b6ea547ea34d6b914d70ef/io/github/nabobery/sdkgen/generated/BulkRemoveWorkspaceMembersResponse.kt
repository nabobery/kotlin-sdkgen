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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkRemoveWorkspaceMembersResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BulkRemoveWorkspaceMembersResponse
 */
@Serializable(with = BulkRemoveWorkspaceMembersResponse.Serializer::class)
public class BulkRemoveWorkspaceMembersResponse(
  /**
   * Number of members removed
   */
  public val removedCount: Int,
) {
  public class Builder {
    private var removedCountValue: Int? = null

    public var removedCount: Int
      get() = requireNotNull(removedCountValue) { "removedCount is required" }
      set(`value`) {
        removedCountValue = value
      }

    public fun build(): BulkRemoveWorkspaceMembersResponse {
      check(removedCountValue != null) { "removedCount is required" }
      return BulkRemoveWorkspaceMembersResponse(
        removedCount = removedCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkRemoveWorkspaceMembersResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BulkRemoveWorkspaceMembersResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkRemoveWorkspaceMembersResponse {
      val jsonDecoder = decoder.requireJsonDecoder("BulkRemoveWorkspaceMembersResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BulkRemoveWorkspaceMembersResponse must be a JSON object")
      val removedCount = json.decodeRequired<Int>(rawObject, "removed_count")
      return BulkRemoveWorkspaceMembersResponse(
        removedCount = removedCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkRemoveWorkspaceMembersResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkRemoveWorkspaceMembersResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("removed_count", json.encodeToJsonElement(value.removedCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkRemoveWorkspaceMembersResponse(block: BulkRemoveWorkspaceMembersResponse.Builder.() -> Unit): BulkRemoveWorkspaceMembersResponse = BulkRemoveWorkspaceMembersResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkRemoveWorkspaceMembersResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
