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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/package-version/properties/metadata/properties/package_type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/package-version/properties/metadata/properties/package_type
 */
@Serializable(with = InlinePackageVersionMetadataPackageTypeXad4c7af0.Serializer::class)
public sealed class InlinePackageVersionMetadataPackageTypeXad4c7af0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `npm`.
   */
  public data object Npm : InlinePackageVersionMetadataPackageTypeXad4c7af0() {
    public override val `value`: String = "npm"
  }

  /**
   * Documented value. Wire value: `maven`.
   */
  public data object Maven : InlinePackageVersionMetadataPackageTypeXad4c7af0() {
    public override val `value`: String = "maven"
  }

  /**
   * Documented value. Wire value: `rubygems`.
   */
  public data object Rubygems : InlinePackageVersionMetadataPackageTypeXad4c7af0() {
    public override val `value`: String = "rubygems"
  }

  /**
   * Documented value. Wire value: `docker`.
   */
  public data object Docker : InlinePackageVersionMetadataPackageTypeXad4c7af0() {
    public override val `value`: String = "docker"
  }

  /**
   * Documented value. Wire value: `nuget`.
   */
  public data object Nuget : InlinePackageVersionMetadataPackageTypeXad4c7af0() {
    public override val `value`: String = "nuget"
  }

  /**
   * Documented value. Wire value: `container`.
   */
  public data object Container : InlinePackageVersionMetadataPackageTypeXad4c7af0() {
    public override val `value`: String = "container"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePackageVersionMetadataPackageTypeXad4c7af0()

  public companion object {
    public fun fromValue(`value`: String): InlinePackageVersionMetadataPackageTypeXad4c7af0 = when (value) {
      Npm.value -> Npm
      Maven.value -> Maven
      Rubygems.value -> Rubygems
      Docker.value -> Docker
      Nuget.value -> Nuget
      Container.value -> Container
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePackageVersionMetadataPackageTypeXad4c7af0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePackageVersionMetadataPackageTypeXad4c7af0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePackageVersionMetadataPackageTypeXad4c7af0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePackageVersionMetadataPackageTypeXad4c7af0) {
      encoder.encodeString(value.value)
    }
  }
}
