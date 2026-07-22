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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations~1{subject_digest}/get/responses/200/conten
 * t/application~1json/schema/properties/attestations/items/properties/bundle
 */
@Serializable(with = InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa.Serializer::class)
public class InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa(
  public val dsseEnvelope: JsonObject? = null,
  public val mediaType: String? = null,
  public val verificationMaterial: JsonObject? = null,
) {
  public class Builder {
    public var dsseEnvelope: JsonObject? = null

    public var mediaType: String? = null

    public var verificationMaterial: JsonObject? = null

    public fun build(): InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa = InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa(
      dsseEnvelope = dsseEnvelope,
      mediaType = mediaType,
      verificationMaterial = verificationMaterial,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa must be a JSON object")
      return InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa(
        dsseEnvelope = rawObject["dsseEnvelope"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mediaType = rawObject["mediaType"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMaterial = rawObject["verificationMaterial"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa")
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

public fun inlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa(block: InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa.Builder.() -> Unit): InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa = InlineReposAttestationsGetResponse200JsonAttestationsItemBundleXc6a5b4fa.build(block)
