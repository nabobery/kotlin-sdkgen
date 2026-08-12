package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/sort-starred/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/sort-starred/schema
 */
@Serializable(with = InlineSortStarredParameterX5e5fb92b.Serializer::class)
public sealed class InlineSortStarredParameterX5e5fb92b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineSortStarredParameterX5e5fb92b() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineSortStarredParameterX5e5fb92b() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSortStarredParameterX5e5fb92b()

  public companion object {
    public fun fromValue(`value`: String): InlineSortStarredParameterX5e5fb92b = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSortStarredParameterX5e5fb92b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSortStarredParameterX5e5fb92b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSortStarredParameterX5e5fb92b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSortStarredParameterX5e5fb92b) {
      encoder.encodeString(value.value)
    }
  }
}
