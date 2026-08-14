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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/exem
 * ption_indicator.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/exem
 * ption_indicator
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low_risk`.
   */
  public data object LowRisk : InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819() {
    public override val `value`: String = "low_risk"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819 = when (value) {
      LowRisk.value -> LowRisk
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormExemptionIndicatorX1f8a7819) {
      encoder.encodeString(value.value)
    }
  }
}
