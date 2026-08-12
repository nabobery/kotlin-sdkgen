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
 * sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenFinishReasonIs/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenFinishReasonIs/properties/type
 */
@Serializable(with = InlineStopServerToolsWhenFinishReasonIsTypeX4550df21.Serializer::class)
public sealed class InlineStopServerToolsWhenFinishReasonIsTypeX4550df21 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `finish_reason_is`.
   */
  public data object FinishReasonIs : InlineStopServerToolsWhenFinishReasonIsTypeX4550df21() {
    public override val `value`: String = "finish_reason_is"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineStopServerToolsWhenFinishReasonIsTypeX4550df21()

  public companion object {
    public fun fromValue(`value`: String): InlineStopServerToolsWhenFinishReasonIsTypeX4550df21 = when (value) {
      FinishReasonIs.value -> FinishReasonIs
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineStopServerToolsWhenFinishReasonIsTypeX4550df21> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineStopServerToolsWhenFinishReasonIsTypeX4550df21", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineStopServerToolsWhenFinishReasonIsTypeX4550df21 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineStopServerToolsWhenFinishReasonIsTypeX4550df21) {
      encoder.encodeString(value.value)
    }
  }
}
