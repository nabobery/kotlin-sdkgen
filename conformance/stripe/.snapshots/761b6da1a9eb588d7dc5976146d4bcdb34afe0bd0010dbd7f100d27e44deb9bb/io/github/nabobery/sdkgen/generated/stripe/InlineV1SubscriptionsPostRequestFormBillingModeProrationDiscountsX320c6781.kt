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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_mode/properties/flexible/properties/proration_discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_mode/properties/flexible/properties/proration_discounts
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `included`.
   */
  public data object Included : InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781() {
    public override val `value`: String = "included"
  }

  /**
   * Documented value. Wire value: `itemized`.
   */
  public data object Itemized : InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781() {
    public override val `value`: String = "itemized"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781 = when (value) {
      Included.value -> Included
      Itemized.value -> Itemized
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingModeProrationDiscountsX320c6781) {
      encoder.encodeString(value.value)
    }
  }
}
