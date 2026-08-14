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
 * Indicates when the funds will be captured from the customer's account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_payment_intent_data/properties/capture_method
 */
@Serializable(with = InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d.Serializer::class)
public sealed class InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `automatic_async`.
   */
  public data object AutomaticAsync : InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d() {
    public override val `value`: String = "automatic_async"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d = when (value) {
      Automatic.value -> Automatic
      AutomaticAsync.value -> AutomaticAsync
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d) {
      encoder.encodeString(value.value)
    }
  }
}
