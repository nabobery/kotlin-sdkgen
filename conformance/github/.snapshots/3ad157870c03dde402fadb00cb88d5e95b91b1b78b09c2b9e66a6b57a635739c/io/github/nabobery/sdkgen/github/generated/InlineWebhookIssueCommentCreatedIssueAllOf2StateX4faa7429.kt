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
 * State of the issue; either 'open' or 'closed'
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/1/properties/st
 * ate
 */
@Serializable(with = InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429.Serializer::class)
public sealed class InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentCreatedIssueAllOf2StateX4faa7429) {
      encoder.encodeString(value.value)
    }
  }
}
