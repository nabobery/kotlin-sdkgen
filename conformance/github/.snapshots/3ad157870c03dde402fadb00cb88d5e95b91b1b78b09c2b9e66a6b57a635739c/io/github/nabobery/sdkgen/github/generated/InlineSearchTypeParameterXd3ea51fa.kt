package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/search-type/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/search-type/schema
 */
@Serializable(with = InlineSearchTypeParameterXd3ea51fa.Serializer::class)
public sealed class InlineSearchTypeParameterXd3ea51fa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `semantic`.
   */
  public data object Semantic : InlineSearchTypeParameterXd3ea51fa() {
    public override val `value`: String = "semantic"
  }

  /**
   * Documented value. Wire value: `hybrid`.
   */
  public data object Hybrid : InlineSearchTypeParameterXd3ea51fa() {
    public override val `value`: String = "hybrid"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchTypeParameterXd3ea51fa()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchTypeParameterXd3ea51fa = when (value) {
      Semantic.value -> Semantic
      Hybrid.value -> Hybrid
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSearchTypeParameterXd3ea51fa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSearchTypeParameterXd3ea51fa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchTypeParameterXd3ea51fa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchTypeParameterXd3ea51fa) {
      encoder.encodeString(value.value)
    }
  }
}
