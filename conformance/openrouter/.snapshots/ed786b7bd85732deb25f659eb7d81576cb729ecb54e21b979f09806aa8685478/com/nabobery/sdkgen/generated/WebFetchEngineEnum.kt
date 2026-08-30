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
 * Which fetch engine to use. "auto" (default) uses native if the provider supports it, otherwise Exa. "native" forces
 * the provider's built-in fetch. "exa" uses Exa Contents API. "openrouter" uses direct HTTP fetch. "firecrawl" uses
 * Firecrawl scrape (requires BYOK). "parallel" uses the Parallel extract API.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebFetchEngineEnum
 */
@Serializable(with = WebFetchEngineEnum.Serializer::class)
public sealed class WebFetchEngineEnum {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : WebFetchEngineEnum() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `native`.
   */
  public data object Native : WebFetchEngineEnum() {
    public override val `value`: String = "native"
  }

  /**
   * Documented value. Wire value: `openrouter`.
   */
  public data object Openrouter : WebFetchEngineEnum() {
    public override val `value`: String = "openrouter"
  }

  /**
   * Documented value. Wire value: `exa`.
   */
  public data object Exa : WebFetchEngineEnum() {
    public override val `value`: String = "exa"
  }

  /**
   * Documented value. Wire value: `parallel`.
   */
  public data object Parallel : WebFetchEngineEnum() {
    public override val `value`: String = "parallel"
  }

  /**
   * Documented value. Wire value: `firecrawl`.
   */
  public data object Firecrawl : WebFetchEngineEnum() {
    public override val `value`: String = "firecrawl"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : WebFetchEngineEnum()

  public companion object {
    public fun fromValue(`value`: String): WebFetchEngineEnum = when (value) {
      Auto.value -> Auto
      Native.value -> Native
      Openrouter.value -> Openrouter
      Exa.value -> Exa
      Parallel.value -> Parallel
      Firecrawl.value -> Firecrawl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<WebFetchEngineEnum> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.WebFetchEngineEnum", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): WebFetchEngineEnum = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: WebFetchEngineEnum) {
      encoder.encodeString(value.value)
    }
  }
}
