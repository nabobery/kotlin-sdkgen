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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/default_for/items
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/default_for/items
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice`.
   */
  public data object Invoice : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4() {
    public override val `value`: String = "invoice"
  }

  /**
   * Documented value. Wire value: `subscription`.
   */
  public data object Subscription : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4() {
    public override val `value`: String = "subscription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4 = when (value) {
      Invoice.value -> Invoice
      Subscription.value -> Subscription
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4) {
      encoder.encodeString(value.value)
    }
  }
}
