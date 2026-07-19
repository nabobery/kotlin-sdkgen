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
 */
@Serializable(with = InlineComponentsSchemasEnumCapabilityPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasEnumCapabilityPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enum`.
   */
  public data object Enum : InlineComponentsSchemasEnumCapabilityPropertiesType() {
    public override val `value`: String = "enum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasEnumCapabilityPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasEnumCapabilityPropertiesType = when (value) {
      Enum.value -> Enum
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasEnumCapabilityPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasEnumCapabilityPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasEnumCapabilityPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasEnumCapabilityPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
