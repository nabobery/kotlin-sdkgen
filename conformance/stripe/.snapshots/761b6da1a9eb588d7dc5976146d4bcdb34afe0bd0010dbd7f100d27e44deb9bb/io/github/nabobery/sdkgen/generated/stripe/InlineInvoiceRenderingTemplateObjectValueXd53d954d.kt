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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_rendering_template/properties/object
 */
@Serializable(with = InlineInvoiceRenderingTemplateObjectValueXd53d954d.Serializer::class)
public sealed class InlineInvoiceRenderingTemplateObjectValueXd53d954d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice_rendering_template`.
   */
  public data object InvoiceRenderingTemplate : InlineInvoiceRenderingTemplateObjectValueXd53d954d() {
    public override val `value`: String = "invoice_rendering_template"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceRenderingTemplateObjectValueXd53d954d()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceRenderingTemplateObjectValueXd53d954d = when (value) {
      InvoiceRenderingTemplate.value -> InvoiceRenderingTemplate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceRenderingTemplateObjectValueXd53d954d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInvoiceRenderingTemplateObjectValueXd53d954d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceRenderingTemplateObjectValueXd53d954d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceRenderingTemplateObjectValueXd53d954d) {
      encoder.encodeString(value.value)
    }
  }
}
