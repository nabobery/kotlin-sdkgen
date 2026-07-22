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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sub-issues-parent-issue-added/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sub-issues-parent-issue-added/properties/action
 */
@Serializable(with = InlineWebhookSubIssuesParentIssueAddedActionX178c9cea.Serializer::class)
public sealed class InlineWebhookSubIssuesParentIssueAddedActionX178c9cea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `parent_issue_added`.
   */
  public data object ParentIssueAdded : InlineWebhookSubIssuesParentIssueAddedActionX178c9cea() {
    public override val `value`: String = "parent_issue_added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSubIssuesParentIssueAddedActionX178c9cea()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSubIssuesParentIssueAddedActionX178c9cea = when (value) {
      ParentIssueAdded.value -> ParentIssueAdded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookSubIssuesParentIssueAddedActionX178c9cea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSubIssuesParentIssueAddedActionX178c9cea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSubIssuesParentIssueAddedActionX178c9cea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSubIssuesParentIssueAddedActionX178c9cea) {
      encoder.encodeString(value.value)
    }
  }
}
