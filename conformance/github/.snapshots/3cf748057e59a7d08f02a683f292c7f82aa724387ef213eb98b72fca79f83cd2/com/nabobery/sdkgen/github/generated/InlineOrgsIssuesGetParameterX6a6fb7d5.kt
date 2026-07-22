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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1issues/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1issues/get/parameters/5/schema
 */
@Serializable(with = InlineOrgsIssuesGetParameterX6a6fb7d5.Serializer::class)
public sealed class InlineOrgsIssuesGetParameterX6a6fb7d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineOrgsIssuesGetParameterX6a6fb7d5() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineOrgsIssuesGetParameterX6a6fb7d5() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `comments`.
   */
  public data object Comments : InlineOrgsIssuesGetParameterX6a6fb7d5() {
    public override val `value`: String = "comments"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsIssuesGetParameterX6a6fb7d5()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsIssuesGetParameterX6a6fb7d5 = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Comments.value -> Comments
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsIssuesGetParameterX6a6fb7d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsIssuesGetParameterX6a6fb7d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsIssuesGetParameterX6a6fb7d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsIssuesGetParameterX6a6fb7d5) {
      encoder.encodeString(value.value)
    }
  }
}
