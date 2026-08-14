package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass_op
 * tions/properties/reviewers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass_op
 * tions/properties/reviewers/items
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8.Serializer::class)
public class InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8(
  /**
   * The ID of the team or role selected as a bypass reviewer
   */
  public val reviewerId: Int,
  /**
   * The type of the bypass reviewer
   */
  public val reviewerType:
      InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b,
  /**
   * The bypass mode for the reviewer
   */
  public val mode:
      InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5? = null,
) {
  public class Builder {
    private var reviewerIdValue: Int? = null

    public var reviewerId: Int
      get() = requireNotNull(reviewerIdValue) { "reviewerId is required" }
      set(`value`) {
        reviewerIdValue = value
      }

    private var reviewerTypeValue:
        InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b? = null

    public var reviewerType:
        InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b
      get() = requireNotNull(reviewerTypeValue) { "reviewerType is required" }
      set(`value`) {
        reviewerTypeValue = value
      }

    /**
     * The bypass mode for the reviewer
     */
    public var mode: InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5? =
        null

    public fun build(): InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8 {
      check(reviewerIdValue != null) { "reviewerId is required" }
      check(reviewerTypeValue != null) { "reviewerType is required" }
      return InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        mode = mode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8 must be a JSON object")
      val reviewerId = json.decodeRequired<Int>(rawObject, "reviewer_id")
      val reviewerType = json.decodeRequired<InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b>(rawObject, "reviewer_type")
      return InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        mode = rawObject["mode"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reviewer_id", json.encodeToJsonElement(value.reviewerId))
        put("reviewer_type", json.encodeToJsonElement(value.reviewerType))
        value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8(block: InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8.Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8 = InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
