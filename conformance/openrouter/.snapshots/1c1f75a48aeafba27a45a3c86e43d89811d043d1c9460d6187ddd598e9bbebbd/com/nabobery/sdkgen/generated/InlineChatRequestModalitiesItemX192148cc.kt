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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatRequest/properties/modalities/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatRequest/properties/modalities/items
 */
@Serializable(with = InlineChatRequestModalitiesItemX192148cc.Serializer::class)
public sealed class InlineChatRequestModalitiesItemX192148cc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineChatRequestModalitiesItemX192148cc() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineChatRequestModalitiesItemX192148cc() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `audio`.
   */
  public data object Audio : InlineChatRequestModalitiesItemX192148cc() {
    public override val `value`: String = "audio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatRequestModalitiesItemX192148cc()

  public companion object {
    public fun fromValue(`value`: String): InlineChatRequestModalitiesItemX192148cc = when (value) {
      Text.value -> Text
      Image.value -> Image
      Audio.value -> Audio
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatRequestModalitiesItemX192148cc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatRequestModalitiesItemX192148cc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatRequestModalitiesItemX192148cc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatRequestModalitiesItemX192148cc) {
      encoder.encodeString(value.value)
    }
  }
}
