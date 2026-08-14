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
 * properties/permissions/properties/organization_hooks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/organization_hooks
 */
@Serializable(with = InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6.Serializer::class)
public sealed class InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6) {
      encoder.encodeString(value.value)
    }
  }
}
