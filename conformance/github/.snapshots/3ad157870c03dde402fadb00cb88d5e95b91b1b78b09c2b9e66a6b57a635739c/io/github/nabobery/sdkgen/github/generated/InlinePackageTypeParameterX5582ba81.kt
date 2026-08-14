package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/package-type/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/package-type/schema
 */
@Serializable(with = InlinePackageTypeParameterX5582ba81.Serializer::class)
public sealed class InlinePackageTypeParameterX5582ba81 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `npm`.
   */
  public data object Npm : InlinePackageTypeParameterX5582ba81() {
    public override val `value`: String = "npm"
  }

  /**
   * Documented value. Wire value: `maven`.
   */
  public data object Maven : InlinePackageTypeParameterX5582ba81() {
    public override val `value`: String = "maven"
  }

  /**
   * Documented value. Wire value: `rubygems`.
   */
  public data object Rubygems : InlinePackageTypeParameterX5582ba81() {
    public override val `value`: String = "rubygems"
  }

  /**
   * Documented value. Wire value: `docker`.
   */
  public data object Docker : InlinePackageTypeParameterX5582ba81() {
    public override val `value`: String = "docker"
  }

  /**
   * Documented value. Wire value: `nuget`.
   */
  public data object Nuget : InlinePackageTypeParameterX5582ba81() {
    public override val `value`: String = "nuget"
  }

  /**
   * Documented value. Wire value: `container`.
   */
  public data object Container : InlinePackageTypeParameterX5582ba81() {
    public override val `value`: String = "container"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePackageTypeParameterX5582ba81()

  public companion object {
    public fun fromValue(`value`: String): InlinePackageTypeParameterX5582ba81 = when (value) {
      Npm.value -> Npm
      Maven.value -> Maven
      Rubygems.value -> Rubygems
      Docker.value -> Docker
      Nuget.value -> Nuget
      Container.value -> Container
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePackageTypeParameterX5582ba81> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlinePackageTypeParameterX5582ba81", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePackageTypeParameterX5582ba81 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePackageTypeParameterX5582ba81) {
      encoder.encodeString(value.value)
    }
  }
}
