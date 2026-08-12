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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X611a6be2) {
      encoder.encodeString(value.value)
    }
  }
}
