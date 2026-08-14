package io.github.nabobery.sdkgen.generated.stripe

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

@Serializable
public data class IssuingCardholderVerificationView(
  public val document: InlineIssuingCardholderVerificationDocumentX8e3e3122? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_verification
 */
@Serializable(with = IssuingCardholderVerification.Serializer::class)
public class IssuingCardholderVerification(
  /**
   * An identifying document, either a passport or local ID card.
   */
  public val document: InlineIssuingCardholderVerificationDocumentX8e3e3122? = null,
) {
  public class Builder {
    /**
     * An identifying document, either a passport or local ID card.
     */
    public var document: InlineIssuingCardholderVerificationDocumentX8e3e3122? = null

    public fun build(): IssuingCardholderVerification = IssuingCardholderVerification(
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardholderVerification = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingCardholderVerification> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardholderVerification {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderVerification")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardholderVerification must be a JSON object")
      return IssuingCardholderVerification(
        document = rawObject["document"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderVerificationDocumentX8e3e3122?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardholderVerification) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderVerification")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardholderVerification(block: IssuingCardholderVerification.Builder.() -> Unit): IssuingCardholderVerification = IssuingCardholderVerification.build(block)
