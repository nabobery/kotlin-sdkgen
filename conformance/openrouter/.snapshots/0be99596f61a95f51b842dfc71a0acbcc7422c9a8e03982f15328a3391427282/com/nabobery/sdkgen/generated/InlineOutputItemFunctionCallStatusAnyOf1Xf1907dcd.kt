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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status/anyOf/0
 */
@Serializable(with = InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd.Serializer::class)
public sealed class InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd) {
      encoder.encodeString(value.value)
    }
  }
}
