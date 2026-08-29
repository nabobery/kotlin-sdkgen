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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/rendering/properties/pdf/properties/page_size.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/rendering/properties/pdf/properties/page_size
 */
@Serializable(with = InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `a4`.
   */
  public data object A4 : InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416() {
    public override val `value`: String = "a4"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `letter`.
   */
  public data object Letter : InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416() {
    public override val `value`: String = "letter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416 = when (value) {
      A4.value -> A4
      Auto.value -> Auto
      Letter.value -> Letter
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416) {
      encoder.encodeString(value.value)
    }
  }
}
