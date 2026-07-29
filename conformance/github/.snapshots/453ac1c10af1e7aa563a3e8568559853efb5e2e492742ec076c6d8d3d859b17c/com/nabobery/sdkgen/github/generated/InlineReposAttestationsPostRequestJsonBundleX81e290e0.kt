package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
 * The attestation's Sigstore Bundle.
 * Refer to the [Sigstore Bundle
 * Specification](https://github.com/sigstore/protobuf-specs/blob/main/protos/sigstore_bundle.proto) for more
 * information.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations/post/requestBody/content/application~1json
 * /schema/properties/bundle
 */
@Serializable(with = InlineReposAttestationsPostRequestJsonBundleX81e290e0.Serializer::class)
public class InlineReposAttestationsPostRequestJsonBundleX81e290e0(
  public val dsseEnvelope: JsonObject? = null,
  public val mediaType: String? = null,
  public val verificationMaterial: JsonObject? = null,
) {
  public class Builder {
    public var dsseEnvelope: JsonObject? = null

    public var mediaType: String? = null

    public var verificationMaterial: JsonObject? = null

    public fun build(): InlineReposAttestationsPostRequestJsonBundleX81e290e0 = InlineReposAttestationsPostRequestJsonBundleX81e290e0(
      dsseEnvelope = dsseEnvelope,
      mediaType = mediaType,
      verificationMaterial = verificationMaterial,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAttestationsPostRequestJsonBundleX81e290e0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposAttestationsPostRequestJsonBundleX81e290e0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAttestationsPostRequestJsonBundleX81e290e0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAttestationsPostRequestJsonBundleX81e290e0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAttestationsPostRequestJsonBundleX81e290e0 must be a JSON object")
      return InlineReposAttestationsPostRequestJsonBundleX81e290e0(
        dsseEnvelope = rawObject["dsseEnvelope"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mediaType = rawObject["mediaType"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMaterial = rawObject["verificationMaterial"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAttestationsPostRequestJsonBundleX81e290e0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAttestationsPostRequestJsonBundleX81e290e0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.dsseEnvelope?.let { put("dsseEnvelope", json.encodeToJsonElement(it)) }
        value.mediaType?.let { put("mediaType", it) }
        value.verificationMaterial?.let { put("verificationMaterial", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAttestationsPostRequestJsonBundleX81e290e0(block: InlineReposAttestationsPostRequestJsonBundleX81e290e0.Builder.() -> Unit): InlineReposAttestationsPostRequestJsonBundleX81e290e0 = InlineReposAttestationsPostRequestJsonBundleX81e290e0.build(block)
