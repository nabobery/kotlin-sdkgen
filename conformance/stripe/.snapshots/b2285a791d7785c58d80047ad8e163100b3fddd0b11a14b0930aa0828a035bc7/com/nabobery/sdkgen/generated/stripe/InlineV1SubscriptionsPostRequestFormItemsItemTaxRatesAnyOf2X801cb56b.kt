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
 * chema/properties/items/items/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X801cb56b) {
      encoder.encodeString(value.value)
    }
  }
}
