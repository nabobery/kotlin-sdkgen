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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed_amount`.
   */
  public data object FixedAmount : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e() {
    public override val `value`: String = "fixed_amount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e = when (value) {
      FixedAmount.value -> FixedAmount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTypeX33c3159e) {
      encoder.encodeString(value.value)
    }
  }
}
