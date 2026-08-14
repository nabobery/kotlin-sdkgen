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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/default
 * _for/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/default
 * _for/items
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice`.
   */
  public data object Invoice : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa() {
    public override val `value`: String = "invoice"
  }

  /**
   * Documented value. Wire value: `subscription`.
   */
  public data object Subscription : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa() {
    public override val `value`: String = "subscription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa = when (value) {
      Invoice.value -> Invoice
      Subscription.value -> Subscription
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa) {
      encoder.encodeString(value.value)
    }
  }
}
