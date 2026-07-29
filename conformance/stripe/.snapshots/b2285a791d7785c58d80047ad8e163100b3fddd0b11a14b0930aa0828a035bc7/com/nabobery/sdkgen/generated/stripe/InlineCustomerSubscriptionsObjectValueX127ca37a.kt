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
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/subscriptions/properties/object
 */
@Serializable(with = InlineCustomerSubscriptionsObjectValueX127ca37a.Serializer::class)
public sealed class InlineCustomerSubscriptionsObjectValueX127ca37a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineCustomerSubscriptionsObjectValueX127ca37a() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSubscriptionsObjectValueX127ca37a()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSubscriptionsObjectValueX127ca37a = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCustomerSubscriptionsObjectValueX127ca37a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerSubscriptionsObjectValueX127ca37a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSubscriptionsObjectValueX127ca37a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSubscriptionsObjectValueX127ca37a) {
      encoder.encodeString(value.value)
    }
  }
}
