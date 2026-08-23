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
 * properties/permissions/properties/code_quality.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions/properties/code_quality
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad.Serializer::class)
public sealed class InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad) {
      encoder.encodeString(value.value)
    }
  }
}
