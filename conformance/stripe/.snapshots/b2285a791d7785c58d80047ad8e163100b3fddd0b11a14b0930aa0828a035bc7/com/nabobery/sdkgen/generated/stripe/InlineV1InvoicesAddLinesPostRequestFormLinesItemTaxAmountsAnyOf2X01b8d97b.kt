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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/1
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b.Serializer::class)
public sealed class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b) {
      encoder.encodeString(value.value)
    }
  }
}
