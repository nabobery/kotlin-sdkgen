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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/au
 * thor_association
 */
@Serializable(with = InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d.Serializer::class)
public sealed class InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentCreatedIssueAllOf1AuthorAssociationX7630fd2d) {
      encoder.encodeString(value.value)
    }
  }
}
