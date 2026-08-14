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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77.Serializer::class)
public sealed class InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssuePerformedViaGithubAppOwnerTypeXe06bca77) {
      encoder.encodeString(value.value)
    }
  }
}
