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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ShellCallItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ShellCallItem/properties/type
 */
@Serializable(with = InlineShellCallItemTypeX1764fed4.Serializer::class)
public sealed class InlineShellCallItemTypeX1764fed4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `shell_call`.
   */
  public data object ShellCall : InlineShellCallItemTypeX1764fed4() {
    public override val `value`: String = "shell_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineShellCallItemTypeX1764fed4()

  public companion object {
    public fun fromValue(`value`: String): InlineShellCallItemTypeX1764fed4 = when (value) {
      ShellCall.value -> ShellCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineShellCallItemTypeX1764fed4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineShellCallItemTypeX1764fed4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineShellCallItemTypeX1764fed4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineShellCallItemTypeX1764fed4) {
      encoder.encodeString(value.value)
    }
  }
}
