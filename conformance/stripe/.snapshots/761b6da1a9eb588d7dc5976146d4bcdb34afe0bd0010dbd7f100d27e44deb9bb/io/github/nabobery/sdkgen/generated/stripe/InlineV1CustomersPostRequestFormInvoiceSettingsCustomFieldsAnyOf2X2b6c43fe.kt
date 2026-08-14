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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/invoice_settings/properties/custom_fields/anyOf/1
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsAnyOf2X2b6c43fe) {
      encoder.encodeString(value.value)
    }
  }
}
