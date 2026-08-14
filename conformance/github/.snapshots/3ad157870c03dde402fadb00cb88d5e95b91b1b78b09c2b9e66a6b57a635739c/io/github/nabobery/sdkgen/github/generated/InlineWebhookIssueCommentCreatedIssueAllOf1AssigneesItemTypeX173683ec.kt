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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/as
 * signees/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/as
 * signees/items/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec.Serializer::class)
public sealed class InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentCreatedIssueAllOf1AssigneesItemTypeX173683ec) {
      encoder.encodeString(value.value)
    }
  }
}
