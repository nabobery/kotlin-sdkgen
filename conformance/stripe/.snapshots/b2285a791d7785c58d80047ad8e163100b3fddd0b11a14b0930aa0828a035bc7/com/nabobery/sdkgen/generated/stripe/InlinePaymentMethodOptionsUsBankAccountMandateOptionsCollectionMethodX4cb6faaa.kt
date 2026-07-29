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
 * Mandate collection method
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_us_bank_account_mandate_options/properties/co
 * llection_method
 */
@Serializable(with = InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa.Serializer::class)
public sealed class InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `paper`.
   */
  public data object Paper : InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa() {
    public override val `value`: String = "paper"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa = when (value) {
      Paper.value -> Paper
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa) {
      encoder.encodeString(value.value)
    }
  }
}
