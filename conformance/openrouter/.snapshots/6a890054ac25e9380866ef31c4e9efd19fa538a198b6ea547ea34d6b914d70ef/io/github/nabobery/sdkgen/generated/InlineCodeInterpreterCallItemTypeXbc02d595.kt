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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/type
 */
@Serializable(with = InlineCodeInterpreterCallItemTypeXbc02d595.Serializer::class)
public sealed class InlineCodeInterpreterCallItemTypeXbc02d595 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_interpreter_call`.
   */
  public data object CodeInterpreterCall : InlineCodeInterpreterCallItemTypeXbc02d595() {
    public override val `value`: String = "code_interpreter_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeInterpreterCallItemTypeXbc02d595()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeInterpreterCallItemTypeXbc02d595 = when (value) {
      CodeInterpreterCall.value -> CodeInterpreterCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterCallItemTypeXbc02d595> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineCodeInterpreterCallItemTypeXbc02d595", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterCallItemTypeXbc02d595 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterCallItemTypeXbc02d595) {
      encoder.encodeString(value.value)
    }
  }
}
