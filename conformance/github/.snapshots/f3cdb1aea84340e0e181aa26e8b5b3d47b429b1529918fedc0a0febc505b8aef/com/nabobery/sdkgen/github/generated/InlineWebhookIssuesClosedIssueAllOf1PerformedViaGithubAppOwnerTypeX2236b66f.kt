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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/0/properties/performed_
 * via_github_app/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/0/properties/performed_
 * via_github_app/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f.Serializer::class)
public sealed class InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppOwnerTypeX2236b66f) {
      encoder.encodeString(value.value)
    }
  }
}
