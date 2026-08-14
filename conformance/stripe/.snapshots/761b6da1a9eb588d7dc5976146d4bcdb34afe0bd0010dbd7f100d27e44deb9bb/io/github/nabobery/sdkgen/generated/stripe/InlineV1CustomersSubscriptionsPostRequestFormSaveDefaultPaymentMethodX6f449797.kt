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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/save_default_payment_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/save_default_payment_method
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `on_subscription`.
   */
  public data object OnSubscription : InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797() {
    public override val `value`: String = "on_subscription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797 = when (value) {
      Off.value -> Off
      OnSubscription.value -> OnSubscription
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX6f449797) {
      encoder.encodeString(value.value)
    }
  }
}
