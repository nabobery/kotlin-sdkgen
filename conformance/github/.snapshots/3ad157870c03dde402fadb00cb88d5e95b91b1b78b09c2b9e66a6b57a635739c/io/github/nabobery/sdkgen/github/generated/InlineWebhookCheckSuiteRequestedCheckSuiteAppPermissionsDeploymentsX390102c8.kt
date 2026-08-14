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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/deployments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/deployments
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8.Serializer::class)
public sealed class InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8) {
      encoder.encodeString(value.value)
    }
  }
}
