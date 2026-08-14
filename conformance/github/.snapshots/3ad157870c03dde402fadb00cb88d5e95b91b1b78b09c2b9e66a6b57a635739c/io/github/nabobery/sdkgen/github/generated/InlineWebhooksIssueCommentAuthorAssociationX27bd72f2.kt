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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_comment/properties/author_association
 */
@Serializable(with = InlineWebhooksIssueCommentAuthorAssociationX27bd72f2.Serializer::class)
public sealed class InlineWebhooksIssueCommentAuthorAssociationX27bd72f2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhooksIssueCommentAuthorAssociationX27bd72f2() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhooksIssueCommentAuthorAssociationX27bd72f2() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhooksIssueCommentAuthorAssociationX27bd72f2() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhooksIssueCommentAuthorAssociationX27bd72f2() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhooksIssueCommentAuthorAssociationX27bd72f2() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhooksIssueCommentAuthorAssociationX27bd72f2() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhooksIssueCommentAuthorAssociationX27bd72f2() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhooksIssueCommentAuthorAssociationX27bd72f2() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssueCommentAuthorAssociationX27bd72f2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssueCommentAuthorAssociationX27bd72f2 = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhooksIssueCommentAuthorAssociationX27bd72f2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksIssueCommentAuthorAssociationX27bd72f2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssueCommentAuthorAssociationX27bd72f2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssueCommentAuthorAssociationX27bd72f2) {
      encoder.encodeString(value.value)
    }
  }
}
