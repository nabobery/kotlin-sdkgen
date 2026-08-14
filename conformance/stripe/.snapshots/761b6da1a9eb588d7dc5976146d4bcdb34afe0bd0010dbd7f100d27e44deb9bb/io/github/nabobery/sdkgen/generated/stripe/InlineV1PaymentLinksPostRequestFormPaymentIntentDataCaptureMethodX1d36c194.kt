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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_intent_data/properties/capture_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_intent_data/properties/capture_method
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `automatic_async`.
   */
  public data object AutomaticAsync : InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194() {
    public override val `value`: String = "automatic_async"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194 = when (value) {
      Automatic.value -> Automatic
      AutomaticAsync.value -> AutomaticAsync
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194) {
      encoder.encodeString(value.value)
    }
  }
}
