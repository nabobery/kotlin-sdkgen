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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1user~1packages/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1packages/get/parameters/0/schema
 */
@Serializable(with = InlineUserPackagesGetParameterX6bfbea6f.Serializer::class)
public sealed class InlineUserPackagesGetParameterX6bfbea6f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `npm`.
   */
  public data object Npm : InlineUserPackagesGetParameterX6bfbea6f() {
    public override val `value`: String = "npm"
  }

  /**
   * Documented value. Wire value: `maven`.
   */
  public data object Maven : InlineUserPackagesGetParameterX6bfbea6f() {
    public override val `value`: String = "maven"
  }

  /**
   * Documented value. Wire value: `rubygems`.
   */
  public data object Rubygems : InlineUserPackagesGetParameterX6bfbea6f() {
    public override val `value`: String = "rubygems"
  }

  /**
   * Documented value. Wire value: `docker`.
   */
  public data object Docker : InlineUserPackagesGetParameterX6bfbea6f() {
    public override val `value`: String = "docker"
  }

  /**
   * Documented value. Wire value: `nuget`.
   */
  public data object Nuget : InlineUserPackagesGetParameterX6bfbea6f() {
    public override val `value`: String = "nuget"
  }

  /**
   * Documented value. Wire value: `container`.
   */
  public data object Container : InlineUserPackagesGetParameterX6bfbea6f() {
    public override val `value`: String = "container"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserPackagesGetParameterX6bfbea6f()

  public companion object {
    public fun fromValue(`value`: String): InlineUserPackagesGetParameterX6bfbea6f = when (value) {
      Npm.value -> Npm
      Maven.value -> Maven
      Rubygems.value -> Rubygems
      Docker.value -> Docker
      Nuget.value -> Nuget
      Container.value -> Container
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserPackagesGetParameterX6bfbea6f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserPackagesGetParameterX6bfbea6f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserPackagesGetParameterX6bfbea6f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserPackagesGetParameterX6bfbea6f) {
      encoder.encodeString(value.value)
    }
  }
}
