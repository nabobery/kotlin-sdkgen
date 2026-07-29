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
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X41a8a4fb) {
      encoder.encodeString(value.value)
    }
  }
}
