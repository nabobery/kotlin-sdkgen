package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1delete-request/post/requestBody/content/application~
 * 1json/schema/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1delete-request/post/requestBody/content/application~
 * 1json/schema/oneOf/1
 */
@Serializable(with = InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362.Serializer::class)
public class InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362(
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

    public fun build(): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362 {
      check(attestationIdsValue != null) { "attestationIds is required" }
      return InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362(
        attestationIds = attestationIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362 must be a JSON object")
      val attestationIds = json.decodeRequired<List<Int>>(rawObject, "attestation_ids")
      return InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362(
        attestationIds = attestationIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("attestation_ids", json.encodeToJsonElement(value.attestationIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362(block: InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362.Builder.() -> Unit): InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362 = InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsAttestationsDeleteRequestPostRequestJsonOneOf2X1aa70362 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
