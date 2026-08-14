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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/sort/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/sort/schema
 */
@Serializable(with = InlineSortParameterX37db756f.Serializer::class)
public sealed class InlineSortParameterX37db756f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineSortParameterX37db756f() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineSortParameterX37db756f() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSortParameterX37db756f()

  public companion object {
    public fun fromValue(`value`: String): InlineSortParameterX37db756f = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSortParameterX37db756f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSortParameterX37db756f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSortParameterX37db756f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSortParameterX37db756f) {
      encoder.encodeString(value.value)
    }
  }
}
