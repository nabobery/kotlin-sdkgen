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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sub-issues-sub-issue-removed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sub-issues-sub-issue-removed/properties/action
 */
@Serializable(with = InlineWebhookSubIssuesSubIssueRemovedActionX7e4a7186.Serializer::class)
public sealed class InlineWebhookSubIssuesSubIssueRemovedActionX7e4a7186 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `sub_issue_removed`.
   */
  public data object SubIssueRemoved : InlineWebhookSubIssuesSubIssueRemovedActionX7e4a7186() {
    public override val `value`: String = "sub_issue_removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSubIssuesSubIssueRemovedActionX7e4a7186()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSubIssuesSubIssueRemovedActionX7e4a7186 = when (value) {
      SubIssueRemoved.value -> SubIssueRemoved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSubIssuesSubIssueRemovedActionX7e4a7186> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSubIssuesSubIssueRemovedActionX7e4a7186", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSubIssuesSubIssueRemovedActionX7e4a7186 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSubIssuesSubIssueRemovedActionX7e4a7186) {
      encoder.encodeString(value.value)
    }
  }
}
