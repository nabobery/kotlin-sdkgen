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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/he
 * ad_repository/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/he
 * ad_repository/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee.Serializer::class)
public sealed class InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunHeadRepositoryOwnerTypeX47a476ee) {
      encoder.encodeString(value.value)
    }
  }
}
