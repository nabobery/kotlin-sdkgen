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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/action
 */
@Serializable(with = InlineWebhookIssueCommentCreatedActionX23868fdb.Serializer::class)
public sealed class InlineWebhookIssueCommentCreatedActionX23868fdb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookIssueCommentCreatedActionX23868fdb() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentCreatedActionX23868fdb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentCreatedActionX23868fdb = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentCreatedActionX23868fdb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentCreatedActionX23868fdb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentCreatedActionX23868fdb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentCreatedActionX23868fdb) {
      encoder.encodeString(value.value)
    }
  }
}
