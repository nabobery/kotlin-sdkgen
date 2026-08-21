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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationProviderPreferences
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
  ignore: List<InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c>? = null,
  only: List<InlineImageGenerationProviderPreferencesOnlyItemX31f251f7>? = null,
  public val options: ProviderOptions? = null,
  order: List<InlineImageGenerationProviderPreferencesOrderItemX83723e2c>? = null,
  /**
   * The sorting strategy to use for this request, if "order" is not specified. When set, no load balancing is
   * performed.
   */
  public val sort: InlineImageGenerationProviderPreferencesSortX4cc00407? = null,
) {
  /**
   * List of provider slugs to ignore. If provided, this list is merged with your account-wide ignored provider settings
   * for this request.
   */
  public val ignore: List<InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c>? =
      ignore?.let { collection0 -> collection0.toList() }

  /**
   * List of provider slugs to allow. If provided, this list is merged with your account-wide allowed provider settings
   * for this request.
   */
  public val only: List<InlineImageGenerationProviderPreferencesOnlyItemX31f251f7>? =
      only?.let { collection0 -> collection0.toList() }

  /**
   * An ordered list of provider slugs. The router will attempt to use the first provider in the subset of this list
   * that supports your requested model, and fall back to the next if it is unavailable. If no providers are available,
   * the request will fail with an error message.
   */
  public val order: List<InlineImageGenerationProviderPreferencesOrderItemX83723e2c>? =
      order?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Whether to allow backup providers to serve requests
     * - true: (default) when the primary provider (or your custom providers in "order") is unavailable, use the next
     * best provider.
     * - false: use only the primary/custom provider, and return the upstream error if it's unavailable.
     *
     */
    public var allowFallbacks: Boolean? = null

    private var ignoreValue: List<InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c>? =
        null

    /**
     * List of provider slugs to ignore. If provided, this list is merged with your account-wide ignored provider
     * settings for this request.
     */
    public var ignore: List<InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c>?
      get() = ignoreValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        ignoreValue = value?.let { collection0 -> collection0.toList() }
      }

    private var onlyValue: List<InlineImageGenerationProviderPreferencesOnlyItemX31f251f7>? = null

    /**
     * List of provider slugs to allow. If provided, this list is merged with your account-wide allowed provider
     * settings for this request.
     */
    public var only: List<InlineImageGenerationProviderPreferencesOnlyItemX31f251f7>?
      get() = onlyValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        onlyValue = value?.let { collection0 -> collection0.toList() }
      }

    public var options: ProviderOptions? = null

    private var orderValue: List<InlineImageGenerationProviderPreferencesOrderItemX83723e2c>? = null

    /**
     * An ordered list of provider slugs. The router will attempt to use the first provider in the subset of this list
     * that supports your requested model, and fall back to the next if it is unavailable. If no providers are
     * available, the request will fail with an error message.
     */
    public var order: List<InlineImageGenerationProviderPreferencesOrderItemX83723e2c>?
      get() = orderValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        orderValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The sorting strategy to use for this request, if "order" is not specified. When set, no load balancing is
     * performed.
     */
    public var sort: InlineImageGenerationProviderPreferencesSortX4cc00407? = null

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

  internal object Serializer : KSerializer<ImageGenerationProviderPreferences> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationProviderPreferences {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationProviderPreferences")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageGenerationProviderPreferences must be a JSON object")
      return ImageGenerationProviderPreferences(
        allowFallbacks = rawObject["allow_fallbacks"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        ignore = rawObject["ignore"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c>?>(element) },
        only = rawObject["only"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineImageGenerationProviderPreferencesOnlyItemX31f251f7>?>(element) },
        options = rawObject["options"]?.let { json.decodeFromJsonElement<ProviderOptions>(it) },
        order = rawObject["order"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineImageGenerationProviderPreferencesOrderItemX83723e2c>?>(element) },
        sort = rawObject["sort"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineImageGenerationProviderPreferencesSortX4cc00407?>(element) },
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

public fun imageGenerationProviderPreferences(block: ImageGenerationProviderPreferences.Builder.() -> Unit): ImageGenerationProviderPreferences = ImageGenerationProviderPreferences.build(block)
