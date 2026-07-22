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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1bulk-list/post/responses/200/content/applicati
 * on~1json/schema/properties/attestations_subject_digests/additionalProperties/items/properties/bundle
 */
@Serializable(with = InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1.Serializer::class)
public class InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1(
  public val dsseEnvelope: JsonObject? = null,
  public val mediaType: String? = null,
  public val verificationMaterial: JsonObject? = null,
) {
  public class Builder {
    public var dsseEnvelope: JsonObject? = null

    public var mediaType: String? = null

    public var verificationMaterial: JsonObject? = null

    public fun build(): InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1 = InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1(
      dsseEnvelope = dsseEnvelope,
      mediaType = mediaType,
      verificationMaterial = verificationMaterial,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1 must be a JSON object")
      return InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1(
        dsseEnvelope = rawObject["dsseEnvelope"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mediaType = rawObject["mediaType"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMaterial = rawObject["verificationMaterial"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1")
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

public fun inlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1(block: InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1.Builder.() -> Unit): InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1 = InlineUsersAttestationsBul9240PostResponse200JsonBundleX61654fc1.build(block)
