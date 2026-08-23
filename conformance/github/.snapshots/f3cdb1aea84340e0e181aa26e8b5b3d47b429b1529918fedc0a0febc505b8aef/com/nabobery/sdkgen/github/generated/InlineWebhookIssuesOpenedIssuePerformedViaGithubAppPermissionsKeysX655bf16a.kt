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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/keys.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions/properties/keys
 */
@Serializable(with = InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a.Serializer::class)
public sealed class InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a) {
      encoder.encodeString(value.value)
    }
  }
}
