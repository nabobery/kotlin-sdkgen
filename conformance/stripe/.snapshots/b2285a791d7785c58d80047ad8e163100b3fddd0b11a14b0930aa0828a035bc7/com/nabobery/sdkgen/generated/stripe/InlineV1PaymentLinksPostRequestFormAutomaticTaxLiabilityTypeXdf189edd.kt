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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/automatic_tax/properties/liability/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/automatic_tax/properties/liability/properties/type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd = when (value) {
      Account.value -> Account
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormAutomaticTaxLiabilityTypeXdf189edd) {
      encoder.encodeString(value.value)
    }
  }
}
