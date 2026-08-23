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
 * d_via_github_app/properties/permissions/properties/single_file.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/deployment/properties/performe
 * d_via_github_app/properties/permissions/properties/single_file
 */
@Serializable(with = InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e.Serializer::class)
public sealed class InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e) {
      encoder.encodeString(value.value)
    }
  }
}
