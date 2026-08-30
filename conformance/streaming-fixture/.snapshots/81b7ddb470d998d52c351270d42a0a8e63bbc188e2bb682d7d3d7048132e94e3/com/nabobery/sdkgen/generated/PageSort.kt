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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PageSort.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PageSort
 */
@Serializable(with = PageSort.Serializer::class)
public sealed class PageSort {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created_at`.
   */
  public data object CreatedAt : PageSort() {
    public override val `value`: String = "created_at"
  }

  /**
   * Documented value. Wire value: `filename`.
   */
  public data object Filename : PageSort() {
    public override val `value`: String = "filename"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : PageSort()

  public companion object {
    public fun fromValue(`value`: String): PageSort = when (value) {
      CreatedAt.value -> CreatedAt
      Filename.value -> Filename
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<PageSort> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.PageSort", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): PageSort = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: PageSort) {
      encoder.encodeString(value.value)
    }
  }
}
