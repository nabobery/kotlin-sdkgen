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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/action
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedActionX8ffab6a7.Serializer::class)
public sealed class InlineWebhookCheckSuiteCompletedActionX8ffab6a7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookCheckSuiteCompletedActionX8ffab6a7() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteCompletedActionX8ffab6a7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteCompletedActionX8ffab6a7 = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedActionX8ffab6a7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteCompletedActionX8ffab6a7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedActionX8ffab6a7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedActionX8ffab6a7) {
      encoder.encodeString(value.value)
    }
  }
}
