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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/aut
 * hor_association
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4.Serializer::class)
public sealed class InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4 = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestAuthorAssociationX1e23edc4) {
      encoder.encodeString(value.value)
    }
  }
}
