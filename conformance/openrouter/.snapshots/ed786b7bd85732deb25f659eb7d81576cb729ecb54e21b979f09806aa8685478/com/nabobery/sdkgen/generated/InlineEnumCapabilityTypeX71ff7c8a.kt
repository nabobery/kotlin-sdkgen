package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/EnumCapability/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EnumCapability/properties/type
 */
@Serializable(with = InlineEnumCapabilityTypeX71ff7c8a.Serializer::class)
public sealed class InlineEnumCapabilityTypeX71ff7c8a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enum`.
   */
  public data object Enum : InlineEnumCapabilityTypeX71ff7c8a() {
    public override val `value`: String = "enum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnumCapabilityTypeX71ff7c8a()

  public companion object {
    public fun fromValue(`value`: String): InlineEnumCapabilityTypeX71ff7c8a = when (value) {
      Enum.value -> Enum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnumCapabilityTypeX71ff7c8a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineEnumCapabilityTypeX71ff7c8a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnumCapabilityTypeX71ff7c8a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnumCapabilityTypeX71ff7c8a) {
      encoder.encodeString(value.value)
    }
  }
}
