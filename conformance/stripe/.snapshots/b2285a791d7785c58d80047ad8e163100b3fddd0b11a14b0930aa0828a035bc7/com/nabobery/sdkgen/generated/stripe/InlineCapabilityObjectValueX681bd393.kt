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
 * Source: sdkgen://source/openapi.json#/components/schemas/capability/properties/object
 */
@Serializable(with = InlineCapabilityObjectValueX681bd393.Serializer::class)
public sealed class InlineCapabilityObjectValueX681bd393 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `capability`.
   */
  public data object Capability : InlineCapabilityObjectValueX681bd393() {
    public override val `value`: String = "capability"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCapabilityObjectValueX681bd393()

  public companion object {
    public fun fromValue(`value`: String): InlineCapabilityObjectValueX681bd393 = when (value) {
      Capability.value -> Capability
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCapabilityObjectValueX681bd393> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCapabilityObjectValueX681bd393", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCapabilityObjectValueX681bd393 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCapabilityObjectValueX681bd393) {
      encoder.encodeString(value.value)
    }
  }
}
