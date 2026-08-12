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
 * d_via_github_app/properties/permissions/properties/content_references.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/deployment/properties/performe
 * d_via_github_app/properties/permissions/properties/content_references
 */
@Serializable(with = InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408.Serializer::class)
public sealed class InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408) {
      encoder.encodeString(value.value)
    }
  }
}
