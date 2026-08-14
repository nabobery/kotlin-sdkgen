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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/mil
 * estone/properties/state
 */
@Serializable(with = InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a.Serializer::class)
public sealed class InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentEditedIssueAllOf1MilestoneStateX5bceee4a) {
      encoder.encodeString(value.value)
    }
  }
}
