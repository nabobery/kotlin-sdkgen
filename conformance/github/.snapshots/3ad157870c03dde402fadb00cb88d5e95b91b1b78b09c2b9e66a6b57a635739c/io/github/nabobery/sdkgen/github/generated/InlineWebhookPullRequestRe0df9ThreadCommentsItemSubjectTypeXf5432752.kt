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
 * The level at which the comment is targeted, can be a diff line or a file.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread/proper
 * ties/comments/items/properties/subject_type
 */
@Serializable(with = InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752.Serializer::class)
public sealed class InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `line`.
   */
  public data object Line : InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752() {
    public override val `value`: String = "line"
  }

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752 = when (value) {
      Line.value -> Line
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0df9ThreadCommentsItemSubjectTypeXf5432752) {
      encoder.encodeString(value.value)
    }
  }
}
