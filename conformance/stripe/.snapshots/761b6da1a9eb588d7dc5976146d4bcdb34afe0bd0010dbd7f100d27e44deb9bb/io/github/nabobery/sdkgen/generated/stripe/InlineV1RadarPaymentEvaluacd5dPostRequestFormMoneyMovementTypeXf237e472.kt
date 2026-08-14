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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details/properties/money_movement_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details/properties/money_movement_type
 */
@Serializable(with = InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472.Serializer::class)
public sealed class InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472()

  public companion object {
    public fun fromValue(`value`: String): InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarPaymentEvaluacd5dPostRequestFormMoneyMovementTypeXf237e472) {
      encoder.encodeString(value.value)
    }
  }
}
