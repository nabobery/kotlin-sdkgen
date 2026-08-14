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
 * The registry type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/org-private-registry-configuration-with-selected-repositories/proper
 * ties/registry_type
 */
@Serializable(with = InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3.Serializer::class)
public sealed class InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `maven_repository`.
   */
  public data object MavenRepository : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "maven_repository"
  }

  /**
   * Documented value. Wire value: `nuget_feed`.
   */
  public data object NugetFeed : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "nuget_feed"
  }

  /**
   * Documented value. Wire value: `goproxy_server`.
   */
  public data object GoproxyServer : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "goproxy_server"
  }

  /**
   * Documented value. Wire value: `npm_registry`.
   */
  public data object NpmRegistry : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "npm_registry"
  }

  /**
   * Documented value. Wire value: `rubygems_server`.
   */
  public data object RubygemsServer : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "rubygems_server"
  }

  /**
   * Documented value. Wire value: `cargo_registry`.
   */
  public data object CargoRegistry : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "cargo_registry"
  }

  /**
   * Documented value. Wire value: `composer_repository`.
   */
  public data object ComposerRepository : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "composer_repository"
  }

  /**
   * Documented value. Wire value: `docker_registry`.
   */
  public data object DockerRegistry : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "docker_registry"
  }

  /**
   * Documented value. Wire value: `git_source`.
   */
  public data object GitSource : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "git_source"
  }

  /**
   * Documented value. Wire value: `helm_registry`.
   */
  public data object HelmRegistry : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "helm_registry"
  }

  /**
   * Documented value. Wire value: `hex_organization`.
   */
  public data object HexOrganization : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "hex_organization"
  }

  /**
   * Documented value. Wire value: `hex_repository`.
   */
  public data object HexRepository : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "hex_repository"
  }

  /**
   * Documented value. Wire value: `pub_repository`.
   */
  public data object PubRepository : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "pub_repository"
  }

  /**
   * Documented value. Wire value: `python_index`.
   */
  public data object PythonIndex : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "python_index"
  }

  /**
   * Documented value. Wire value: `terraform_registry`.
   */
  public data object TerraformRegistry : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3() {
    public override val `value`: String = "terraform_registry"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3 = when (value) {
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

  internal object Serializer : KSerializer<InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3) {
      encoder.encodeString(value.value)
    }
  }
}
