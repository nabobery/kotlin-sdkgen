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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/line_items/properties/object
 */
@Serializable(with = InlineQuoteLineItemsObjectValueXb79c2b29.Serializer::class)
public sealed class InlineQuoteLineItemsObjectValueXb79c2b29 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineQuoteLineItemsObjectValueXb79c2b29() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineQuoteLineItemsObjectValueXb79c2b29()

  public companion object {
    public fun fromValue(`value`: String): InlineQuoteLineItemsObjectValueXb79c2b29 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineQuoteLineItemsObjectValueXb79c2b29> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineQuoteLineItemsObjectValueXb79c2b29", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineQuoteLineItemsObjectValueXb79c2b29 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineQuoteLineItemsObjectValueXb79c2b29) {
      encoder.encodeString(value.value)
    }
  }
}
