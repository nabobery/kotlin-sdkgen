package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1{subject_digest}/get/responses/200/content/applicati
 * on~1json/schema/properties/attestations/items/properties/bundle
 */
@Serializable(with = InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625.Serializer::class)
public class InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625(
  public val dsseEnvelope: JsonObject? = null,
  public val mediaType: String? = null,
  public val verificationMaterial: JsonObject? = null,
) {
  public class Builder {
    public var dsseEnvelope: JsonObject? = null

    public var mediaType: String? = null

    public var verificationMaterial: JsonObject? = null

    public fun build(): InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625 = InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625(
      dsseEnvelope = dsseEnvelope,
      mediaType = mediaType,
      verificationMaterial = verificationMaterial,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625 must be a JSON object")
      return InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625(
        dsseEnvelope = rawObject["dsseEnvelope"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mediaType = rawObject["mediaType"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMaterial = rawObject["verificationMaterial"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625")
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

public fun inlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625(block: InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625.Builder.() -> Unit): InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625 = InlineOrgsAttestationsGetResponse200JsonAttestationsItemBundleX2af5d625.build(block)
