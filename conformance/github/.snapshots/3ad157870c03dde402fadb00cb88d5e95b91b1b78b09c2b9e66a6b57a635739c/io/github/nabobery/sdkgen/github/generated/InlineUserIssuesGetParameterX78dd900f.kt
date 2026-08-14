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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1user~1issues/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1issues/get/parameters/0/schema
 */
@Serializable(with = InlineUserIssuesGetParameterX78dd900f.Serializer::class)
public sealed class InlineUserIssuesGetParameterX78dd900f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assigned`.
   */
  public data object Assigned : InlineUserIssuesGetParameterX78dd900f() {
    public override val `value`: String = "assigned"
  }

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineUserIssuesGetParameterX78dd900f() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `mentioned`.
   */
  public data object Mentioned : InlineUserIssuesGetParameterX78dd900f() {
    public override val `value`: String = "mentioned"
  }

  /**
   * Documented value. Wire value: `subscribed`.
   */
  public data object Subscribed : InlineUserIssuesGetParameterX78dd900f() {
    public override val `value`: String = "subscribed"
  }

  /**
   * Documented value. Wire value: `repos`.
   */
  public data object Repos : InlineUserIssuesGetParameterX78dd900f() {
    public override val `value`: String = "repos"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineUserIssuesGetParameterX78dd900f() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserIssuesGetParameterX78dd900f()

  public companion object {
    public fun fromValue(`value`: String): InlineUserIssuesGetParameterX78dd900f = when (value) {
      Assigned.value -> Assigned
      Created.value -> Created
      Mentioned.value -> Mentioned
      Subscribed.value -> Subscribed
      Repos.value -> Repos
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserIssuesGetParameterX78dd900f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUserIssuesGetParameterX78dd900f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserIssuesGetParameterX78dd900f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserIssuesGetParameterX78dd900f) {
      encoder.encodeString(value.value)
    }
  }
}
