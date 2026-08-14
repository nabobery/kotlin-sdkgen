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
 * sdkgen://source/openapi.json#/components/schemas/checkout_us_bank_account_payment_method_options/properties/verificat
 * ion_method
 */
@Serializable(with = InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b.Serializer::class)
public sealed class InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b() {
    public override val `value`: String = "instant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutUsBankAccountPaymentMethodOptionsVerificationMethodX17b05d7b) {
      encoder.encodeString(value.value)
    }
  }
}
