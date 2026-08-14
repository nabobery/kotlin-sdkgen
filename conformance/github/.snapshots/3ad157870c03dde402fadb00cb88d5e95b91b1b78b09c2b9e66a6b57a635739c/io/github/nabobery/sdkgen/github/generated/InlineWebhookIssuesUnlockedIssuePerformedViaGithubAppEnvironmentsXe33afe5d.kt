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
 * thub_app/properties/permissions/properties/environments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/environments
 */
@Serializable(with = InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d.Serializer::class)
public sealed class InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d) {
      encoder.encodeString(value.value)
    }
  }
}
