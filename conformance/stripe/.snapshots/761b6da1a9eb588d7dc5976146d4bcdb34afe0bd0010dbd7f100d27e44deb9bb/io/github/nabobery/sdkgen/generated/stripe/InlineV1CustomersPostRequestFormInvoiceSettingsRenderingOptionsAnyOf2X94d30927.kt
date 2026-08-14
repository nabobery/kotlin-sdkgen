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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/rendering_options/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/invoice_settings/properties/rendering_options/anyOf/1
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2X94d30927.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2X94d30927 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2X94d30927() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2X94d30927()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2X94d30927 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2X94d30927> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2X94d30927", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2X94d30927 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf2X94d30927) {
      encoder.encodeString(value.value)
    }
  }
}
