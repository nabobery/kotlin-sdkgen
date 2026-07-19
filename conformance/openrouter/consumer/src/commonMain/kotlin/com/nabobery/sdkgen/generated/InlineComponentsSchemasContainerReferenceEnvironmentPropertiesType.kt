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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ContainerReferenceEnvironment/properties/type.
 */
@Serializable(with = InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `container_reference`.
   */
  public data object ContainerReference : InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType() {
    public override val `value`: String = "container_reference"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType =
      when (value) {
      ContainerReference.value -> ContainerReference
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
