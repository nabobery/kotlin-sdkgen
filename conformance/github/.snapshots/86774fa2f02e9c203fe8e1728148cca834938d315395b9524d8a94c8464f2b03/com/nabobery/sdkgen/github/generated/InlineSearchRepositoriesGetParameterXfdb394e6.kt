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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1search~1repositories/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1repositories/get/parameters/1/schema
 */
@Serializable(with = InlineSearchRepositoriesGetParameterXfdb394e6.Serializer::class)
public sealed class InlineSearchRepositoriesGetParameterXfdb394e6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `stars`.
   */
  public data object Stars : InlineSearchRepositoriesGetParameterXfdb394e6() {
    public override val `value`: String = "stars"
  }

  /**
   * Documented value. Wire value: `forks`.
   */
  public data object Forks : InlineSearchRepositoriesGetParameterXfdb394e6() {
    public override val `value`: String = "forks"
  }

  /**
   * Documented value. Wire value: `help-wanted-issues`.
   */
  public data object HelpWantedIssues : InlineSearchRepositoriesGetParameterXfdb394e6() {
    public override val `value`: String = "help-wanted-issues"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineSearchRepositoriesGetParameterXfdb394e6() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchRepositoriesGetParameterXfdb394e6()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchRepositoriesGetParameterXfdb394e6 = when (value) {
      Stars.value -> Stars
      Forks.value -> Forks
      HelpWantedIssues.value -> HelpWantedIssues
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSearchRepositoriesGetParameterXfdb394e6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSearchRepositoriesGetParameterXfdb394e6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchRepositoriesGetParameterXfdb394e6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchRepositoriesGetParameterXfdb394e6) {
      encoder.encodeString(value.value)
    }
  }
}
