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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1migrate/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/billing_mode/properties/flexible/properties/proration_discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1migrate/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/billing_mode/properties/flexible/properties/proration_discounts
 */
@Serializable(with = InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc.Serializer::class)
public sealed class InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `included`.
   */
  public data object Included : InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc() {
    public override val `value`: String = "included"
  }

  /**
   * Documented value. Wire value: `itemized`.
   */
  public data object Itemized : InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc() {
    public override val `value`: String = "itemized"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc = when (value) {
      Included.value -> Included
      Itemized.value -> Itemized
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsMigratePostRequestFormProrationDiscountsX3783d0cc) {
      encoder.encodeString(value.value)
    }
  }
}
