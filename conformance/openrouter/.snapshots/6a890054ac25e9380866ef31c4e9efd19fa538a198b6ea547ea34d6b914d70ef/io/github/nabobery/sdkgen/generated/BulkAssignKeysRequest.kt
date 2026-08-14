package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkAssignKeysRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BulkAssignKeysRequest
 */
@Serializable(with = BulkAssignKeysRequest.Serializer::class)
public class BulkAssignKeysRequest(
  keyHashes: List<String>,
) {
  /**
   * Array of API key hashes to assign to the guardrail
   */
  public val keyHashes: List<String> = keyHashes.toList()

  public class Builder {
    private var keyHashesValue: List<String>? = null

    public var keyHashes: List<String>
      get() = requireNotNull(keyHashesValue) { "keyHashes is required" }.toList()
      set(`value`) {
        keyHashesValue = value.toList()
      }

    public fun build(): BulkAssignKeysRequest {
      check(keyHashesValue != null) { "keyHashes is required" }
      return BulkAssignKeysRequest(
        keyHashes = keyHashes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkAssignKeysRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BulkAssignKeysRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkAssignKeysRequest {
      val jsonDecoder = decoder.requireJsonDecoder("BulkAssignKeysRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BulkAssignKeysRequest must be a JSON object")
      val keyHashes = json.decodeRequired<List<String>>(rawObject, "key_hashes")
      return BulkAssignKeysRequest(
        keyHashes = keyHashes,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkAssignKeysRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkAssignKeysRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key_hashes", json.encodeToJsonElement(value.keyHashes))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkAssignKeysRequest(block: BulkAssignKeysRequest.Builder.() -> Unit): BulkAssignKeysRequest = BulkAssignKeysRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkAssignKeysRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
