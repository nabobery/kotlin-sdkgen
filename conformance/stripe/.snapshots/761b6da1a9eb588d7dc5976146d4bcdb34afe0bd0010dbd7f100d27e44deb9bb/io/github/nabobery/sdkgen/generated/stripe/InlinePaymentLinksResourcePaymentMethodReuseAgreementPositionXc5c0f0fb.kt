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
 * Determines the position and visibility of the payment method reuse agreement in the UI. When set to `auto`, Stripe's
 * defaults will be used.
 *
 * When set to `hidden`, the payment method reuse agreement text will always be hidden in the UI.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_payment_method_reuse_agreement/properties/pos
 * ition
 */
@Serializable(with = InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb.Serializer::class)
public sealed class InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `hidden`.
   */
  public data object Hidden : InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb() {
    public override val `value`: String = "hidden"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb = when (value) {
      Auto.value -> Auto
      Hidden.value -> Hidden
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb) {
      encoder.encodeString(value.value)
    }
  }
}
