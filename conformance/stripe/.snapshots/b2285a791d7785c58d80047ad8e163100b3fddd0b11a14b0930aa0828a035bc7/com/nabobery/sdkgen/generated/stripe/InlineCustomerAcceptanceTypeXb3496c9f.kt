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
 * The mandate includes the type of customer acceptance information, such as: `online` or `offline`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_acceptance/properties/type
 */
@Serializable(with = InlineCustomerAcceptanceTypeXb3496c9f.Serializer::class)
public sealed class InlineCustomerAcceptanceTypeXb3496c9f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `offline`.
   */
  public data object Offline : InlineCustomerAcceptanceTypeXb3496c9f() {
    public override val `value`: String = "offline"
  }

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineCustomerAcceptanceTypeXb3496c9f() {
    public override val `value`: String = "online"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerAcceptanceTypeXb3496c9f()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerAcceptanceTypeXb3496c9f = when (value) {
      Offline.value -> Offline
      Online.value -> Online
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCustomerAcceptanceTypeXb3496c9f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerAcceptanceTypeXb3496c9f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerAcceptanceTypeXb3496c9f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerAcceptanceTypeXb3496c9f) {
      encoder.encodeString(value.value)
    }
  }
}
