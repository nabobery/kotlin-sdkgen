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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/assignees/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/assignees/items/properties/type
 */
@Serializable(with = InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef.Serializer::class)
public sealed class InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0df9PullRequestAssigneesItemTypeX77a3e8ef) {
      encoder.encodeString(value.value)
    }
  }
}
