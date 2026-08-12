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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/author_associati
 * on
 */
@Serializable(with = InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf.Serializer::class)
public sealed class InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedIssueAuthorAssociationXda9781cf) {
      encoder.encodeString(value.value)
    }
  }
}
