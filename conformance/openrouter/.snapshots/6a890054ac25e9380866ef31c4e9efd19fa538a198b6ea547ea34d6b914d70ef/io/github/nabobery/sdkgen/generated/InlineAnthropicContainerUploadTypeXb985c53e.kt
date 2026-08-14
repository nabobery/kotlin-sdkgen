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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicContainerUpload/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicContainerUpload/properties/type
 */
@Serializable(with = InlineAnthropicContainerUploadTypeXb985c53e.Serializer::class)
public sealed class InlineAnthropicContainerUploadTypeXb985c53e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `container_upload`.
   */
  public data object ContainerUpload : InlineAnthropicContainerUploadTypeXb985c53e() {
    public override val `value`: String = "container_upload"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicContainerUploadTypeXb985c53e()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicContainerUploadTypeXb985c53e = when (value) {
      ContainerUpload.value -> ContainerUpload
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicContainerUploadTypeXb985c53e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicContainerUploadTypeXb985c53e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicContainerUploadTypeXb985c53e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicContainerUploadTypeXb985c53e) {
      encoder.encodeString(value.value)
    }
  }
}
