package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_us_bank_account/properties/verif
 * ication_method
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5 = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsUsBankAccountVerificationMethodX8221aaf5) {
      encoder.encodeString(value.value)
    }
  }
}
