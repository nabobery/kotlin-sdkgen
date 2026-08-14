package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContainerReferenceEnvironment/properties/type
 */
@Serializable(with = InlineContainerReferenceEnvironmentTypeX8e21dd4c.Serializer::class)
public sealed class InlineContainerReferenceEnvironmentTypeX8e21dd4c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `container_reference`.
   */
  public data object ContainerReference : InlineContainerReferenceEnvironmentTypeX8e21dd4c() {
    public override val `value`: String = "container_reference"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContainerReferenceEnvironmentTypeX8e21dd4c()

  public companion object {
    public fun fromValue(`value`: String): InlineContainerReferenceEnvironmentTypeX8e21dd4c = when (value) {
      ContainerReference.value -> ContainerReference
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContainerReferenceEnvironmentTypeX8e21dd4c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineContainerReferenceEnvironmentTypeX8e21dd4c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContainerReferenceEnvironmentTypeX8e21dd4c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContainerReferenceEnvironmentTypeX8e21dd4c) {
      encoder.encodeString(value.value)
    }
  }
}
