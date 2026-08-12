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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/assignees/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/assignees/items/properties/type
 */
@Serializable(with = InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af.Serializer::class)
public sealed class InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8fbbPullRequestAssigneesItemTypeXd1bdd2af) {
      encoder.encodeString(value.value)
    }
  }
}
