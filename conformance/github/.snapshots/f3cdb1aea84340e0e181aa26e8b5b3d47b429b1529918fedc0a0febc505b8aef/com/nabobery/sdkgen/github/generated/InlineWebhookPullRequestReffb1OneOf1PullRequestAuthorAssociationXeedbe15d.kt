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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/author_association
 */
@Serializable(with = InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d.Serializer::class)
public sealed class InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReffb1OneOf1PullRequestAuthorAssociationXeedbe15d) {
      encoder.encodeString(value.value)
    }
  }
}
