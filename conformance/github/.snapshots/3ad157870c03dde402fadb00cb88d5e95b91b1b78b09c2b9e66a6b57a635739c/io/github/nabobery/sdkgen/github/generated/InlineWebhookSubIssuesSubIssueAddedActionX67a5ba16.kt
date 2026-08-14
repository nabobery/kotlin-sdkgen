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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sub-issues-sub-issue-added/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sub-issues-sub-issue-added/properties/action
 */
@Serializable(with = InlineWebhookSubIssuesSubIssueAddedActionX67a5ba16.Serializer::class)
public sealed class InlineWebhookSubIssuesSubIssueAddedActionX67a5ba16 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `sub_issue_added`.
   */
  public data object SubIssueAdded : InlineWebhookSubIssuesSubIssueAddedActionX67a5ba16() {
    public override val `value`: String = "sub_issue_added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSubIssuesSubIssueAddedActionX67a5ba16()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSubIssuesSubIssueAddedActionX67a5ba16 = when (value) {
      SubIssueAdded.value -> SubIssueAdded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSubIssuesSubIssueAddedActionX67a5ba16> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSubIssuesSubIssueAddedActionX67a5ba16", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSubIssuesSubIssueAddedActionX67a5ba16 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSubIssuesSubIssueAddedActionX67a5ba16) {
      encoder.encodeString(value.value)
    }
  }
}
