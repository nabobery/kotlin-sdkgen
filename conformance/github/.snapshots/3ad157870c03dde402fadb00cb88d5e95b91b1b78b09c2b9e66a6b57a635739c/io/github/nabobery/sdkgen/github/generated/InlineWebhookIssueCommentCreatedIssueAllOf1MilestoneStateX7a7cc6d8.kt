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
 * The state of the milestone.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/mi
 * lestone/properties/state
 */
@Serializable(with = InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8.Serializer::class)
public sealed class InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentCreatedIssueAllOf1MilestoneStateX7a7cc6d8) {
      encoder.encodeString(value.value)
    }
  }
}
