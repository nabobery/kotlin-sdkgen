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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-reintroduced/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-reintroduced/properties/action
 */
@Serializable(with = InlineWebhookDependabotAlertReintroducedActionX5eb72965.Serializer::class)
public sealed class InlineWebhookDependabotAlertReintroducedActionX5eb72965 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reintroduced`.
   */
  public data object Reintroduced : InlineWebhookDependabotAlertReintroducedActionX5eb72965() {
    public override val `value`: String = "reintroduced"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDependabotAlertReintroducedActionX5eb72965()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDependabotAlertReintroducedActionX5eb72965 = when (value) {
      Reintroduced.value -> Reintroduced
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDependabotAlertReintroducedActionX5eb72965> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDependabotAlertReintroducedActionX5eb72965", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDependabotAlertReintroducedActionX5eb72965 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDependabotAlertReintroducedActionX5eb72965) {
      encoder.encodeString(value.value)
    }
  }
}
