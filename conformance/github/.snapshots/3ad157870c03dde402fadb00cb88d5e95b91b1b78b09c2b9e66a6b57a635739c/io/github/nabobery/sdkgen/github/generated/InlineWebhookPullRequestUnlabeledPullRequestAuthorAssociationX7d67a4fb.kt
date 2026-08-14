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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/au
 * thor_association
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb.Serializer::class)
public sealed class InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestAuthorAssociationX7d67a4fb) {
      encoder.encodeString(value.value)
    }
  }
}
