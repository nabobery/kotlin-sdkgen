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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputDatetimeItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputDatetimeItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputDatetimeItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:datetime`.
   */
  public data object OpenrouterDatetime : InlineComponentsSchemasOutputDatetimeItemPropertiesType() {
    public override val `value`: String = "openrouter:datetime"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputDatetimeItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputDatetimeItemPropertiesType = when (value) {
      OpenrouterDatetime.value -> OpenrouterDatetime
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputDatetimeItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputDatetimeItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputDatetimeItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputDatetimeItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
