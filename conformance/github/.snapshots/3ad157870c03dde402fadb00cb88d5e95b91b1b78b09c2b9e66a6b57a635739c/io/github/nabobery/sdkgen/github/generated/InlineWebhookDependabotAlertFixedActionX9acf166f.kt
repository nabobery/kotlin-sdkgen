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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-fixed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-fixed/properties/action
 */
@Serializable(with = InlineWebhookDependabotAlertFixedActionX9acf166f.Serializer::class)
public sealed class InlineWebhookDependabotAlertFixedActionX9acf166f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineWebhookDependabotAlertFixedActionX9acf166f() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDependabotAlertFixedActionX9acf166f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDependabotAlertFixedActionX9acf166f = when (value) {
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDependabotAlertFixedActionX9acf166f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDependabotAlertFixedActionX9acf166f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDependabotAlertFixedActionX9acf166f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDependabotAlertFixedActionX9acf166f) {
      encoder.encodeString(value.value)
    }
  }
}
