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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/api-overview/properties/ssh_key_fingerprints.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/api-overview/properties/ssh_key_fingerprints
 */
@Serializable(with = InlineApiOverviewSshKeyFingerprintsXef6779a2.Serializer::class)
public class InlineApiOverviewSshKeyFingerprintsXef6779a2(
  public val sha256Dsa: String? = null,
  public val sha256Ecdsa: String? = null,
  public val sha256Ed25519: String? = null,
  public val sha256Rsa: String? = null,
) {
  public class Builder {
    public var sha256Dsa: String? = null

    public var sha256Ecdsa: String? = null

    public var sha256Ed25519: String? = null

    public var sha256Rsa: String? = null

    public fun build(): InlineApiOverviewSshKeyFingerprintsXef6779a2 = InlineApiOverviewSshKeyFingerprintsXef6779a2(
      sha256Dsa = sha256Dsa,
      sha256Ecdsa = sha256Ecdsa,
      sha256Ed25519 = sha256Ed25519,
      sha256Rsa = sha256Rsa,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApiOverviewSshKeyFingerprintsXef6779a2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineApiOverviewSshKeyFingerprintsXef6779a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApiOverviewSshKeyFingerprintsXef6779a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApiOverviewSshKeyFingerprintsXef6779a2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApiOverviewSshKeyFingerprintsXef6779a2 must be a JSON object")
      return InlineApiOverviewSshKeyFingerprintsXef6779a2(
        sha256Dsa = rawObject["SHA256_DSA"]?.let { json.decodeFromJsonElement<String>(it) },
        sha256Ecdsa = rawObject["SHA256_ECDSA"]?.let { json.decodeFromJsonElement<String>(it) },
        sha256Ed25519 = rawObject["SHA256_ED25519"]?.let { json.decodeFromJsonElement<String>(it) },
        sha256Rsa = rawObject["SHA256_RSA"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApiOverviewSshKeyFingerprintsXef6779a2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApiOverviewSshKeyFingerprintsXef6779a2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.sha256Dsa?.let { put("SHA256_DSA", it) }
        value.sha256Ecdsa?.let { put("SHA256_ECDSA", it) }
        value.sha256Ed25519?.let { put("SHA256_ED25519", it) }
        value.sha256Rsa?.let { put("SHA256_RSA", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApiOverviewSshKeyFingerprintsXef6779a2(block: InlineApiOverviewSshKeyFingerprintsXef6779a2.Builder.() -> Unit): InlineApiOverviewSshKeyFingerprintsXef6779a2 = InlineApiOverviewSshKeyFingerprintsXef6779a2.build(block)
