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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/aut
 * hor_association
 */
@Serializable(with = InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916.Serializer::class)
public sealed class InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916 = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentEditedIssueAllOf1AuthorAssociationX149c4916) {
      encoder.encodeString(value.value)
    }
  }
}
