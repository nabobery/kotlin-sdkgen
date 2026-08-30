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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatContentImage/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentImage/properties/type
 */
@Serializable(with = InlineChatContentImageTypeXff3cc541.Serializer::class)
public sealed class InlineChatContentImageTypeXff3cc541 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_url`.
   */
  public data object ImageUrl : InlineChatContentImageTypeXff3cc541() {
    public override val `value`: String = "image_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatContentImageTypeXff3cc541()

  public companion object {
    public fun fromValue(`value`: String): InlineChatContentImageTypeXff3cc541 = when (value) {
      ImageUrl.value -> ImageUrl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatContentImageTypeXff3cc541> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatContentImageTypeXff3cc541", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatContentImageTypeXff3cc541 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatContentImageTypeXff3cc541) {
      encoder.encodeString(value.value)
    }
  }
}
