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
 * The type of the microdeposit sent to the customer. Used to distinguish between different verification methods.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_next_action_verify_with_microdeposits/properties/microd
 * eposit_type
 */
@Serializable(with = InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af.Serializer::class)
public sealed class InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amounts`.
   */
  public data object Amounts : InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af() {
    public override val `value`: String = "amounts"
  }

  /**
   * Documented value. Wire value: `descriptor_code`.
   */
  public data object DescriptorCode : InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af() {
    public override val `value`: String = "descriptor_code"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af = when (value) {
      Amounts.value -> Amounts
      DescriptorCode.value -> DescriptorCode
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentNextActionVerifyWithMicrodepositsMicrodepositTypeX6045b4af) {
      encoder.encodeString(value.value)
    }
  }
}
