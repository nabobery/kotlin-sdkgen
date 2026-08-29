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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-rerequested/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-rerequested/properties/action
 */
@Serializable(with = InlineWebhookCheckRunRerequestedActionX17f524d5.Serializer::class)
public sealed class InlineWebhookCheckRunRerequestedActionX17f524d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `rerequested`.
   */
  public data object Rerequested : InlineWebhookCheckRunRerequestedActionX17f524d5() {
    public override val `value`: String = "rerequested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckRunRerequestedActionX17f524d5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckRunRerequestedActionX17f524d5 = when (value) {
      Rerequested.value -> Rerequested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckRunRerequestedActionX17f524d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCheckRunRerequestedActionX17f524d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckRunRerequestedActionX17f524d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckRunRerequestedActionX17f524d5) {
      encoder.encodeString(value.value)
    }
  }
}
