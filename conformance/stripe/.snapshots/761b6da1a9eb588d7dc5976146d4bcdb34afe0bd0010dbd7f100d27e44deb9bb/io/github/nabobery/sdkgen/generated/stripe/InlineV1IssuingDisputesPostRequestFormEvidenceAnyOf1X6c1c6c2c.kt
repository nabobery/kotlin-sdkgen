package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/no_valid_authorization/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/no_valid_authorization/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c(
  public val additionalDocumentation:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXb71289e4? = null,
  public val explanation:
      InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a? = null,
) {
  public class Builder {
    public var additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXb71289e4? = null

    public var explanation: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a? =
        null

    public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c(
      additionalDocumentation = additionalDocumentation,
      explanation = explanation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c(
        additionalDocumentation = rawObject["additional_documentation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXb71289e4>(it) },
        explanation = rawObject["explanation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXaa06dc4a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c(block: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1X6c1c6c2c.build(block)
