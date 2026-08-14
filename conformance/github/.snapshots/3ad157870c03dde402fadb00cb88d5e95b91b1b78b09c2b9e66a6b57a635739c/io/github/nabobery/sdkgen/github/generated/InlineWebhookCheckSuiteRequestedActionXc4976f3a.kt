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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/action
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedActionXc4976f3a.Serializer::class)
public sealed class InlineWebhookCheckSuiteRequestedActionXc4976f3a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookCheckSuiteRequestedActionXc4976f3a() {
    public override val `value`: String = "requested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteRequestedActionXc4976f3a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteRequestedActionXc4976f3a = when (value) {
      Requested.value -> Requested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedActionXc4976f3a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteRequestedActionXc4976f3a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedActionXc4976f3a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedActionXc4976f3a) {
      encoder.encodeString(value.value)
    }
  }
}
