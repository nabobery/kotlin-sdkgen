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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1issues/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1issues/get/parameters/0/schema
 */
@Serializable(with = InlineIssuesGetParameterX1847dbfc.Serializer::class)
public sealed class InlineIssuesGetParameterX1847dbfc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assigned`.
   */
  public data object Assigned : InlineIssuesGetParameterX1847dbfc() {
    public override val `value`: String = "assigned"
  }

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineIssuesGetParameterX1847dbfc() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `mentioned`.
   */
  public data object Mentioned : InlineIssuesGetParameterX1847dbfc() {
    public override val `value`: String = "mentioned"
  }

  /**
   * Documented value. Wire value: `subscribed`.
   */
  public data object Subscribed : InlineIssuesGetParameterX1847dbfc() {
    public override val `value`: String = "subscribed"
  }

  /**
   * Documented value. Wire value: `repos`.
   */
  public data object Repos : InlineIssuesGetParameterX1847dbfc() {
    public override val `value`: String = "repos"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineIssuesGetParameterX1847dbfc() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuesGetParameterX1847dbfc()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuesGetParameterX1847dbfc = when (value) {
      Assigned.value -> Assigned
      Created.value -> Created
      Mentioned.value -> Mentioned
      Subscribed.value -> Subscribed
      Repos.value -> Repos
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuesGetParameterX1847dbfc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineIssuesGetParameterX1847dbfc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuesGetParameterX1847dbfc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuesGetParameterX1847dbfc) {
      encoder.encodeString(value.value)
    }
  }
}
