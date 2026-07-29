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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details/properties/line_items/properties/object
 */
@Serializable(with = InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef.Serializer::class)
public sealed class InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsAmountDetailsLineItemsObjectValueXc05bd4ef) {
      encoder.encodeString(value.value)
    }
  }
}
