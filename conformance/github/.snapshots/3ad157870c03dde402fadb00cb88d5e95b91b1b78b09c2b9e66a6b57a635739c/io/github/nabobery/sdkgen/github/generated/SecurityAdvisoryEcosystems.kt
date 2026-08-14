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
 * The package's language or package management ecosystem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/security-advisory-ecosystems
 */
@Serializable(with = SecurityAdvisoryEcosystems.Serializer::class)
public sealed class SecurityAdvisoryEcosystems {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `rubygems`.
   */
  public data object Rubygems : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "rubygems"
  }

  /**
   * Documented value. Wire value: `npm`.
   */
  public data object Npm : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "npm"
  }

  /**
   * Documented value. Wire value: `pip`.
   */
  public data object Pip : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "pip"
  }

  /**
   * Documented value. Wire value: `maven`.
   */
  public data object Maven : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "maven"
  }

  /**
   * Documented value. Wire value: `nuget`.
   */
  public data object Nuget : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "nuget"
  }

  /**
   * Documented value. Wire value: `composer`.
   */
  public data object Composer : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "composer"
  }

  /**
   * Documented value. Wire value: `go`.
   */
  public data object Go : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "go"
  }

  /**
   * Documented value. Wire value: `rust`.
   */
  public data object Rust : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "rust"
  }

  /**
   * Documented value. Wire value: `erlang`.
   */
  public data object Erlang : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "erlang"
  }

  /**
   * Documented value. Wire value: `actions`.
   */
  public data object Actions : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "actions"
  }

  /**
   * Documented value. Wire value: `pub`.
   */
  public data object Pub : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "pub"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : SecurityAdvisoryEcosystems() {
    public override val `value`: String = "swift"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : SecurityAdvisoryEcosystems()

  public companion object {
    public fun fromValue(`value`: String): SecurityAdvisoryEcosystems = when (value) {
      Rubygems.value -> Rubygems
      Npm.value -> Npm
      Pip.value -> Pip
      Maven.value -> Maven
      Nuget.value -> Nuget
      Composer.value -> Composer
      Go.value -> Go
      Rust.value -> Rust
      Erlang.value -> Erlang
      Actions.value -> Actions
      Pub.value -> Pub
      Other.value -> Other
      Swift.value -> Swift
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<SecurityAdvisoryEcosystems> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.SecurityAdvisoryEcosystems", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): SecurityAdvisoryEcosystems = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: SecurityAdvisoryEcosystems) {
      encoder.encodeString(value.value)
    }
  }
}
