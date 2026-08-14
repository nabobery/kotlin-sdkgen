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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_issue/p
 * roperties/author_association
 */
@Serializable(with = InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd.Serializer::class)
public sealed class InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredChangesNewIssueAuthorAssociationX605535fd) {
      encoder.encodeString(value.value)
    }
  }
}
