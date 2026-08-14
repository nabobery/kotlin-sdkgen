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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/author_association
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730 = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledPullRequestAuthorAssociationXe5f7c730) {
      encoder.encodeString(value.value)
    }
  }
}
