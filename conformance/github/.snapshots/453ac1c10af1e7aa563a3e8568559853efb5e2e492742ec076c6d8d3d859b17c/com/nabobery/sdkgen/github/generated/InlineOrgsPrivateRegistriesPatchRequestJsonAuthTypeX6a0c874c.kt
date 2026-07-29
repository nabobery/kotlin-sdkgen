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
 * The authentication type for the private registry. This field cannot be changed after creation. If provided, it must
 * match the existing `auth_type` of the configuration. To change the authentication type, delete and recreate the
 * configuration.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries~1{secret_name}/patch/requestBody/content/applic
 * ation~1json/schema/properties/auth_type
 */
@Serializable(with = InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c.Serializer::class)
public sealed class InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `token`.
   */
  public data object Token : InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c() {
    public override val `value`: String = "token"
  }

  /**
   * Documented value. Wire value: `username_password`.
   */
  public data object UsernamePassword : InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c() {
    public override val `value`: String = "username_password"
  }

  /**
   * Documented value. Wire value: `oidc_azure`.
   */
  public data object OidcAzure : InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c() {
    public override val `value`: String = "oidc_azure"
  }

  /**
   * Documented value. Wire value: `oidc_aws`.
   */
  public data object OidcAws : InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c() {
    public override val `value`: String = "oidc_aws"
  }

  /**
   * Documented value. Wire value: `oidc_jfrog`.
   */
  public data object OidcJfrog : InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c() {
    public override val `value`: String = "oidc_jfrog"
  }

  /**
   * Documented value. Wire value: `oidc_cloudsmith`.
   */
  public data object OidcCloudsmith : InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c() {
    public override val `value`: String = "oidc_cloudsmith"
  }

  /**
   * Documented value. Wire value: `oidc_gcp`.
   */
  public data object OidcGcp : InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c() {
    public override val `value`: String = "oidc_gcp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c = when (value) {
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

  public object Serializer : KSerializer<InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c) {
      encoder.encodeString(value.value)
    }
  }
}
