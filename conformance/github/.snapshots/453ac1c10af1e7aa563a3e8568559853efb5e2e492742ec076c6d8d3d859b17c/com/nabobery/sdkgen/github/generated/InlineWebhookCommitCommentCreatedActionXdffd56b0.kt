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
 * The action performed. Can be `created`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-commit-comment-created/properties/action
 */
@Serializable(with = InlineWebhookCommitCommentCreatedActionXdffd56b0.Serializer::class)
public sealed class InlineWebhookCommitCommentCreatedActionXdffd56b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookCommitCommentCreatedActionXdffd56b0() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCommitCommentCreatedActionXdffd56b0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCommitCommentCreatedActionXdffd56b0 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCommitCommentCreatedActionXdffd56b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCommitCommentCreatedActionXdffd56b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCommitCommentCreatedActionXdffd56b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCommitCommentCreatedActionXdffd56b0) {
      encoder.encodeString(value.value)
    }
  }
}
