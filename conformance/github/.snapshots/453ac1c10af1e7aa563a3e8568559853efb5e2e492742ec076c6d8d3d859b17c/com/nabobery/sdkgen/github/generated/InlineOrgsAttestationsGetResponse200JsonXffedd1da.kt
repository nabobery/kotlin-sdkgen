package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1{subject_digest}/get/responses/200/content/applicati
 * on~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1{subject_digest}/get/responses/200/content/applicati
 * on~1json/schema
 */
@Serializable(with = InlineOrgsAttestationsGetResponse200JsonXffedd1da.Serializer::class)
public class InlineOrgsAttestationsGetResponse200JsonXffedd1da(
  attestations: List<InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1>? = null,
) {
  public val attestations: List<InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1>?
      = attestations?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var attestationsValue:
        List<InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1>? = null

    public var attestations:
        List<InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1>?
      get() = attestationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        attestationsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsAttestationsGetResponse200JsonXffedd1da = InlineOrgsAttestationsGetResponse200JsonXffedd1da(
      attestations = attestations,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsGetResponse200JsonXffedd1da = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsAttestationsGetResponse200JsonXffedd1da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsGetResponse200JsonXffedd1da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsGetResponse200JsonXffedd1da")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsGetResponse200JsonXffedd1da must be a JSON object")
      return InlineOrgsAttestationsGetResponse200JsonXffedd1da(
        attestations = rawObject["attestations"]?.let { json.decodeFromJsonElement<List<InlineOrgsAttestationsGetResponse200JsonAttestationsItemX7475a7a1>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsGetResponse200JsonXffedd1da) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsGetResponse200JsonXffedd1da")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.attestations?.let { put("attestations", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAttestationsGetResponse200JsonXffedd1da(block: InlineOrgsAttestationsGetResponse200JsonXffedd1da.Builder.() -> Unit): InlineOrgsAttestationsGetResponse200JsonXffedd1da = InlineOrgsAttestationsGetResponse200JsonXffedd1da.build(block)
