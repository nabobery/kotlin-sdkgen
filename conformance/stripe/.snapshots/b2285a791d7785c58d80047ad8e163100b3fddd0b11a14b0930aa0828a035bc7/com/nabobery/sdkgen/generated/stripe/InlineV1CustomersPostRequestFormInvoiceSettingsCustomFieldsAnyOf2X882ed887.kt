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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/custom_fields/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/custom_fields/anyOf/1
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X882ed887) {
      encoder.encodeString(value.value)
    }
  }
}
