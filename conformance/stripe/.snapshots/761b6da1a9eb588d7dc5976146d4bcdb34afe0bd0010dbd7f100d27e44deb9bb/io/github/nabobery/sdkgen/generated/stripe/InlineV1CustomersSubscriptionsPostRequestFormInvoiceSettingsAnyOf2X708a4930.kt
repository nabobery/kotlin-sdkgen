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
 * x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/1
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X708a4930) {
      encoder.encodeString(value.value)
    }
  }
}
