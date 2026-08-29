package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/package-visibility/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/package-visibility/schema
 */
@Serializable(with = InlinePackageVisibilityParameterX31044377.Serializer::class)
public sealed class InlinePackageVisibilityParameterX31044377 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlinePackageVisibilityParameterX31044377() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlinePackageVisibilityParameterX31044377() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlinePackageVisibilityParameterX31044377() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePackageVisibilityParameterX31044377()

  public companion object {
    public fun fromValue(`value`: String): InlinePackageVisibilityParameterX31044377 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePackageVisibilityParameterX31044377> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePackageVisibilityParameterX31044377", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePackageVisibilityParameterX31044377 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePackageVisibilityParameterX31044377) {
      encoder.encodeString(value.value)
    }
  }
}
