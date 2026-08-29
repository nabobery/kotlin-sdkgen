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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * pull_request_reviews_enforcement_level/properties/from.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * pull_request_reviews_enforcement_level/properties/from
 */
@Serializable(with = InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed.Serializer::class)
public sealed class InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed) {
      encoder.encodeString(value.value)
    }
  }
}
