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
 * The bundle of the attestation.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1bulk-list/post/responses/200/content/application~1js
 * on/schema/properties/attestations_subject_digests/additionalProperties/items/properties/bundle
 */
@Serializable(with = InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5.Serializer::class)
public class InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5(
  public val dsseEnvelope: JsonObject? = null,
  public val mediaType: String? = null,
  public val verificationMaterial: JsonObject? = null,
) {
  public class Builder {
    public var dsseEnvelope: JsonObject? = null

    public var mediaType: String? = null

    public var verificationMaterial: JsonObject? = null

    public fun build(): InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5 = InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5(
      dsseEnvelope = dsseEnvelope,
      mediaType = mediaType,
      verificationMaterial = verificationMaterial,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5 must be a JSON object")
      return InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5(
        dsseEnvelope = rawObject["dsseEnvelope"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mediaType = rawObject["mediaType"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMaterial = rawObject["verificationMaterial"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5")
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

public fun inlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5(block: InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5.Builder.() -> Unit): InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5 = InlineOrgsAttestationsBulkListPostResponse200JsonBundleXc72137d5.build(block)
