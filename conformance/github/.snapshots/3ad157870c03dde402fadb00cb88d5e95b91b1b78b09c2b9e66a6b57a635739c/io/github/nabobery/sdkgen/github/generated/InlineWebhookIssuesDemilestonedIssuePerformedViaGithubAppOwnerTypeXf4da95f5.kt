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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5.Serializer::class)
public sealed class InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppOwnerTypeXf4da95f5) {
      encoder.encodeString(value.value)
    }
  }
}
