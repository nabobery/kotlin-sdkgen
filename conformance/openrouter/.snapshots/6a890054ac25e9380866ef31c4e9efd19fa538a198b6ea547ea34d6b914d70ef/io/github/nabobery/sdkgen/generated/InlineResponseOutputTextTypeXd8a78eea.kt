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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ResponseOutputText/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ResponseOutputText/properties/type
 */
@Serializable(with = InlineResponseOutputTextTypeXd8a78eea.Serializer::class)
public sealed class InlineResponseOutputTextTypeXd8a78eea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `output_text`.
   */
  public data object OutputText : InlineResponseOutputTextTypeXd8a78eea() {
    public override val `value`: String = "output_text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineResponseOutputTextTypeXd8a78eea()

  public companion object {
    public fun fromValue(`value`: String): InlineResponseOutputTextTypeXd8a78eea = when (value) {
      OutputText.value -> OutputText
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineResponseOutputTextTypeXd8a78eea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineResponseOutputTextTypeXd8a78eea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineResponseOutputTextTypeXd8a78eea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineResponseOutputTextTypeXd8a78eea) {
      encoder.encodeString(value.value)
    }
  }
}
