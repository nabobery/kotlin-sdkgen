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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_settings/properties/account_tax_ids/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_settings/properties/account_tax_ids/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsAnyOf2X62add70e) {
      encoder.encodeString(value.value)
    }
  }
}
