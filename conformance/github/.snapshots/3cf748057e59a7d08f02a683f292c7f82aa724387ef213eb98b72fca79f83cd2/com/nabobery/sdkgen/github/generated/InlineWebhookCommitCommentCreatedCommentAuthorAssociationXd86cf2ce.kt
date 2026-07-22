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
 * How the author is associated with the repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-commit-comment-created/properties/comment/properties/author_
 * association
 */
@Serializable(with = InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce.Serializer::class)
public sealed class InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce = when (value) {
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

  public object Serializer : KSerializer<InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCommitCommentCreatedCommentAuthorAssociationXd86cf2ce) {
      encoder.encodeString(value.value)
    }
  }
}
