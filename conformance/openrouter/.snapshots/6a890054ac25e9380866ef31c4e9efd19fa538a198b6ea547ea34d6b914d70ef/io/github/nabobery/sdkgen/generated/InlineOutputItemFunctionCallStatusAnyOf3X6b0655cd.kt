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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status/anyOf/2
 */
@Serializable(with = InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd.Serializer::class)
public sealed class InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd = when (value) {
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd) {
      encoder.encodeString(value.value)
    }
  }
}
