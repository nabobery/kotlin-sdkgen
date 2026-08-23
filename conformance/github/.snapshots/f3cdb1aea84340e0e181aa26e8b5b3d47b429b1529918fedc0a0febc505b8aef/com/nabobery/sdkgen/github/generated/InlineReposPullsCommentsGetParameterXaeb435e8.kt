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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1comments/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1comments/get/parameters/2/schema
 */
@Serializable(with = InlineReposPullsCommentsGetParameterXaeb435e8.Serializer::class)
public sealed class InlineReposPullsCommentsGetParameterXaeb435e8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineReposPullsCommentsGetParameterXaeb435e8() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineReposPullsCommentsGetParameterXaeb435e8() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `created_at`.
   */
  public data object CreatedAt : InlineReposPullsCommentsGetParameterXaeb435e8() {
    public override val `value`: String = "created_at"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsCommentsGetParameterXaeb435e8()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsCommentsGetParameterXaeb435e8 = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      CreatedAt.value -> CreatedAt
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsGetParameterXaeb435e8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsGetParameterXaeb435e8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsGetParameterXaeb435e8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsGetParameterXaeb435e8) {
      encoder.encodeString(value.value)
    }
  }
}
