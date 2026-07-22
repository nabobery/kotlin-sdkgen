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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1{subject_digest}/get/responses/200/content/app
 * lication~1json/schema/properties/attestations/items/properties/bundle
 */
@Serializable(with = InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299.Serializer::class)
public class InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299(
  public val dsseEnvelope: JsonObject? = null,
  public val mediaType: String? = null,
  public val verificationMaterial: JsonObject? = null,
) {
  public class Builder {
    public var dsseEnvelope: JsonObject? = null

    public var mediaType: String? = null

    public var verificationMaterial: JsonObject? = null

    public fun build(): InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299 = InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299(
      dsseEnvelope = dsseEnvelope,
      mediaType = mediaType,
      verificationMaterial = verificationMaterial,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299 must be a JSON object")
      return InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299(
        dsseEnvelope = rawObject["dsseEnvelope"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mediaType = rawObject["mediaType"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMaterial = rawObject["verificationMaterial"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299")
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

public fun inlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299(block: InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299.Builder.() -> Unit): InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299 = InlineUsersAttestationsGetResponse200JsonAttestationsItemBundleXcfc30299.build(block)
