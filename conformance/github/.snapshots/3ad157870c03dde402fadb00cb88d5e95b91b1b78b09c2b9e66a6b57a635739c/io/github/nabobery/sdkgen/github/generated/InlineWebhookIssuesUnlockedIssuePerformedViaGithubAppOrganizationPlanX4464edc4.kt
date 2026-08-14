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
 * thub_app/properties/permissions/properties/organization_plan.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions/properties/organization_plan
 */
@Serializable(with = InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4.Serializer::class)
public sealed class InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4) {
      encoder.encodeString(value.value)
    }
  }
}
