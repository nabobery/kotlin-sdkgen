package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Provider routing preferences and provider-specific passthrough configuration.
 */
@Serializable(with = ImageGenerationProviderPreferences.Serializer::class)
public class ImageGenerationProviderPreferences(
  /**
   * Whether to allow backup providers to serve requests
   * - true: (default) when the primary provider (or your custom providers in "order") is unavailable, use the next best
   * provider.
   * - false: use only the primary/custom provider, and return the upstream error if it's unavailable.
   *
   */
  public val allowFallbacks: Boolean? = null,
  /**
   * List of provider slugs to ignore. If provided, this list is merged with your account-wide ignored provider settings
   * for this request.
   */
  public val ignore:
      List<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems>? = null,
  /**
   * List of provider slugs to allow. If provided, this list is merged with your account-wide allowed provider settings
   * for this request.
   */
  public val only:
      List<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOnlyItems>? = null,
  public val options: ProviderOptions? = null,
  /**
   * An ordered list of provider slugs. The router will attempt to use the first provider in the subset of this list
   * that supports your requested model, and fall back to the next if it is unavailable. If no providers are available,
   * the request will fail with an error message.
   */
  public val order:
      List<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems>? = null,
  /**
   * The sorting strategy to use for this request, if "order" is not specified. When set, no load balancing is
   * performed.
   */
  public val sort: InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort? = null,
) {
  public class Builder {
    /**
     * Whether to allow backup providers to serve requests
     * - true: (default) when the primary provider (or your custom providers in "order") is unavailable, use the next
     * best provider.
     * - false: use only the primary/custom provider, and return the upstream error if it's unavailable.
     *
     */
    public var allowFallbacks: Boolean? = null

    /**
     * List of provider slugs to ignore. If provided, this list is merged with your account-wide ignored provider
     * settings for this request.
     */
    public var ignore:
        List<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems>? = null

    /**
     * List of provider slugs to allow. If provided, this list is merged with your account-wide allowed provider
     * settings for this request.
     */
    public var only:
        List<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOnlyItems>? = null

    public var options: ProviderOptions? = null

    /**
     * An ordered list of provider slugs. The router will attempt to use the first provider in the subset of this list
     * that supports your requested model, and fall back to the next if it is unavailable. If no providers are
     * available, the request will fail with an error message.
     */
    public var order:
        List<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems>? = null

    /**
     * The sorting strategy to use for this request, if "order" is not specified. When set, no load balancing is
     * performed.
     */
    public var sort: InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort? = null

    public fun build(): ImageGenerationProviderPreferences = ImageGenerationProviderPreferences(
      allowFallbacks = allowFallbacks,
      ignore = ignore,
      only = only,
      options = options,
      order = order,
      sort = sort,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenerationProviderPreferences = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImageGenerationProviderPreferences> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationProviderPreferences {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationProviderPreferences")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageGenerationProviderPreferences must be a JSON object")
      return ImageGenerationProviderPreferences(
        allowFallbacks = raw["allow_fallbacks"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        ignore = raw["ignore"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems>?>(element) },
        only = raw["only"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOnlyItems>?>(element) },
        options = raw["options"]?.let { json.decodeFromJsonElement<ProviderOptions>(it) },
        order = raw["order"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems>?>(element) },
        sort = raw["sort"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenerationProviderPreferences) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenerationProviderPreferences")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowFallbacks?.let { put("allow_fallbacks", json.encodeToJsonElement(it)) }
        value.ignore?.let { put("ignore", json.encodeToJsonElement(it)) }
        value.only?.let { put("only", json.encodeToJsonElement(it)) }
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
        value.order?.let { put("order", json.encodeToJsonElement(it)) }
        value.sort?.let { put("sort", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenerationProviderPreferences(block: ImageGenerationProviderPreferences.Builder.() ->
  Unit): ImageGenerationProviderPreferences = ImageGenerationProviderPreferences.build(block)
