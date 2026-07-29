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
 * repository/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * repository/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18.Serializer::class)
public sealed class InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18) {
      encoder.encodeString(value.value)
    }
  }
}
