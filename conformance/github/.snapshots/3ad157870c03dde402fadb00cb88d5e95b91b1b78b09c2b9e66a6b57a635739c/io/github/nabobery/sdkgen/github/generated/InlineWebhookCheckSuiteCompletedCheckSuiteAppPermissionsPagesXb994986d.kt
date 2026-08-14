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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/permissions/properties/pages.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/permissions/properties/pages
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d.Serializer::class)
public sealed class InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d) {
      encoder.encodeString(value.value)
    }
  }
}
