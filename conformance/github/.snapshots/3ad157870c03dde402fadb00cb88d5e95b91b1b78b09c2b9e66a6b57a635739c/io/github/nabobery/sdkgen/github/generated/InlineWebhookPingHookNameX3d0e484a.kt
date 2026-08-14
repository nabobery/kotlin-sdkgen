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
 * The type of webhook. The only valid value is 'web'.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-ping/properties/hook/properties/name
 */
@Serializable(with = InlineWebhookPingHookNameX3d0e484a.Serializer::class)
public sealed class InlineWebhookPingHookNameX3d0e484a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web`.
   */
  public data object Web : InlineWebhookPingHookNameX3d0e484a() {
    public override val `value`: String = "web"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPingHookNameX3d0e484a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPingHookNameX3d0e484a = when (value) {
      Web.value -> Web
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPingHookNameX3d0e484a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPingHookNameX3d0e484a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPingHookNameX3d0e484a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPingHookNameX3d0e484a) {
      encoder.encodeString(value.value)
    }
  }
}
