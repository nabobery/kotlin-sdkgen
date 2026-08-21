package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/display_name/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/display_name/anyOf/1
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902.Serializer::class)
public sealed class InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalLocationsPostRequestFormDisplayNameAnyOf2Xac728902) {
      encoder.encodeString(value.value)
    }
  }
}
