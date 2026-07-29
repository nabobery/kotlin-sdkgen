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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.calculation/properties/line_items/properties/object
 */
@Serializable(with = InlineTaxCalculationLineItemsObjectValueXb2e215da.Serializer::class)
public sealed class InlineTaxCalculationLineItemsObjectValueXb2e215da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineTaxCalculationLineItemsObjectValueXb2e215da() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxCalculationLineItemsObjectValueXb2e215da()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxCalculationLineItemsObjectValueXb2e215da = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxCalculationLineItemsObjectValueXb2e215da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxCalculationLineItemsObjectValueXb2e215da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxCalculationLineItemsObjectValueXb2e215da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxCalculationLineItemsObjectValueXb2e215da) {
      encoder.encodeString(value.value)
    }
  }
}
