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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/price_data/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/price_data/properties/tax_behavior
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a.Serializer::class)
public sealed class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataTaxBehaviorX1db0ed7a) {
      encoder.encodeString(value.value)
    }
  }
}
