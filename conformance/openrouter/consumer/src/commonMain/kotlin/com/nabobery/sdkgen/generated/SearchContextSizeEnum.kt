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
 * Size of the search context for web search tools
 */
@Serializable(with = SearchContextSizeEnum.Serializer::class)
public sealed class SearchContextSizeEnum {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : SearchContextSizeEnum() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : SearchContextSizeEnum() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : SearchContextSizeEnum() {
    public override val `value`: String = "high"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : SearchContextSizeEnum()

  public companion object {
    public fun fromValue(`value`: String): SearchContextSizeEnum = when (value) {
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<SearchContextSizeEnum> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.SearchContextSizeEnum", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): SearchContextSizeEnum = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: SearchContextSizeEnum) {
      encoder.encodeString(value.value)
    }
  }
}
