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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}~1line_items/get/responses/200/content/applica
 * tion~1json/schema/properties/object
 */
@Serializable(with = InlineV1CheckoutSessionsLineItemsGetResponse200JsonObjectValueXeea52be0.Serializer::class)
public sealed class InlineV1CheckoutSessionsLineItemsGetResponse200JsonObjectValueXeea52be0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1CheckoutSessionsLineItemsGetResponse200JsonObjectValueXeea52be0() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsLineItemsGetResponse200JsonObjectValueXeea52be0()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsLineItemsGetResponse200JsonObjectValueXeea52be0 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsLineItemsGetResponse200JsonObjectValueXeea52be0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsLineItemsGetResponse200JsonObjectValueXeea52be0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsLineItemsGetResponse200JsonObjectValueXeea52be0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsLineItemsGetResponse200JsonObjectValueXeea52be0) {
      encoder.encodeString(value.value)
    }
  }
}
