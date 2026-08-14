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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.payment_evaluation/properties/object
 */
@Serializable(with = InlineRadarPaymentEvaluationObjectValueX24d66021.Serializer::class)
public sealed class InlineRadarPaymentEvaluationObjectValueX24d66021 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `radar.payment_evaluation`.
   */
  public data object RadarPaymentEvaluation : InlineRadarPaymentEvaluationObjectValueX24d66021() {
    public override val `value`: String = "radar.payment_evaluation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRadarPaymentEvaluationObjectValueX24d66021()

  public companion object {
    public fun fromValue(`value`: String): InlineRadarPaymentEvaluationObjectValueX24d66021 = when (value) {
      RadarPaymentEvaluation.value -> RadarPaymentEvaluation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRadarPaymentEvaluationObjectValueX24d66021> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineRadarPaymentEvaluationObjectValueX24d66021", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRadarPaymentEvaluationObjectValueX24d66021 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRadarPaymentEvaluationObjectValueX24d66021) {
      encoder.encodeString(value.value)
    }
  }
}
