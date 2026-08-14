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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ChatFormatJsonObjectConfig/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFormatJsonObjectConfig/properties/type
 */
@Serializable(with = InlineChatFormatJsonObjectConfigTypeX6978e247.Serializer::class)
public sealed class InlineChatFormatJsonObjectConfigTypeX6978e247 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_object`.
   */
  public data object JsonObject : InlineChatFormatJsonObjectConfigTypeX6978e247() {
    public override val `value`: String = "json_object"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatFormatJsonObjectConfigTypeX6978e247()

  public companion object {
    public fun fromValue(`value`: String): InlineChatFormatJsonObjectConfigTypeX6978e247 = when (value) {
      JsonObject.value -> JsonObject
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatFormatJsonObjectConfigTypeX6978e247> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatFormatJsonObjectConfigTypeX6978e247", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatFormatJsonObjectConfigTypeX6978e247 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatFormatJsonObjectConfigTypeX6978e247) {
      encoder.encodeString(value.value)
    }
  }
}
