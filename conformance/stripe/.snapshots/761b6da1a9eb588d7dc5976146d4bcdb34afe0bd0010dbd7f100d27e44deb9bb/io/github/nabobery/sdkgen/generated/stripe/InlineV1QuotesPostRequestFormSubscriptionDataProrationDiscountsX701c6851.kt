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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/billing_mode/properties/flexible/properties/proration_discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/billing_mode/properties/flexible/properties/proration_discounts
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `included`.
   */
  public data object Included : InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851() {
    public override val `value`: String = "included"
  }

  /**
   * Documented value. Wire value: `itemized`.
   */
  public data object Itemized : InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851() {
    public override val `value`: String = "itemized"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851 = when (value) {
      Included.value -> Included
      Itemized.value -> Itemized
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851) {
      encoder.encodeString(value.value)
    }
  }
}
