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
 * The search engine to use for web search.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchEngine
 */
@Serializable(with = WebSearchEngine.Serializer::class)
public sealed class WebSearchEngine {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `native`.
   */
  public data object Native : WebSearchEngine() {
    public override val `value`: String = "native"
  }

  /**
   * Documented value. Wire value: `exa`.
   */
  public data object Exa : WebSearchEngine() {
    public override val `value`: String = "exa"
  }

  /**
   * Documented value. Wire value: `firecrawl`.
   */
  public data object Firecrawl : WebSearchEngine() {
    public override val `value`: String = "firecrawl"
  }

  /**
   * Documented value. Wire value: `parallel`.
   */
  public data object Parallel : WebSearchEngine() {
    public override val `value`: String = "parallel"
  }

  /**
   * Documented value. Wire value: `perplexity`.
   */
  public data object Perplexity : WebSearchEngine() {
    public override val `value`: String = "perplexity"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : WebSearchEngine()

  public companion object {
    public fun fromValue(`value`: String): WebSearchEngine = when (value) {
      Native.value -> Native
      Exa.value -> Exa
      Firecrawl.value -> Firecrawl
      Parallel.value -> Parallel
      Perplexity.value -> Perplexity
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<WebSearchEngine> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.WebSearchEngine", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): WebSearchEngine = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: WebSearchEngine) {
      encoder.encodeString(value.value)
    }
  }
}
