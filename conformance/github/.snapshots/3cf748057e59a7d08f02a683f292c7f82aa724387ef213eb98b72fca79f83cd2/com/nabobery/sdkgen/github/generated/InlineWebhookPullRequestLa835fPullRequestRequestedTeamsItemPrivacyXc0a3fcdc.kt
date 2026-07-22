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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/requ
 * ested_teams/items/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/requ
 * ested_teams/items/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc.Serializer::class)
public sealed class InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLa835fPullRequestRequestedTeamsItemPrivacyXc0a3fcdc) {
      encoder.encodeString(value.value)
    }
  }
}
