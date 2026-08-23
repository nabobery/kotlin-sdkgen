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
 * ded/schema/properties/subscription_data/properties/billing_mode/properties/flexible/properties/proration_discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/billing_mode/properties/flexible/properties/proration_discounts
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `included`.
   */
  public data object Included : InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3() {
    public override val `value`: String = "included"
  }

  /**
   * Documented value. Wire value: `itemized`.
   */
  public data object Itemized : InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3() {
    public override val `value`: String = "itemized"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3 = when (value) {
      Included.value -> Included
      Itemized.value -> Itemized
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormProrationDiscountsX3658b4a3) {
      encoder.encodeString(value.value)
    }
  }
}
