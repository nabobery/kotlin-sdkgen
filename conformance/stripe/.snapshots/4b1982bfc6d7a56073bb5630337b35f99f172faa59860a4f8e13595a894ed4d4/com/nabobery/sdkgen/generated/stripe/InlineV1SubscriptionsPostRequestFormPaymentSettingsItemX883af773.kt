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
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/fin
 * ancial_connections/properties/permissions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/fin
 * ancial_connections/properties/permissions/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `payment_method`.
   */
  public data object PaymentMethod : InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773() {
    public override val `value`: String = "payment_method"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773 = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      PaymentMethod.value -> PaymentMethod
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX883af773) {
      encoder.encodeString(value.value)
    }
  }
}
