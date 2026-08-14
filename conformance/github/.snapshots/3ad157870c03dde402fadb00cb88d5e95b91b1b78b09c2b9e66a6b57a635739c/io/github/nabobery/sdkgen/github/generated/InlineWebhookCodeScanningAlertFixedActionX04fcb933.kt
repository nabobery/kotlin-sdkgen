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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/action
 */
@Serializable(with = InlineWebhookCodeScanningAlertFixedActionX04fcb933.Serializer::class)
public sealed class InlineWebhookCodeScanningAlertFixedActionX04fcb933 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookCodeScanningAlertFixedActionX04fcb933() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCodeScanningAlertFixedActionX04fcb933()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCodeScanningAlertFixedActionX04fcb933 = when (value) {
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertFixedActionX04fcb933> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCodeScanningAlertFixedActionX04fcb933", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertFixedActionX04fcb933 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertFixedActionX04fcb933) {
      encoder.encodeString(value.value)
    }
  }
}
