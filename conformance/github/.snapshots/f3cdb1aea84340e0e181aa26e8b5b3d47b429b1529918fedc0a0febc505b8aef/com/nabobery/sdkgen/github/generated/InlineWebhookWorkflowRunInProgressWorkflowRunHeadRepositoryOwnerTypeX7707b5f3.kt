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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * head_repository/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * head_repository/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3.Serializer::class)
public sealed class InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerTypeX7707b5f3) {
      encoder.encodeString(value.value)
    }
  }
}
