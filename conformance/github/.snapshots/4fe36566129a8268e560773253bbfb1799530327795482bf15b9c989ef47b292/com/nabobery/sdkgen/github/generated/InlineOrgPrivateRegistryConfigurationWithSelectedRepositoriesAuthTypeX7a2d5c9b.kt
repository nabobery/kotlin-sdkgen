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
 * The authentication type for the private registry.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/org-private-registry-configuration-with-selected-repositories/proper
 * ties/auth_type
 */
@Serializable(with = InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b.Serializer::class)
public sealed class InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `token`.
   */
  public data object Token : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b() {
    public override val `value`: String = "token"
  }

  /**
   * Documented value. Wire value: `username_password`.
   */
  public data object UsernamePassword : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b() {
    public override val `value`: String = "username_password"
  }

  /**
   * Documented value. Wire value: `oidc_azure`.
   */
  public data object OidcAzure : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b() {
    public override val `value`: String = "oidc_azure"
  }

  /**
   * Documented value. Wire value: `oidc_aws`.
   */
  public data object OidcAws : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b() {
    public override val `value`: String = "oidc_aws"
  }

  /**
   * Documented value. Wire value: `oidc_jfrog`.
   */
  public data object OidcJfrog : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b() {
    public override val `value`: String = "oidc_jfrog"
  }

  /**
   * Documented value. Wire value: `oidc_cloudsmith`.
   */
  public data object OidcCloudsmith : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b() {
    public override val `value`: String = "oidc_cloudsmith"
  }

  /**
   * Documented value. Wire value: `oidc_gcp`.
   */
  public data object OidcGcp : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b() {
    public override val `value`: String = "oidc_gcp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b = when (value) {
      Token.value -> Token
      UsernamePassword.value -> UsernamePassword
      OidcAzure.value -> OidcAzure
      OidcAws.value -> OidcAws
      OidcJfrog.value -> OidcJfrog
      OidcCloudsmith.value -> OidcCloudsmith
      OidcGcp.value -> OidcGcp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b) {
      encoder.encodeString(value.value)
    }
  }
}
