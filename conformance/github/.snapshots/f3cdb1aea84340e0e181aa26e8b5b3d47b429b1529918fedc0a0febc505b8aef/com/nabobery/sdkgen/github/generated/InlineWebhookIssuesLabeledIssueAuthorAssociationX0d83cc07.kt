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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/author_associatio
 * n
 */
@Serializable(with = InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07.Serializer::class)
public sealed class InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07 = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssueAuthorAssociationX0d83cc07) {
      encoder.encodeString(value.value)
    }
  }
}
