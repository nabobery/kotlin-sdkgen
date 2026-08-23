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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputComputerCallItem/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputComputerCallItem/properties/status
 */
@Serializable(with = InlineOutputComputerCallItemStatusX68983861.Serializer::class)
public sealed class InlineOutputComputerCallItemStatusX68983861 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineOutputComputerCallItemStatusX68983861() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineOutputComputerCallItemStatusX68983861() {
    public override val `value`: String = "incomplete"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineOutputComputerCallItemStatusX68983861() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputComputerCallItemStatusX68983861()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputComputerCallItemStatusX68983861 = when (value) {
      Completed.value -> Completed
      Incomplete.value -> Incomplete
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputComputerCallItemStatusX68983861> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputComputerCallItemStatusX68983861", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputComputerCallItemStatusX68983861 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputComputerCallItemStatusX68983861) {
      encoder.encodeString(value.value)
    }
  }
}
