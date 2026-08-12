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
 * chema/properties/billing_schedules/items/properties/applies_to/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_schedules/items/properties/applies_to/items/properties/type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `price`.
   */
  public data object Price : InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529() {
    public override val `value`: String = "price"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529 = when (value) {
      Price.value -> Price
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529) {
      encoder.encodeString(value.value)
    }
  }
}
