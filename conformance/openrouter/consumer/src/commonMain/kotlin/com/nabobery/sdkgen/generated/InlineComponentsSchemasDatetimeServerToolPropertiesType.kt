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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/DatetimeServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasDatetimeServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasDatetimeServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:datetime`.
   */
  public data object OpenrouterDatetime : InlineComponentsSchemasDatetimeServerToolPropertiesType() {
    public override val `value`: String = "openrouter:datetime"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasDatetimeServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasDatetimeServerToolPropertiesType = when (value) {
      OpenrouterDatetime.value -> OpenrouterDatetime
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasDatetimeServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasDatetimeServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasDatetimeServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasDatetimeServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
