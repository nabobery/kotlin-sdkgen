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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/actions-cache-list-sort/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/actions-cache-list-sort/schema
 */
@Serializable(with = InlineActionsCacheListSortParameterX01c4686c.Serializer::class)
public sealed class InlineActionsCacheListSortParameterX01c4686c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created_at`.
   */
  public data object CreatedAt : InlineActionsCacheListSortParameterX01c4686c() {
    public override val `value`: String = "created_at"
  }

  /**
   * Documented value. Wire value: `last_accessed_at`.
   */
  public data object LastAccessedAt : InlineActionsCacheListSortParameterX01c4686c() {
    public override val `value`: String = "last_accessed_at"
  }

  /**
   * Documented value. Wire value: `size_in_bytes`.
   */
  public data object SizeInBytes : InlineActionsCacheListSortParameterX01c4686c() {
    public override val `value`: String = "size_in_bytes"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineActionsCacheListSortParameterX01c4686c()

  public companion object {
    public fun fromValue(`value`: String): InlineActionsCacheListSortParameterX01c4686c = when (value) {
      CreatedAt.value -> CreatedAt
      LastAccessedAt.value -> LastAccessedAt
      SizeInBytes.value -> SizeInBytes
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineActionsCacheListSortParameterX01c4686c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineActionsCacheListSortParameterX01c4686c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineActionsCacheListSortParameterX01c4686c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineActionsCacheListSortParameterX01c4686c) {
      encoder.encodeString(value.value)
    }
  }
}
