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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputDatetimeItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputDatetimeItem/properties/type
 */
@Serializable(with = InlineOutputDatetimeItemTypeXb3ed5cc0.Serializer::class)
public sealed class InlineOutputDatetimeItemTypeXb3ed5cc0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:datetime`.
   */
  public data object OpenrouterDatetime : InlineOutputDatetimeItemTypeXb3ed5cc0() {
    public override val `value`: String = "openrouter:datetime"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputDatetimeItemTypeXb3ed5cc0()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputDatetimeItemTypeXb3ed5cc0 = when (value) {
      OpenrouterDatetime.value -> OpenrouterDatetime
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputDatetimeItemTypeXb3ed5cc0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputDatetimeItemTypeXb3ed5cc0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputDatetimeItemTypeXb3ed5cc0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputDatetimeItemTypeXb3ed5cc0) {
      encoder.encodeString(value.value)
    }
  }
}
