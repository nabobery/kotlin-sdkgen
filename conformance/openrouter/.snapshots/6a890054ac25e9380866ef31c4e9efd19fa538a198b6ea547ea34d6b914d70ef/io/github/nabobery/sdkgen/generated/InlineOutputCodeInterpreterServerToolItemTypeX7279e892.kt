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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputCodeInterpreterServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputCodeInterpreterServerToolItem/properties/type
 */
@Serializable(with = InlineOutputCodeInterpreterServerToolItemTypeX7279e892.Serializer::class)
public sealed class InlineOutputCodeInterpreterServerToolItemTypeX7279e892 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:code_interpreter`.
   */
  public data object OpenrouterCodeInterpreter : InlineOutputCodeInterpreterServerToolItemTypeX7279e892() {
    public override val `value`: String = "openrouter:code_interpreter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputCodeInterpreterServerToolItemTypeX7279e892()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputCodeInterpreterServerToolItemTypeX7279e892 = when (value) {
      OpenrouterCodeInterpreter.value -> OpenrouterCodeInterpreter
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputCodeInterpreterServerToolItemTypeX7279e892> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputCodeInterpreterServerToolItemTypeX7279e892", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputCodeInterpreterServerToolItemTypeX7279e892 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputCodeInterpreterServerToolItemTypeX7279e892) {
      encoder.encodeString(value.value)
    }
  }
}
