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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/request_three_d_sec
 * ure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/request_three_d_sec
 * ure
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `any`.
   */
  public data object Any : InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852() {
    public override val `value`: String = "any"
  }

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `challenge`.
   */
  public data object Challenge : InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852() {
    public override val `value`: String = "challenge"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852 = when (value) {
      Any.value -> Any
      Automatic.value -> Automatic
      Challenge.value -> Challenge
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsRequestThreeDSecureX8db59852) {
      encoder.encodeString(value.value)
    }
  }
}
