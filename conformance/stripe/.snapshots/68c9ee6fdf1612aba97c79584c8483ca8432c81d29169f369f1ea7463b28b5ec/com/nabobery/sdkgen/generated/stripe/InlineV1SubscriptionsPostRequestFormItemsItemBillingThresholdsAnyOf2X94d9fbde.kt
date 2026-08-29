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
 * chema/properties/items/items/properties/billing_thresholds/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/billing_thresholds/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsAnyOf2X94d9fbde) {
      encoder.encodeString(value.value)
    }
  }
}
