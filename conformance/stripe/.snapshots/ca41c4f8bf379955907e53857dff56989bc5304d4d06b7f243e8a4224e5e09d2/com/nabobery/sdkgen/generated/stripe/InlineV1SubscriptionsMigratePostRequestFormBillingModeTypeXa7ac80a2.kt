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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1migrate/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/billing_mode/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1migrate/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/billing_mode/properties/type
 */
@Serializable(with = InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2.Serializer::class)
public sealed class InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `flexible`.
   */
  public data object Flexible : InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2() {
    public override val `value`: String = "flexible"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2 = when (value) {
      Flexible.value -> Flexible
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2) {
      encoder.encodeString(value.value)
    }
  }
}
