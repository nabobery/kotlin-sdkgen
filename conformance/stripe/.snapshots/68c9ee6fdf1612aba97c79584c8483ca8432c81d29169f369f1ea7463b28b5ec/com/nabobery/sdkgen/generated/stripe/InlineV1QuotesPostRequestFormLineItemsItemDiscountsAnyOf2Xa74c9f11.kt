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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/discounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/discounts/anyOf/1
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2Xa74c9f11) {
      encoder.encodeString(value.value)
    }
  }
}
