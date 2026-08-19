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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/type
 */
@Serializable(with = InlineCodeInterpreterServerToolTypeX77a72d83.Serializer::class)
public sealed class InlineCodeInterpreterServerToolTypeX77a72d83 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_interpreter`.
   */
  public data object CodeInterpreter : InlineCodeInterpreterServerToolTypeX77a72d83() {
    public override val `value`: String = "code_interpreter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeInterpreterServerToolTypeX77a72d83()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeInterpreterServerToolTypeX77a72d83 = when (value) {
      CodeInterpreter.value -> CodeInterpreter
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterServerToolTypeX77a72d83> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineCodeInterpreterServerToolTypeX77a72d83", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterServerToolTypeX77a72d83 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterServerToolTypeX77a72d83) {
      encoder.encodeString(value.value)
    }
  }
}
