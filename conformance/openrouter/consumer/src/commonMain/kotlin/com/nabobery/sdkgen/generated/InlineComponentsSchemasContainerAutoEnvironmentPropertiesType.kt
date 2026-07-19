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
 * sdkgen://source/openapi.yaml#/components/schemas/ContainerAutoEnvironment/properties/type.
 */
@Serializable(with = InlineComponentsSchemasContainerAutoEnvironmentPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasContainerAutoEnvironmentPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `container_auto`.
   */
  public data object ContainerAuto : InlineComponentsSchemasContainerAutoEnvironmentPropertiesType() {
    public override val `value`: String = "container_auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContainerAutoEnvironmentPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContainerAutoEnvironmentPropertiesType =
      when (value) {
      ContainerAuto.value -> ContainerAuto
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContainerAutoEnvironmentPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContainerAutoEnvironmentPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContainerAutoEnvironmentPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContainerAutoEnvironmentPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
