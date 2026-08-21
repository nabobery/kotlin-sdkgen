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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/line_items/properties/object
 */
@Serializable(with = InlineCheckoutSessionLineItemsObjectValueX9aaf60c1.Serializer::class)
public sealed class InlineCheckoutSessionLineItemsObjectValueX9aaf60c1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineCheckoutSessionLineItemsObjectValueX9aaf60c1() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSessionLineItemsObjectValueX9aaf60c1()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSessionLineItemsObjectValueX9aaf60c1 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionLineItemsObjectValueX9aaf60c1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionLineItemsObjectValueX9aaf60c1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionLineItemsObjectValueX9aaf60c1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionLineItemsObjectValueX9aaf60c1) {
      encoder.encodeString(value.value)
    }
  }
}
