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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatFormatPythonConfig/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFormatPythonConfig/properties/type
 */
@Serializable(with = InlineChatFormatPythonConfigTypeX5069ebcf.Serializer::class)
public sealed class InlineChatFormatPythonConfigTypeX5069ebcf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `python`.
   */
  public data object Python : InlineChatFormatPythonConfigTypeX5069ebcf() {
    public override val `value`: String = "python"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatFormatPythonConfigTypeX5069ebcf()

  public companion object {
    public fun fromValue(`value`: String): InlineChatFormatPythonConfigTypeX5069ebcf = when (value) {
      Python.value -> Python
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatFormatPythonConfigTypeX5069ebcf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatFormatPythonConfigTypeX5069ebcf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatFormatPythonConfigTypeX5069ebcf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatFormatPythonConfigTypeX5069ebcf) {
      encoder.encodeString(value.value)
    }
  }
}
