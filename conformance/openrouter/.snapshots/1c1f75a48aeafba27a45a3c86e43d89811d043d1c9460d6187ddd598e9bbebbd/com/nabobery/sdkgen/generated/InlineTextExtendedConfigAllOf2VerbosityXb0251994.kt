package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/TextExtendedConfig/allOf/1/properties/verbosity.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TextExtendedConfig/allOf/1/properties/verbosity
 */
@Serializable(with = InlineTextExtendedConfigAllOf2VerbosityXb0251994.Serializer::class)
public sealed class InlineTextExtendedConfigAllOf2VerbosityXb0251994 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineTextExtendedConfigAllOf2VerbosityXb0251994() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineTextExtendedConfigAllOf2VerbosityXb0251994() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineTextExtendedConfigAllOf2VerbosityXb0251994() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineTextExtendedConfigAllOf2VerbosityXb0251994() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineTextExtendedConfigAllOf2VerbosityXb0251994() {
    public override val `value`: String = "max"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTextExtendedConfigAllOf2VerbosityXb0251994()

  public companion object {
    public fun fromValue(`value`: String): InlineTextExtendedConfigAllOf2VerbosityXb0251994 = when (value) {
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      Xhigh.value -> Xhigh
      Max.value -> Max
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTextExtendedConfigAllOf2VerbosityXb0251994> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineTextExtendedConfigAllOf2VerbosityXb0251994", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTextExtendedConfigAllOf2VerbosityXb0251994 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTextExtendedConfigAllOf2VerbosityXb0251994) {
      encoder.encodeString(value.value)
    }
  }
}
