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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1packages/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1packages/get/parameters/0/schema
 */
@Serializable(with = InlineOrgsPackagesGetParameterX8c84fd39.Serializer::class)
public sealed class InlineOrgsPackagesGetParameterX8c84fd39 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `npm`.
   */
  public data object Npm : InlineOrgsPackagesGetParameterX8c84fd39() {
    public override val `value`: String = "npm"
  }

  /**
   * Documented value. Wire value: `maven`.
   */
  public data object Maven : InlineOrgsPackagesGetParameterX8c84fd39() {
    public override val `value`: String = "maven"
  }

  /**
   * Documented value. Wire value: `rubygems`.
   */
  public data object Rubygems : InlineOrgsPackagesGetParameterX8c84fd39() {
    public override val `value`: String = "rubygems"
  }

  /**
   * Documented value. Wire value: `docker`.
   */
  public data object Docker : InlineOrgsPackagesGetParameterX8c84fd39() {
    public override val `value`: String = "docker"
  }

  /**
   * Documented value. Wire value: `nuget`.
   */
  public data object Nuget : InlineOrgsPackagesGetParameterX8c84fd39() {
    public override val `value`: String = "nuget"
  }

  /**
   * Documented value. Wire value: `container`.
   */
  public data object Container : InlineOrgsPackagesGetParameterX8c84fd39() {
    public override val `value`: String = "container"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPackagesGetParameterX8c84fd39()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPackagesGetParameterX8c84fd39 = when (value) {
      Npm.value -> Npm
      Maven.value -> Maven
      Rubygems.value -> Rubygems
      Docker.value -> Docker
      Nuget.value -> Nuget
      Container.value -> Container
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsPackagesGetParameterX8c84fd39> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsPackagesGetParameterX8c84fd39", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPackagesGetParameterX8c84fd39 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPackagesGetParameterX8c84fd39) {
      encoder.encodeString(value.value)
    }
  }
}
