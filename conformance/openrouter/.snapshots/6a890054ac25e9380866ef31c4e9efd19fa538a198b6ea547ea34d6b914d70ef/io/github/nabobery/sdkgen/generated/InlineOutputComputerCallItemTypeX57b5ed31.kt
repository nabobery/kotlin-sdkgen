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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputComputerCallItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputComputerCallItem/properties/type
 */
@Serializable(with = InlineOutputComputerCallItemTypeX57b5ed31.Serializer::class)
public sealed class InlineOutputComputerCallItemTypeX57b5ed31 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `computer_call`.
   */
  public data object ComputerCall : InlineOutputComputerCallItemTypeX57b5ed31() {
    public override val `value`: String = "computer_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputComputerCallItemTypeX57b5ed31()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputComputerCallItemTypeX57b5ed31 = when (value) {
      ComputerCall.value -> ComputerCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputComputerCallItemTypeX57b5ed31> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputComputerCallItemTypeX57b5ed31", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputComputerCallItemTypeX57b5ed31 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputComputerCallItemTypeX57b5ed31) {
      encoder.encodeString(value.value)
    }
  }
}
