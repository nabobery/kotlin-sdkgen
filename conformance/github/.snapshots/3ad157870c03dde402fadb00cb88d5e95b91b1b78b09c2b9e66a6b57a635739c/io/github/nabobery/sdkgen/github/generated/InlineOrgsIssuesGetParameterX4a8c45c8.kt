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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1issues/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1issues/get/parameters/1/schema
 */
@Serializable(with = InlineOrgsIssuesGetParameterX4a8c45c8.Serializer::class)
public sealed class InlineOrgsIssuesGetParameterX4a8c45c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assigned`.
   */
  public data object Assigned : InlineOrgsIssuesGetParameterX4a8c45c8() {
    public override val `value`: String = "assigned"
  }

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineOrgsIssuesGetParameterX4a8c45c8() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `mentioned`.
   */
  public data object Mentioned : InlineOrgsIssuesGetParameterX4a8c45c8() {
    public override val `value`: String = "mentioned"
  }

  /**
   * Documented value. Wire value: `subscribed`.
   */
  public data object Subscribed : InlineOrgsIssuesGetParameterX4a8c45c8() {
    public override val `value`: String = "subscribed"
  }

  /**
   * Documented value. Wire value: `repos`.
   */
  public data object Repos : InlineOrgsIssuesGetParameterX4a8c45c8() {
    public override val `value`: String = "repos"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsIssuesGetParameterX4a8c45c8() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsIssuesGetParameterX4a8c45c8()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsIssuesGetParameterX4a8c45c8 = when (value) {
      Assigned.value -> Assigned
      Created.value -> Created
      Mentioned.value -> Mentioned
      Subscribed.value -> Subscribed
      Repos.value -> Repos
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsIssuesGetParameterX4a8c45c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsIssuesGetParameterX4a8c45c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsIssuesGetParameterX4a8c45c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsIssuesGetParameterX4a8c45c8) {
      encoder.encodeString(value.value)
    }
  }
}
