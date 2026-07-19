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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BooleanCapability/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBooleanCapabilityPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBooleanCapabilityPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `boolean`.
   */
  public data object Boolean : InlineComponentsSchemasBooleanCapabilityPropertiesType() {
    public override val `value`: String = "boolean"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBooleanCapabilityPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBooleanCapabilityPropertiesType = when (value) {
      Boolean.value -> Boolean
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBooleanCapabilityPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBooleanCapabilityPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBooleanCapabilityPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBooleanCapabilityPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
