package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesPingEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesPingEvent/properties/type
 */
@Serializable(with = InlineMessagesPingEventTypeX731a5908.Serializer::class)
public sealed class InlineMessagesPingEventTypeX731a5908 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ping`.
   */
  public data object Ping : InlineMessagesPingEventTypeX731a5908() {
    public override val `value`: String = "ping"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesPingEventTypeX731a5908()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesPingEventTypeX731a5908 = when (value) {
      Ping.value -> Ping
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesPingEventTypeX731a5908> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesPingEventTypeX731a5908", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesPingEventTypeX731a5908 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesPingEventTypeX731a5908) {
      encoder.encodeString(value.value)
    }
  }
}
