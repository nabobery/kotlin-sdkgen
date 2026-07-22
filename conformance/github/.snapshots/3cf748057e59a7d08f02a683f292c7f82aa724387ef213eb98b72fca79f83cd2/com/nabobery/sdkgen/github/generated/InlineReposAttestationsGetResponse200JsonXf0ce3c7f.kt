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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations~1{subject_digest}/get/responses/200/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations~1{subject_digest}/get/responses/200/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineReposAttestationsGetResponse200JsonXf0ce3c7f.Serializer::class)
public class InlineReposAttestationsGetResponse200JsonXf0ce3c7f(
  public val attestations:
      List<InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005>? = null,
) {
  public class Builder {
    public var attestations:
        List<InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005>? = null

    public fun build(): InlineReposAttestationsGetResponse200JsonXf0ce3c7f = InlineReposAttestationsGetResponse200JsonXf0ce3c7f(
      attestations = attestations,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAttestationsGetResponse200JsonXf0ce3c7f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposAttestationsGetResponse200JsonXf0ce3c7f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAttestationsGetResponse200JsonXf0ce3c7f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAttestationsGetResponse200JsonXf0ce3c7f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAttestationsGetResponse200JsonXf0ce3c7f must be a JSON object")
      return InlineReposAttestationsGetResponse200JsonXf0ce3c7f(
        attestations = rawObject["attestations"]?.let { json.decodeFromJsonElement<List<InlineReposAttestationsGetResponse200JsonAttestationsItemXa23de005>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAttestationsGetResponse200JsonXf0ce3c7f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAttestationsGetResponse200JsonXf0ce3c7f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.attestations?.let { put("attestations", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAttestationsGetResponse200JsonXf0ce3c7f(block: InlineReposAttestationsGetResponse200JsonXf0ce3c7f.Builder.() -> Unit): InlineReposAttestationsGetResponse200JsonXf0ce3c7f = InlineReposAttestationsGetResponse200JsonXf0ce3c7f.build(block)
