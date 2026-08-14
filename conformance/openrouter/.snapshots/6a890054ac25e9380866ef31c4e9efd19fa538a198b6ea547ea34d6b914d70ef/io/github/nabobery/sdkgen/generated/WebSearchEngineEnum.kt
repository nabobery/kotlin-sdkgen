package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Which search engine to use. "auto" (default) uses native if the provider supports it, otherwise Exa. "native" forces
 * the provider's built-in search. "exa" forces the Exa search API. "firecrawl" uses Firecrawl (requires BYOK).
 * "parallel" uses the Parallel search API. "perplexity" uses the Perplexity Search API (raw ranked results).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchEngineEnum
 */
@Serializable(with = WebSearchEngineEnum.Serializer::class)
public sealed class WebSearchEngineEnum {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `native`.
   */
  public data object Native : WebSearchEngineEnum() {
    public override val `value`: String = "native"
  }

  /**
   * Documented value. Wire value: `exa`.
   */
  public data object Exa : WebSearchEngineEnum() {
    public override val `value`: String = "exa"
  }

  /**
   * Documented value. Wire value: `parallel`.
   */
  public data object Parallel : WebSearchEngineEnum() {
    public override val `value`: String = "parallel"
  }

  /**
   * Documented value. Wire value: `firecrawl`.
   */
  public data object Firecrawl : WebSearchEngineEnum() {
    public override val `value`: String = "firecrawl"
  }

  /**
   * Documented value. Wire value: `perplexity`.
   */
  public data object Perplexity : WebSearchEngineEnum() {
    public override val `value`: String = "perplexity"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : WebSearchEngineEnum() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : WebSearchEngineEnum()

  public companion object {
    public fun fromValue(`value`: String): WebSearchEngineEnum = when (value) {
      Native.value -> Native
      Exa.value -> Exa
      Parallel.value -> Parallel
      Firecrawl.value -> Firecrawl
      Perplexity.value -> Perplexity
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<WebSearchEngineEnum> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.WebSearchEngineEnum", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): WebSearchEngineEnum = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: WebSearchEngineEnum) {
      encoder.encodeString(value.value)
    }
  }
}
