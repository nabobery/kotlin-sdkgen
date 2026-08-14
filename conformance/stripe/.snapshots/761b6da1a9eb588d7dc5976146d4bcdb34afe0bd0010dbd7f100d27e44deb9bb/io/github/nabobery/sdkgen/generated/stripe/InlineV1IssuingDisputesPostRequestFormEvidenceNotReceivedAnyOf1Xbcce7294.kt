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
 * ed/schema/properties/evidence/properties/not_received/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294(
  public val additionalDocumentation:
      InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0? = null,
  public val expectedAt:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df? = null,
  public val explanation:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX1f647925? = null,
  public val productDescription:
      InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb? = null,
  public val productType:
      InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3? = null,
) {
  public class Builder {
    public var additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0? = null

    public var expectedAt:
        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df? = null

    public var explanation:
        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX1f647925? = null

    public var productDescription:
        InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb? = null

    public var productType:
        InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3? = null

    public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294 = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294(
      additionalDocumentation = additionalDocumentation,
      expectedAt = expectedAt,
      explanation = explanation,
      productDescription = productDescription,
      productType = productType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294 must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294(
        additionalDocumentation = rawObject["additional_documentation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX366688d0>(it) },
        expectedAt = rawObject["expected_at"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExpectedAtXf0c083df>(it) },
        explanation = rawObject["explanation"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedExplanationX1f647925>(it) },
        productDescription = rawObject["product_description"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceProductDescriptionX7389d5bb>(it) },
        productType = rawObject["product_type"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
        value.expectedAt?.let { put("expected_at", json.encodeToJsonElement(it)) }
        value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
        value.productDescription?.let { put("product_description", json.encodeToJsonElement(it)) }
        value.productType?.let { put("product_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294(block: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294 = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedAnyOf1Xbcce7294.build(block)
