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
 * properties/permissions/properties/repository_hooks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/repository_hooks
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038.Serializer::class)
public sealed class InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038) {
      encoder.encodeString(value.value)
    }
  }
}
