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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sub-issues-parent-issue-removed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sub-issues-parent-issue-removed/properties/action
 */
@Serializable(with = InlineWebhookSubIssuesParentIssueRemovedActionX7ac8c55f.Serializer::class)
public sealed class InlineWebhookSubIssuesParentIssueRemovedActionX7ac8c55f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `parent_issue_removed`.
   */
  public data object ParentIssueRemoved : InlineWebhookSubIssuesParentIssueRemovedActionX7ac8c55f() {
    public override val `value`: String = "parent_issue_removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSubIssuesParentIssueRemovedActionX7ac8c55f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSubIssuesParentIssueRemovedActionX7ac8c55f = when (value) {
      ParentIssueRemoved.value -> ParentIssueRemoved
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookSubIssuesParentIssueRemovedActionX7ac8c55f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSubIssuesParentIssueRemovedActionX7ac8c55f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSubIssuesParentIssueRemovedActionX7ac8c55f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSubIssuesParentIssueRemovedActionX7ac8c55f) {
      encoder.encodeString(value.value)
    }
  }
}
