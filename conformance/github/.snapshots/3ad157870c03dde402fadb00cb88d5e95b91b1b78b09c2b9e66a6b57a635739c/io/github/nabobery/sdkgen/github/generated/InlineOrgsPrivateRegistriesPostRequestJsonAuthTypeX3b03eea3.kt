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
 * The authentication type for the private registry. Defaults to `token` if not specified. Use `oidc_azure`, `oidc_aws`,
 * `oidc_jfrog`, `oidc_cloudsmith`, or `oidc_gcp` for OIDC authentication.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries/post/requestBody/content/application~1json/sche
 * ma/properties/auth_type
 */
@Serializable(with = InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3.Serializer::class)
public sealed class InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `token`.
   */
  public data object Token : InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3() {
    public override val `value`: String = "token"
  }

  /**
   * Documented value. Wire value: `username_password`.
   */
  public data object UsernamePassword : InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3() {
    public override val `value`: String = "username_password"
  }

  /**
   * Documented value. Wire value: `oidc_azure`.
   */
  public data object OidcAzure : InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3() {
    public override val `value`: String = "oidc_azure"
  }

  /**
   * Documented value. Wire value: `oidc_aws`.
   */
  public data object OidcAws : InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3() {
    public override val `value`: String = "oidc_aws"
  }

  /**
   * Documented value. Wire value: `oidc_jfrog`.
   */
  public data object OidcJfrog : InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3() {
    public override val `value`: String = "oidc_jfrog"
  }

  /**
   * Documented value. Wire value: `oidc_cloudsmith`.
   */
  public data object OidcCloudsmith : InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3() {
    public override val `value`: String = "oidc_cloudsmith"
  }

  /**
   * Documented value. Wire value: `oidc_gcp`.
   */
  public data object OidcGcp : InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3() {
    public override val `value`: String = "oidc_gcp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3 = when (value) {
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

  internal object Serializer : KSerializer<InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3) {
      encoder.encodeString(value.value)
    }
  }
}
