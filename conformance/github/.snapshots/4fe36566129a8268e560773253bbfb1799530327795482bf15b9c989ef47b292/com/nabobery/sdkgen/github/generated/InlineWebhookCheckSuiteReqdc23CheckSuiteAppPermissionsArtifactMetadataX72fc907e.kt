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
 * properties/permissions/properties/artifact_metadata.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/artifact_metadata
 */
@Serializable(with = InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e.Serializer::class)
public sealed class InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e) {
      encoder.encodeString(value.value)
    }
  }
}
