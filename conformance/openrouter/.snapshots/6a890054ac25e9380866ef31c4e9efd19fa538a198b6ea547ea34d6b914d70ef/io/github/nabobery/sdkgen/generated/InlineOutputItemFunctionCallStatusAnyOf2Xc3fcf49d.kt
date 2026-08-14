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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status/anyOf/1
 */
@Serializable(with = InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d.Serializer::class)
public sealed class InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d() {
    public override val `value`: String = "incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d = when (value) {
      Incomplete.value -> Incomplete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d) {
      encoder.encodeString(value.value)
    }
  }
}
