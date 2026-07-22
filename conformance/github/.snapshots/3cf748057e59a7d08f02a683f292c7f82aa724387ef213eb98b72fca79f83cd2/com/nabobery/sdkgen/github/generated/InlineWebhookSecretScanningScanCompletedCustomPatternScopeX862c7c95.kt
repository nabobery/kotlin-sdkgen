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
 * If the scan was triggered by a custom pattern update, this will be the scope of the pattern that was updated
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-scan-completed/properties/custom_pattern_sco
 * pe
 */
@Serializable(with = InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95.Serializer::class)
public sealed class InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95() {
    public override val `value`: String = "enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95 = when (value) {
      Repository.value -> Repository
      Organization.value -> Organization
      Enterprise.value -> Enterprise
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95) {
      encoder.encodeString(value.value)
    }
  }
}
