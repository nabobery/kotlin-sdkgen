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
 * State of the issue; either 'open' or 'closed'
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/sta
 * te
 */
@Serializable(with = InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6.Serializer::class)
public sealed class InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentEditedIssueAllOf1StateX9cd22ab6) {
      encoder.encodeString(value.value)
    }
  }
}
