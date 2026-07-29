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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/get/parameters/10/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/get/parameters/10/schema
 */
@Serializable(with = InlineReposIssuesGetParameterX776dab1f.Serializer::class)
public sealed class InlineReposIssuesGetParameterX776dab1f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineReposIssuesGetParameterX776dab1f() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineReposIssuesGetParameterX776dab1f() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `comments`.
   */
  public data object Comments : InlineReposIssuesGetParameterX776dab1f() {
    public override val `value`: String = "comments"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposIssuesGetParameterX776dab1f()

  public companion object {
    public fun fromValue(`value`: String): InlineReposIssuesGetParameterX776dab1f = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Comments.value -> Comments
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposIssuesGetParameterX776dab1f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposIssuesGetParameterX776dab1f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposIssuesGetParameterX776dab1f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesGetParameterX776dab1f) {
      encoder.encodeString(value.value)
    }
  }
}
