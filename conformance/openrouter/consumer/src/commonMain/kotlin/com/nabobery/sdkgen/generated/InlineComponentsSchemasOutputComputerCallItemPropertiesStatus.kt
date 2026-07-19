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
 */
@Serializable(with = InlineComponentsSchemasOutputComputerCallItemPropertiesStatus.Serializer::class)
public sealed class InlineComponentsSchemasOutputComputerCallItemPropertiesStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineComponentsSchemasOutputComputerCallItemPropertiesStatus() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineComponentsSchemasOutputComputerCallItemPropertiesStatus() {
    public override val `value`: String = "incomplete"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineComponentsSchemasOutputComputerCallItemPropertiesStatus() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputComputerCallItemPropertiesStatus()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputComputerCallItemPropertiesStatus =
      when (value) {
      Completed.value -> Completed
      Incomplete.value -> Incomplete
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputComputerCallItemPropertiesStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputComputerCallItemPropertiesStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputComputerCallItemPropertiesStatus =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputComputerCallItemPropertiesStatus) {
      encoder.encodeString(value.value)
    }
  }
}
