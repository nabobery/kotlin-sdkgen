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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/he
 * ad_repository/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/he
 * ad_repository/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee.Serializer::class)
public sealed class InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryOwnerTypeX9c5d54ee) {
      encoder.encodeString(value.value)
    }
  }
}
