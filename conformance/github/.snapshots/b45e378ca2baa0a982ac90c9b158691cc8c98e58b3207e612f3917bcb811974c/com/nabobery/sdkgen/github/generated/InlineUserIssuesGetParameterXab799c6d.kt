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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1user~1issues/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1issues/get/parameters/3/schema
 */
@Serializable(with = InlineUserIssuesGetParameterXab799c6d.Serializer::class)
public sealed class InlineUserIssuesGetParameterXab799c6d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineUserIssuesGetParameterXab799c6d() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineUserIssuesGetParameterXab799c6d() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `comments`.
   */
  public data object Comments : InlineUserIssuesGetParameterXab799c6d() {
    public override val `value`: String = "comments"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserIssuesGetParameterXab799c6d()

  public companion object {
    public fun fromValue(`value`: String): InlineUserIssuesGetParameterXab799c6d = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Comments.value -> Comments
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserIssuesGetParameterXab799c6d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserIssuesGetParameterXab799c6d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserIssuesGetParameterXab799c6d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserIssuesGetParameterXab799c6d) {
      encoder.encodeString(value.value)
    }
  }
}
