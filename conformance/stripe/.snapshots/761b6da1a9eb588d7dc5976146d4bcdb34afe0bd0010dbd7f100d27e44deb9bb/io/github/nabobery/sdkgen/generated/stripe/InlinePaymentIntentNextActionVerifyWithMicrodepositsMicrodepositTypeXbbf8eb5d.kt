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
 * The type of the microdeposit sent to the customer. Used to distinguish between different verification methods.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_verify_with_microdeposits/properties/micr
 * odeposit_type
 */
@Serializable(with = InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d.Serializer::class)
public sealed class InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amounts`.
   */
  public data object Amounts : InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d() {
    public override val `value`: String = "amounts"
  }

  /**
   * Documented value. Wire value: `descriptor_code`.
   */
  public data object DescriptorCode : InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d() {
    public override val `value`: String = "descriptor_code"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d = when (value) {
      Amounts.value -> Amounts
      DescriptorCode.value -> DescriptorCode
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d) {
      encoder.encodeString(value.value)
    }
  }
}
