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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1comments/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1comments/get/parameters/3/schema
 */
@Serializable(with = InlineReposIssuesCommentsGetParameterX399682d1.Serializer::class)
public sealed class InlineReposIssuesCommentsGetParameterX399682d1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineReposIssuesCommentsGetParameterX399682d1() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineReposIssuesCommentsGetParameterX399682d1() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposIssuesCommentsGetParameterX399682d1()

  public companion object {
    public fun fromValue(`value`: String): InlineReposIssuesCommentsGetParameterX399682d1 = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposIssuesCommentsGetParameterX399682d1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposIssuesCommentsGetParameterX399682d1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposIssuesCommentsGetParameterX399682d1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesCommentsGetParameterX399682d1) {
      encoder.encodeString(value.value)
    }
  }
}
