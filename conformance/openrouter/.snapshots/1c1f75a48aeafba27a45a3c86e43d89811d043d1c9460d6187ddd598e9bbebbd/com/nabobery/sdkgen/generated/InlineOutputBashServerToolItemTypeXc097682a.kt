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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputBashServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputBashServerToolItem/properties/type
 */
@Serializable(with = InlineOutputBashServerToolItemTypeXc097682a.Serializer::class)
public sealed class InlineOutputBashServerToolItemTypeXc097682a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:bash`.
   */
  public data object OpenrouterBash : InlineOutputBashServerToolItemTypeXc097682a() {
    public override val `value`: String = "openrouter:bash"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputBashServerToolItemTypeXc097682a()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputBashServerToolItemTypeXc097682a = when (value) {
      OpenrouterBash.value -> OpenrouterBash
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputBashServerToolItemTypeXc097682a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputBashServerToolItemTypeXc097682a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputBashServerToolItemTypeXc097682a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputBashServerToolItemTypeXc097682a) {
      encoder.encodeString(value.value)
    }
  }
}
