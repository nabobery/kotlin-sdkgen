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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/automatic_tax/properties/liability/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/automatic_tax/properties/liability/properties/type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904 = when (value) {
      Account.value -> Account
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeXc236e904) {
      encoder.encodeString(value.value)
    }
  }
}
