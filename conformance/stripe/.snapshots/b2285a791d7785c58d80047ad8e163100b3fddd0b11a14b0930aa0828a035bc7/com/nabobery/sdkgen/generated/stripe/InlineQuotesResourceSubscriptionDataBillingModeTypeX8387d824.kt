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
 * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/quotes_resource_subscription_data_billing_mode/properties/type
 */
@Serializable(with = InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824.Serializer::class)
public sealed class InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `classic`.
   */
  public data object Classic : InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824() {
    public override val `value`: String = "classic"
  }

  /**
   * Documented value. Wire value: `flexible`.
   */
  public data object Flexible : InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824() {
    public override val `value`: String = "flexible"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824()

  public companion object {
    public fun fromValue(`value`: String): InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824 = when (value) {
      Classic.value -> Classic
      Flexible.value -> Flexible
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineQuotesResourceSubscriptionDataBillingModeTypeX8387d824) {
      encoder.encodeString(value.value)
    }
  }
}
