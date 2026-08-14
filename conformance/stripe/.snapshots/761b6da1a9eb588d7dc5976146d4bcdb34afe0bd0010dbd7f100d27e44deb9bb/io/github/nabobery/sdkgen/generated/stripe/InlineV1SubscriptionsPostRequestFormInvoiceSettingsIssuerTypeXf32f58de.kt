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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/issuer/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/issuer/properties/type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de = when (value) {
      Account.value -> Account
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerTypeXf32f58de) {
      encoder.encodeString(value.value)
    }
  }
}
