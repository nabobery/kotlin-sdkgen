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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/author_associati
 * on
 */
@Serializable(with = InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e.Serializer::class)
public sealed class InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssueAuthorAssociationXd7cc458e) {
      encoder.encodeString(value.value)
    }
  }
}
