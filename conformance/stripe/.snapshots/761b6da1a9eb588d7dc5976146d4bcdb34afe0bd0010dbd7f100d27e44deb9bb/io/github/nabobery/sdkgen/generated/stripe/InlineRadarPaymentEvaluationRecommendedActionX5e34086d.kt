package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Recommended action based on the score of the `fraudulent_payment` signal. Possible values are `block`, `continue` and
 * `request_three_d_secure`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.payment_evaluation/properties/recommended_action
 */
@Serializable(with = InlineRadarPaymentEvaluationRecommendedActionX5e34086d.Serializer::class)
public sealed class InlineRadarPaymentEvaluationRecommendedActionX5e34086d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `block`.
   */
  public data object Block : InlineRadarPaymentEvaluationRecommendedActionX5e34086d() {
    public override val `value`: String = "block"
  }

  /**
   * Documented value. Wire value: `continue`.
   */
  public data object ContinueValue : InlineRadarPaymentEvaluationRecommendedActionX5e34086d() {
    public override val `value`: String = "continue"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRadarPaymentEvaluationRecommendedActionX5e34086d()

  public companion object {
    public fun fromValue(`value`: String): InlineRadarPaymentEvaluationRecommendedActionX5e34086d = when (value) {
      Block.value -> Block
      ContinueValue.value -> ContinueValue
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRadarPaymentEvaluationRecommendedActionX5e34086d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineRadarPaymentEvaluationRecommendedActionX5e34086d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRadarPaymentEvaluationRecommendedActionX5e34086d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRadarPaymentEvaluationRecommendedActionX5e34086d) {
      encoder.encodeString(value.value)
    }
  }
}
