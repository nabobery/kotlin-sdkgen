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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContainerAutoEnvironment/properties/type
 */
@Serializable(with = InlineContainerAutoEnvironmentTypeXd0cb6a1c.Serializer::class)
public sealed class InlineContainerAutoEnvironmentTypeXd0cb6a1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `container_auto`.
   */
  public data object ContainerAuto : InlineContainerAutoEnvironmentTypeXd0cb6a1c() {
    public override val `value`: String = "container_auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContainerAutoEnvironmentTypeXd0cb6a1c()

  public companion object {
    public fun fromValue(`value`: String): InlineContainerAutoEnvironmentTypeXd0cb6a1c = when (value) {
      ContainerAuto.value -> ContainerAuto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContainerAutoEnvironmentTypeXd0cb6a1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineContainerAutoEnvironmentTypeXd0cb6a1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContainerAutoEnvironmentTypeXd0cb6a1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContainerAutoEnvironmentTypeXd0cb6a1c) {
      encoder.encodeString(value.value)
    }
  }
}
