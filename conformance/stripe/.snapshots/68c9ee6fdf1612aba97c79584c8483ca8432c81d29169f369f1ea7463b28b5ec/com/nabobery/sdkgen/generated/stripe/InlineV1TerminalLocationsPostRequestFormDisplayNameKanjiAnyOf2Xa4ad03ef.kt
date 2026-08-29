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
 * -form-urlencoded/schema/properties/display_name_kanji/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/display_name_kanji/anyOf/1
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef.Serializer::class)
public sealed class InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef) {
      encoder.encodeString(value.value)
    }
  }
}
