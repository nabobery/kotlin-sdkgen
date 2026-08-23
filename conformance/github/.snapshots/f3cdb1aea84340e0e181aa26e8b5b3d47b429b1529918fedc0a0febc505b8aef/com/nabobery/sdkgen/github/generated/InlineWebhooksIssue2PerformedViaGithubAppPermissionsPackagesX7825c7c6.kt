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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/performed_via_github_app/properties/perm
 * issions/properties/packages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/performed_via_github_app/properties/perm
 * issions/properties/packages
 */
@Serializable(with = InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6.Serializer::class)
public sealed class InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6) {
      encoder.encodeString(value.value)
    }
  }
}
