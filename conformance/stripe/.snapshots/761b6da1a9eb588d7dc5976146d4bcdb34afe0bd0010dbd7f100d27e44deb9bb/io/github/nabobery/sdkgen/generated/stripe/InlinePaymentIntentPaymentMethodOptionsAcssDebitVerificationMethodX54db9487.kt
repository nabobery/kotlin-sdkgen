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
 * Bank account verification method. The default value is `automatic`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_acss_debit/properties/verifica
 * tion_method
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487 = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487) {
      encoder.encodeString(value.value)
    }
  }
}
