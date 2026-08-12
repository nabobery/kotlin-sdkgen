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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1packages/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1packages/get/parameters/0/schema
 */
@Serializable(with = InlineUsersPackagesGetParameterX62329c45.Serializer::class)
public sealed class InlineUsersPackagesGetParameterX62329c45 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `npm`.
   */
  public data object Npm : InlineUsersPackagesGetParameterX62329c45() {
    public override val `value`: String = "npm"
  }

  /**
   * Documented value. Wire value: `maven`.
   */
  public data object Maven : InlineUsersPackagesGetParameterX62329c45() {
    public override val `value`: String = "maven"
  }

  /**
   * Documented value. Wire value: `rubygems`.
   */
  public data object Rubygems : InlineUsersPackagesGetParameterX62329c45() {
    public override val `value`: String = "rubygems"
  }

  /**
   * Documented value. Wire value: `docker`.
   */
  public data object Docker : InlineUsersPackagesGetParameterX62329c45() {
    public override val `value`: String = "docker"
  }

  /**
   * Documented value. Wire value: `nuget`.
   */
  public data object Nuget : InlineUsersPackagesGetParameterX62329c45() {
    public override val `value`: String = "nuget"
  }

  /**
   * Documented value. Wire value: `container`.
   */
  public data object Container : InlineUsersPackagesGetParameterX62329c45() {
    public override val `value`: String = "container"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersPackagesGetParameterX62329c45()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersPackagesGetParameterX62329c45 = when (value) {
      Npm.value -> Npm
      Maven.value -> Maven
      Rubygems.value -> Rubygems
      Docker.value -> Docker
      Nuget.value -> Nuget
      Container.value -> Container
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersPackagesGetParameterX62329c45> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersPackagesGetParameterX62329c45", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersPackagesGetParameterX62329c45 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersPackagesGetParameterX62329c45) {
      encoder.encodeString(value.value)
    }
  }
}
