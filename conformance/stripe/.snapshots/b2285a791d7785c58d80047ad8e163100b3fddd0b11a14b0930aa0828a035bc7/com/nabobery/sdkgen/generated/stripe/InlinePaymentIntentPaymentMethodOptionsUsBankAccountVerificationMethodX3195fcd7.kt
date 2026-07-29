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
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_us_bank_account/properties/ver
 * ification_method
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7 = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsUsBankAccountVerificationMethodX3195fcd7) {
      encoder.encodeString(value.value)
    }
  }
}
