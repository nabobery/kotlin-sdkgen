package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Image detail level for vision models. `original` is an OpenRouter extension (not in the OpenAI Chat Completions spec)
 * requesting true original-resolution media; it is downgraded to `high` for providers that lack an original-resolution
 * tier.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentImage/properties/image_url/properties/detail
 */
@Serializable(with = InlineChatContentImageImageUrlDetailX1fab6428.Serializer::class)
public sealed class InlineChatContentImageImageUrlDetailX1fab6428 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineChatContentImageImageUrlDetailX1fab6428() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineChatContentImageImageUrlDetailX1fab6428() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineChatContentImageImageUrlDetailX1fab6428() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `original`.
   */
  public data object Original : InlineChatContentImageImageUrlDetailX1fab6428() {
    public override val `value`: String = "original"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatContentImageImageUrlDetailX1fab6428()

  public companion object {
    public fun fromValue(`value`: String): InlineChatContentImageImageUrlDetailX1fab6428 = when (value) {
      Auto.value -> Auto
      Low.value -> Low
      High.value -> High
      Original.value -> Original
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatContentImageImageUrlDetailX1fab6428> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatContentImageImageUrlDetailX1fab6428", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatContentImageImageUrlDetailX1fab6428 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatContentImageImageUrlDetailX1fab6428) {
      encoder.encodeString(value.value)
    }
  }
}
