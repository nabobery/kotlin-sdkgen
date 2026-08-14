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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ServiceTier.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ServiceTier
 */
@Serializable(with = ServiceTier.Serializer::class)
public sealed class ServiceTier {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : ServiceTier() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `default`.
   */
  public data object Default : ServiceTier() {
    public override val `value`: String = "default"
  }

  /**
   * Documented value. Wire value: `flex`.
   */
  public data object Flex : ServiceTier() {
    public override val `value`: String = "flex"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : ServiceTier() {
    public override val `value`: String = "priority"
  }

  /**
   * Documented value. Wire value: `scale`.
   */
  public data object Scale : ServiceTier() {
    public override val `value`: String = "scale"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ServiceTier()

  public companion object {
    public fun fromValue(`value`: String): ServiceTier = when (value) {
      Auto.value -> Auto
      Default.value -> Default
      Flex.value -> Flex
      Priority.value -> Priority
      Scale.value -> Scale
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ServiceTier> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.ServiceTier", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ServiceTier = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ServiceTier) {
      encoder.encodeString(value.value)
    }
  }
}
