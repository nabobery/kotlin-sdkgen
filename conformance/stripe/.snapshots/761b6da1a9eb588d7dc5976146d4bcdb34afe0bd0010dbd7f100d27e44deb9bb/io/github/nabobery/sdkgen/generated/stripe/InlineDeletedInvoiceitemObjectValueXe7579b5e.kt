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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_invoiceitem/properties/object
 */
@Serializable(with = InlineDeletedInvoiceitemObjectValueXe7579b5e.Serializer::class)
public sealed class InlineDeletedInvoiceitemObjectValueXe7579b5e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoiceitem`.
   */
  public data object Invoiceitem : InlineDeletedInvoiceitemObjectValueXe7579b5e() {
    public override val `value`: String = "invoiceitem"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedInvoiceitemObjectValueXe7579b5e()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedInvoiceitemObjectValueXe7579b5e = when (value) {
      Invoiceitem.value -> Invoiceitem
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedInvoiceitemObjectValueXe7579b5e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedInvoiceitemObjectValueXe7579b5e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedInvoiceitemObjectValueXe7579b5e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedInvoiceitemObjectValueXe7579b5e) {
      encoder.encodeString(value.value)
    }
  }
}
