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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/packages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/packages
 */
@Serializable(with = InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd.Serializer::class)
public sealed class InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd) {
      encoder.encodeString(value.value)
    }
  }
}
