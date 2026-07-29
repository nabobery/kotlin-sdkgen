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
 * chema/properties/billing_mode/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_mode/properties/type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `classic`.
   */
  public data object Classic : InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e() {
    public override val `value`: String = "classic"
  }

  /**
   * Documented value. Wire value: `flexible`.
   */
  public data object Flexible : InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e() {
    public override val `value`: String = "flexible"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e = when (value) {
      Classic.value -> Classic
      Flexible.value -> Flexible
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e) {
      encoder.encodeString(value.value)
    }
  }
}
