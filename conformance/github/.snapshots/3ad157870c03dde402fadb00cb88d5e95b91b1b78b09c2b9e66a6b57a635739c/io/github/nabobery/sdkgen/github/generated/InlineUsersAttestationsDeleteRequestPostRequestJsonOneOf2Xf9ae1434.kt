package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1delete-request/post/requestBody/content/applic
 * ation~1json/schema/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1delete-request/post/requestBody/content/applic
 * ation~1json/schema/oneOf/1
 */
@Serializable(with = InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434.Serializer::class)
public class InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434(
  attestationIds: List<Int>,
) {
  /**
   * List of unique IDs associated with the artifact attestations to delete.
   */
  public val attestationIds: List<Int> = attestationIds.toList()

  public class Builder {
    private var attestationIdsValue: List<Int>? = null

    public var attestationIds: List<Int>
      get() = requireNotNull(attestationIdsValue) { "attestationIds is required" }.toList()
      set(`value`) {
        attestationIdsValue = value.toList()
      }

    public fun build(): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434 {
      check(attestationIdsValue != null) { "attestationIds is required" }
      return InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434(
        attestationIds = attestationIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434 must be a JSON object")
      val attestationIds = json.decodeRequired<List<Int>>(rawObject, "attestation_ids")
      return InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434(
        attestationIds = attestationIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("attestation_ids", json.encodeToJsonElement(value.attestationIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434(block: InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434.Builder.() -> Unit): InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434 = InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersAttestationsDeleteRequestPostRequestJsonOneOf2Xf9ae1434 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
