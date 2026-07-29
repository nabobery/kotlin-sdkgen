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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-private-registry-configuration/properties/auth_type
 */
@Serializable(with = InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164.Serializer::class)
public sealed class InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `token`.
   */
  public data object Token : InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164() {
    public override val `value`: String = "token"
  }

  /**
   * Documented value. Wire value: `username_password`.
   */
  public data object UsernamePassword : InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164() {
    public override val `value`: String = "username_password"
  }

  /**
   * Documented value. Wire value: `oidc_azure`.
   */
  public data object OidcAzure : InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164() {
    public override val `value`: String = "oidc_azure"
  }

  /**
   * Documented value. Wire value: `oidc_aws`.
   */
  public data object OidcAws : InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164() {
    public override val `value`: String = "oidc_aws"
  }

  /**
   * Documented value. Wire value: `oidc_jfrog`.
   */
  public data object OidcJfrog : InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164() {
    public override val `value`: String = "oidc_jfrog"
  }

  /**
   * Documented value. Wire value: `oidc_cloudsmith`.
   */
  public data object OidcCloudsmith : InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164() {
    public override val `value`: String = "oidc_cloudsmith"
  }

  /**
   * Documented value. Wire value: `oidc_gcp`.
   */
  public data object OidcGcp : InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164() {
    public override val `value`: String = "oidc_gcp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164 = when (value) {
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

  public object Serializer : KSerializer<InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgPrivateRegistryConfigurationAuthTypeX77e77164) {
      encoder.encodeString(value.value)
    }
  }
}
