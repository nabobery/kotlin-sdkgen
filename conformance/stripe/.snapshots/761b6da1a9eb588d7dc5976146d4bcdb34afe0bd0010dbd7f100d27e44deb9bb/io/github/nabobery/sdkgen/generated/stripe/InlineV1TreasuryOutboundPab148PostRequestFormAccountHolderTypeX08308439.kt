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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/us_bank_account/properties/account_holder_t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/us_bank_account/properties/account_holder_t
 * ype
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439.Serializer::class)
public sealed class InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439 = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPab148PostRequestFormAccountHolderTypeX08308439) {
      encoder.encodeString(value.value)
    }
  }
}
