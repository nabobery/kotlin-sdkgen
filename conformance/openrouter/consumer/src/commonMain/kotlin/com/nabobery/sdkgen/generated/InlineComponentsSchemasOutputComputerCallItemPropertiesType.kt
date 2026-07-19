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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputComputerCallItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputComputerCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputComputerCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `computer_call`.
   */
  public data object ComputerCall : InlineComponentsSchemasOutputComputerCallItemPropertiesType() {
    public override val `value`: String = "computer_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputComputerCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputComputerCallItemPropertiesType = when (value) {
      ComputerCall.value -> ComputerCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputComputerCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputComputerCallItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputComputerCallItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputComputerCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
