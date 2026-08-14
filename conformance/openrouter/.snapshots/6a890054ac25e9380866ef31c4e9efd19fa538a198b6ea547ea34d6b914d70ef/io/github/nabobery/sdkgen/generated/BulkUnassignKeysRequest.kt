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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkUnassignKeysRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BulkUnassignKeysRequest
 */
@Serializable(with = BulkUnassignKeysRequest.Serializer::class)
public class BulkUnassignKeysRequest(
  keyHashes: List<String>,
) {
  /**
   * Array of API key hashes to unassign from the guardrail
   */
  public val keyHashes: List<String> = keyHashes.toList()

  public class Builder {
    private var keyHashesValue: List<String>? = null

    public var keyHashes: List<String>
      get() = requireNotNull(keyHashesValue) { "keyHashes is required" }.toList()
      set(`value`) {
        keyHashesValue = value.toList()
      }

    public fun build(): BulkUnassignKeysRequest {
      check(keyHashesValue != null) { "keyHashes is required" }
      return BulkUnassignKeysRequest(
        keyHashes = keyHashes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkUnassignKeysRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BulkUnassignKeysRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkUnassignKeysRequest {
      val jsonDecoder = decoder.requireJsonDecoder("BulkUnassignKeysRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BulkUnassignKeysRequest must be a JSON object")
      val keyHashes = json.decodeRequired<List<String>>(rawObject, "key_hashes")
      return BulkUnassignKeysRequest(
        keyHashes = keyHashes,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkUnassignKeysRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkUnassignKeysRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key_hashes", json.encodeToJsonElement(value.keyHashes))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkUnassignKeysRequest(block: BulkUnassignKeysRequest.Builder.() -> Unit): BulkUnassignKeysRequest = BulkUnassignKeysRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkUnassignKeysRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
