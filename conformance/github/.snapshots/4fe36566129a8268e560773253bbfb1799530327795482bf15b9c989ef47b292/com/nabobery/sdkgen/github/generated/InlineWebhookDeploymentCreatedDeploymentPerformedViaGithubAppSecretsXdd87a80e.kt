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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/deployment/properties/performe
 * d_via_github_app/properties/permissions/properties/secrets.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/deployment/properties/performe
 * d_via_github_app/properties/permissions/properties/secrets
 */
@Serializable(with = InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e.Serializer::class)
public sealed class InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e) {
      encoder.encodeString(value.value)
    }
  }
}
