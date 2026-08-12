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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/issues.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/issues
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805.Serializer::class)
public sealed class InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805) {
      encoder.encodeString(value.value)
    }
  }
}
