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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/assignees/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/assignees/items/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07.Serializer::class)
public sealed class InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReffb1OneOf1PullRequestAssigneesItemTypeXa860de07) {
      encoder.encodeString(value.value)
    }
  }
}
