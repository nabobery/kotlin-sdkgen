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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/author_association
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestAuthorAssociationX86e9778b) {
      encoder.encodeString(value.value)
    }
  }
}
