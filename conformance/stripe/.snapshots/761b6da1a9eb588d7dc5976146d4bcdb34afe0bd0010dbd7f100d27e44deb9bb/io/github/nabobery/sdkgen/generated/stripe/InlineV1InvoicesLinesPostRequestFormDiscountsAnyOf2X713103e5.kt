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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/discounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/discounts/anyOf/1
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5.Serializer::class)
public sealed class InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5) {
      encoder.encodeString(value.value)
    }
  }
}
