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
 * How the author is associated with the repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/aut
 * hor_association
 */
@Serializable(with = InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154.Serializer::class)
public sealed class InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154 = when (value) {
      Collaborator.value -> Collaborator
      Contributor.value -> Contributor
      FirstTimer.value -> FirstTimer
      FirstTimeContributor.value -> FirstTimeContributor
      Mannequin.value -> Mannequin
      Member.value -> Member
      None.value -> None
      Owner.value -> Owner
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentPinnedIssueAllOf1AuthorAssociationX6bf9a154) {
      encoder.encodeString(value.value)
    }
  }
}
