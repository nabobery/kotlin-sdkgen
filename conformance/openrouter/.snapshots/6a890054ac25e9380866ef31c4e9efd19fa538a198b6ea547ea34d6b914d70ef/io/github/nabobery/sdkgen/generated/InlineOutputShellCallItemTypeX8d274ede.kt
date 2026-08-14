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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallItem/properties/type
 */
@Serializable(with = InlineOutputShellCallItemTypeX8d274ede.Serializer::class)
public sealed class InlineOutputShellCallItemTypeX8d274ede {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell_call`.
   */
  public data object ShellCall : InlineOutputShellCallItemTypeX8d274ede() {
    public override val `value`: String = "shell_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputShellCallItemTypeX8d274ede()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputShellCallItemTypeX8d274ede = when (value) {
      ShellCall.value -> ShellCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputShellCallItemTypeX8d274ede> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputShellCallItemTypeX8d274ede", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputShellCallItemTypeX8d274ede = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputShellCallItemTypeX8d274ede) {
      encoder.encodeString(value.value)
    }
  }
}
