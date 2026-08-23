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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries~1{secret_name}/patch/requestBody/content/applic
 * ation~1json/schema/properties/registry_type
 */
@Serializable(with = InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2.Serializer::class)
public sealed class InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `maven_repository`.
   */
  public data object MavenRepository : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "maven_repository"
  }

  /**
   * Documented value. Wire value: `nuget_feed`.
   */
  public data object NugetFeed : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "nuget_feed"
  }

  /**
   * Documented value. Wire value: `goproxy_server`.
   */
  public data object GoproxyServer : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "goproxy_server"
  }

  /**
   * Documented value. Wire value: `npm_registry`.
   */
  public data object NpmRegistry : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "npm_registry"
  }

  /**
   * Documented value. Wire value: `rubygems_server`.
   */
  public data object RubygemsServer : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "rubygems_server"
  }

  /**
   * Documented value. Wire value: `cargo_registry`.
   */
  public data object CargoRegistry : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "cargo_registry"
  }

  /**
   * Documented value. Wire value: `composer_repository`.
   */
  public data object ComposerRepository : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "composer_repository"
  }

  /**
   * Documented value. Wire value: `docker_registry`.
   */
  public data object DockerRegistry : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "docker_registry"
  }

  /**
   * Documented value. Wire value: `git_source`.
   */
  public data object GitSource : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "git_source"
  }

  /**
   * Documented value. Wire value: `helm_registry`.
   */
  public data object HelmRegistry : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "helm_registry"
  }

  /**
   * Documented value. Wire value: `hex_organization`.
   */
  public data object HexOrganization : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "hex_organization"
  }

  /**
   * Documented value. Wire value: `hex_repository`.
   */
  public data object HexRepository : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "hex_repository"
  }

  /**
   * Documented value. Wire value: `pub_repository`.
   */
  public data object PubRepository : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "pub_repository"
  }

  /**
   * Documented value. Wire value: `python_index`.
   */
  public data object PythonIndex : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "python_index"
  }

  /**
   * Documented value. Wire value: `terraform_registry`.
   */
  public data object TerraformRegistry : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2() {
    public override val `value`: String = "terraform_registry"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2 = when (value) {
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

  internal object Serializer : KSerializer<InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2) {
      encoder.encodeString(value.value)
    }
  }
}
