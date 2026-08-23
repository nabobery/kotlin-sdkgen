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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/permissions/properties/repository_hooks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/permissions/properties/repository_hooks
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068.Serializer::class)
public sealed class InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068) {
      encoder.encodeString(value.value)
    }
  }
}
