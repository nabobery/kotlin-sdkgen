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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/re
 * pository/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/re
 * pository/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a.Serializer::class)
public sealed class InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunRepositoryOwnerTypeXd7dbe77a) {
      encoder.encodeString(value.value)
    }
  }
}
