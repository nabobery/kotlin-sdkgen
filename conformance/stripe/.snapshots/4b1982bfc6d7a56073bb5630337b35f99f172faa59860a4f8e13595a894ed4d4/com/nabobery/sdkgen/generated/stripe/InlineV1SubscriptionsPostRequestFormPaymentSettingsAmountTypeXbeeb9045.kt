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
 * chema/properties/payment_settings/properties/payment_method_options/properties/upi/anyOf/0/properties/mandate_options
 * /properties/amount_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/upi/anyOf/0/properties/mandate_options
 * /properties/amount_type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045 = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeXbeeb9045) {
      encoder.encodeString(value.value)
    }
  }
}
