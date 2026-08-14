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
 * Enable customers to choose if they wish to remove their saved payment methods. Disabled by default.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_saved_payment_method_options/properti
 * es/payment_method_remove
 */
@Serializable(with = InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78.Serializer::class)
public sealed class InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78 = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78) {
      encoder.encodeString(value.value)
    }
  }
}
