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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1issues/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1issues/get/parameters/3/schema
 */
@Serializable(with = InlineIssuesGetParameterXf98b6293.Serializer::class)
public sealed class InlineIssuesGetParameterXf98b6293 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineIssuesGetParameterXf98b6293() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineIssuesGetParameterXf98b6293() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `comments`.
   */
  public data object Comments : InlineIssuesGetParameterXf98b6293() {
    public override val `value`: String = "comments"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuesGetParameterXf98b6293()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuesGetParameterXf98b6293 = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Comments.value -> Comments
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuesGetParameterXf98b6293> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineIssuesGetParameterXf98b6293", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuesGetParameterXf98b6293 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuesGetParameterXf98b6293) {
      encoder.encodeString(value.value)
    }
  }
}
