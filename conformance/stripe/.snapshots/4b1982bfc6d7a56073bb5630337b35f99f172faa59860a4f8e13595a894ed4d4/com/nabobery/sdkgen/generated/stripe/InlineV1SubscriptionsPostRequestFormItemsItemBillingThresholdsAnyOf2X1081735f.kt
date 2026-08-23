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
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X1081735f) {
      encoder.encodeString(value.value)
    }
  }
}
