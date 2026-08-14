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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items/properties/applies_to/items/properties/ty
 * pe.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items/properties/applies_to/items/properties/ty
 * pe
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `price`.
   */
  public data object Price : InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4() {
    public override val `value`: String = "price"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4 = when (value) {
      Price.value -> Price
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4) {
      encoder.encodeString(value.value)
    }
  }
}
