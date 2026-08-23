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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/performed_via_github_app/properties/permissions/properties/administration.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/performed_via_github_app/properties/permissions/properties/administration
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3.Serializer::class)
public sealed class InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3) {
      encoder.encodeString(value.value)
    }
  }
}
