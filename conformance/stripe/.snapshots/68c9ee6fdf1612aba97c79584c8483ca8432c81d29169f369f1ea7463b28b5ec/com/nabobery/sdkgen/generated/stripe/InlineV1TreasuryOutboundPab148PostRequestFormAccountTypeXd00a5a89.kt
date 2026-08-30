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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/us_bank_account/properties/account_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/us_bank_account/properties/account_type
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89.Serializer::class)
public sealed class InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89 = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPab148PostRequestFormAccountTypeXd00a5a89) {
      encoder.encodeString(value.value)
    }
  }
}
