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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/DatetimeServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DatetimeServerTool/properties/type
 */
@Serializable(with = InlineDatetimeServerToolTypeX363f59d3.Serializer::class)
public sealed class InlineDatetimeServerToolTypeX363f59d3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:datetime`.
   */
  public data object OpenrouterDatetime : InlineDatetimeServerToolTypeX363f59d3() {
    public override val `value`: String = "openrouter:datetime"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDatetimeServerToolTypeX363f59d3()

  public companion object {
    public fun fromValue(`value`: String): InlineDatetimeServerToolTypeX363f59d3 = when (value) {
      OpenrouterDatetime.value -> OpenrouterDatetime
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDatetimeServerToolTypeX363f59d3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineDatetimeServerToolTypeX363f59d3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDatetimeServerToolTypeX363f59d3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDatetimeServerToolTypeX363f59d3) {
      encoder.encodeString(value.value)
    }
  }
}
