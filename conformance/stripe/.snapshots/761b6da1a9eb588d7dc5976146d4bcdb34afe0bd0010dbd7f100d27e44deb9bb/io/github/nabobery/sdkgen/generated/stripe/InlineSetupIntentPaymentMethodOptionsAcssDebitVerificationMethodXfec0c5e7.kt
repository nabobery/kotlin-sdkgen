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
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_acss_debit/properties/verificati
 * on_method
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7 = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsAcssDebitVerificationMethodXfec0c5e7) {
      encoder.encodeString(value.value)
    }
  }
}
