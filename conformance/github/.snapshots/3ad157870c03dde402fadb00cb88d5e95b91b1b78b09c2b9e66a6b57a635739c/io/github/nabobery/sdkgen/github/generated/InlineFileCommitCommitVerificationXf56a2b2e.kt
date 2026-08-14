package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/verification.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/verification
 */
@Serializable(with = InlineFileCommitCommitVerificationXf56a2b2e.Serializer::class)
public class InlineFileCommitCommitVerificationXf56a2b2e(
  public val payload: String? = null,
  public val reason: String? = null,
  public val signature: String? = null,
  public val verified: Boolean? = null,
  public val verifiedAt: String? = null,
) {
  public class Builder {
    public var payload: String? = null

    public var reason: String? = null

    public var signature: String? = null

    public var verified: Boolean? = null

    public var verifiedAt: String? = null

    public fun build(): InlineFileCommitCommitVerificationXf56a2b2e = InlineFileCommitCommitVerificationXf56a2b2e(
      payload = payload,
      reason = reason,
      signature = signature,
      verified = verified,
      verifiedAt = verifiedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileCommitCommitVerificationXf56a2b2e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFileCommitCommitVerificationXf56a2b2e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileCommitCommitVerificationXf56a2b2e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileCommitCommitVerificationXf56a2b2e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileCommitCommitVerificationXf56a2b2e must be a JSON object")
      return InlineFileCommitCommitVerificationXf56a2b2e(
        payload = rawObject["payload"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<String>(it) },
        signature = rawObject["signature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        verified = rawObject["verified"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        verifiedAt = rawObject["verified_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileCommitCommitVerificationXf56a2b2e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileCommitCommitVerificationXf56a2b2e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.payload?.let { put("payload", it) }
        value.reason?.let { put("reason", it) }
        value.signature?.let { put("signature", it) }
        value.verified?.let { put("verified", json.encodeToJsonElement(it)) }
        value.verifiedAt?.let { put("verified_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFileCommitCommitVerificationXf56a2b2e(block: InlineFileCommitCommitVerificationXf56a2b2e.Builder.() -> Unit): InlineFileCommitCommitVerificationXf56a2b2e = InlineFileCommitCommitVerificationXf56a2b2e.build(block)
