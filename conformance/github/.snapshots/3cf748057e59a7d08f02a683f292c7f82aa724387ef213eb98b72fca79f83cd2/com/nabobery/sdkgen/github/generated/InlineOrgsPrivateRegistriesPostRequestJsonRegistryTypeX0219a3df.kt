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
 * The registry type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries/post/requestBody/content/application~1json/sche
 * ma/properties/registry_type
 */
@Serializable(with = InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df.Serializer::class)
public sealed class InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `maven_repository`.
   */
  public data object MavenRepository : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "maven_repository"
  }

  /**
   * Documented value. Wire value: `nuget_feed`.
   */
  public data object NugetFeed : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "nuget_feed"
  }

  /**
   * Documented value. Wire value: `goproxy_server`.
   */
  public data object GoproxyServer : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "goproxy_server"
  }

  /**
   * Documented value. Wire value: `npm_registry`.
   */
  public data object NpmRegistry : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "npm_registry"
  }

  /**
   * Documented value. Wire value: `rubygems_server`.
   */
  public data object RubygemsServer : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "rubygems_server"
  }

  /**
   * Documented value. Wire value: `cargo_registry`.
   */
  public data object CargoRegistry : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "cargo_registry"
  }

  /**
   * Documented value. Wire value: `composer_repository`.
   */
  public data object ComposerRepository : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "composer_repository"
  }

  /**
   * Documented value. Wire value: `docker_registry`.
   */
  public data object DockerRegistry : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "docker_registry"
  }

  /**
   * Documented value. Wire value: `git_source`.
   */
  public data object GitSource : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "git_source"
  }

  /**
   * Documented value. Wire value: `helm_registry`.
   */
  public data object HelmRegistry : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "helm_registry"
  }

  /**
   * Documented value. Wire value: `hex_organization`.
   */
  public data object HexOrganization : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "hex_organization"
  }

  /**
   * Documented value. Wire value: `hex_repository`.
   */
  public data object HexRepository : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "hex_repository"
  }

  /**
   * Documented value. Wire value: `pub_repository`.
   */
  public data object PubRepository : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "pub_repository"
  }

  /**
   * Documented value. Wire value: `python_index`.
   */
  public data object PythonIndex : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "python_index"
  }

  /**
   * Documented value. Wire value: `terraform_registry`.
   */
  public data object TerraformRegistry : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df() {
    public override val `value`: String = "terraform_registry"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df = when (value) {
      MavenRepository.value -> MavenRepository
      NugetFeed.value -> NugetFeed
      GoproxyServer.value -> GoproxyServer
      NpmRegistry.value -> NpmRegistry
      RubygemsServer.value -> RubygemsServer
      CargoRegistry.value -> CargoRegistry
      ComposerRepository.value -> ComposerRepository
      DockerRegistry.value -> DockerRegistry
      GitSource.value -> GitSource
      HelmRegistry.value -> HelmRegistry
      HexOrganization.value -> HexOrganization
      HexRepository.value -> HexRepository
      PubRepository.value -> PubRepository
      PythonIndex.value -> PythonIndex
      TerraformRegistry.value -> TerraformRegistry
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df) {
      encoder.encodeString(value.value)
    }
  }
}
