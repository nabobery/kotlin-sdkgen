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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/line_item/properties/object
 */
@Serializable(with = InlineLineItemObjectValueX8aaad4ae.Serializer::class)
public sealed class InlineLineItemObjectValueX8aaad4ae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `line_item`.
   */
  public data object LineItem : InlineLineItemObjectValueX8aaad4ae() {
    public override val `value`: String = "line_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLineItemObjectValueX8aaad4ae()

  public companion object {
    public fun fromValue(`value`: String): InlineLineItemObjectValueX8aaad4ae = when (value) {
      LineItem.value -> LineItem
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineLineItemObjectValueX8aaad4ae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineLineItemObjectValueX8aaad4ae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLineItemObjectValueX8aaad4ae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLineItemObjectValueX8aaad4ae) {
      encoder.encodeString(value.value)
    }
  }
}
