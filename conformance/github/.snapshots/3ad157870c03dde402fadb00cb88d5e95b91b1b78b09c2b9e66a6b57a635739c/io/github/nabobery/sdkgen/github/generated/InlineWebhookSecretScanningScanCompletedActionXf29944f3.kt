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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-scan-completed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-scan-completed/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningScanCompletedActionXf29944f3.Serializer::class)
public sealed class InlineWebhookSecretScanningScanCompletedActionXf29944f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookSecretScanningScanCompletedActionXf29944f3() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningScanCompletedActionXf29944f3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningScanCompletedActionXf29944f3 = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecretScanningScanCompletedActionXf29944f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningScanCompletedActionXf29944f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningScanCompletedActionXf29944f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningScanCompletedActionXf29944f3) {
      encoder.encodeString(value.value)
    }
  }
}
