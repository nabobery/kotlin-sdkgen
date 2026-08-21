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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/automatic_tax/properties/liability/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/automatic_tax/properties/liability/properties/type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2 = when (value) {
      Account.value -> Account
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityTypeX726d18d2) {
      encoder.encodeString(value.value)
    }
  }
}
