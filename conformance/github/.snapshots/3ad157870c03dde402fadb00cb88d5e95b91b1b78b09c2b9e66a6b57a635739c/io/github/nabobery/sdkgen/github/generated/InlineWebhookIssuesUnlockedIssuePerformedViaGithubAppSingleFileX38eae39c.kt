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
 * thub_app/properties/permissions/properties/single_file.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/single_file
 */
@Serializable(with = InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c.Serializer::class)
public sealed class InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c) {
      encoder.encodeString(value.value)
    }
  }
}
