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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/price_data/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/price_data/properties/tax_behavior
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6.Serializer::class)
public sealed class InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6) {
      encoder.encodeString(value.value)
    }
  }
}
