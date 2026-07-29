package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Probability that this transaction can be disputed in the event of fraud. Assessed by comparing the characteristics of
 * the authorization to card network rules.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fraud_disputability_likelihood
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a.Serializer::class)
public sealed class InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `very_likely`.
   */
  public data object VeryLikely : InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a() {
    public override val `value`: String = "very_likely"
  }

  /**
   * Documented value. Wire value: `very_unlikely`.
   */
  public data object VeryUnlikely : InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a() {
    public override val `value`: String = "very_unlikely"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a = when (value) {
      Neutral.value -> Neutral
      Unknown.value -> Unknown
      VeryLikely.value -> VeryLikely
      VeryUnlikely.value -> VeryUnlikely
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a) {
      encoder.encodeString(value.value)
    }
  }
}
