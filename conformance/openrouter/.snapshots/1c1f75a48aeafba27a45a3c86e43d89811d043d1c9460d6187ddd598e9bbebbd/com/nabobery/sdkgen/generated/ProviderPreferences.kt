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
 * When multiple model providers are available, optionally indicate your routing preference.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences
 */
@Serializable(with = ProviderPreferences.Serializer::class)
public class ProviderPreferences(
  /**
   * Whether to allow backup providers to serve requests
   * - true: (default) when the primary provider (or your custom providers in "order") is unavailable, use the next best
   * provider.
   * - false: use only the primary/custom provider, and return the upstream error if it's unavailable.
   *
   */
  public val allowFallbacks: Boolean? = null,
  /**
   * Data collection setting. If no available model provider meets the requirement, your request will return an error.
   * - allow: (default) allow providers which store user data non-transiently and may train on it
   *
   * - deny: use only providers which do not collect user data.
   */
  public val dataCollection: InlineProviderPreferencesDataCollectionXf42358aa? = null,
  /**
   * Whether to restrict routing to only models that allow text distillation. When true, only models where the author
   * has allowed distillation will be used.
   */
  public val enforceDistillableText: Boolean? = null,
  ignore: List<InlineProviderPreferencesIgnoreItemXf930f0bc>? = null,
  /**
   * The object specifying the maximum price you want to pay for this request. USD price per million tokens, for prompt
   * and completion.
   */
  public val maxPrice: InlineProviderPreferencesMaxPriceX45bf6074? = null,
  only: List<InlineProviderPreferencesOnlyItemX90100337>? = null,
  order: List<InlineProviderPreferencesOrderItemX6395b618>? = null,
  public val preferredMaxLatency: PreferredMaxLatency? = null,
  public val preferredMinThroughput: PreferredMinThroughput? = null,
  quantizations: List<Quantization>? = null,
  /**
   * Whether to filter providers to only those that support the parameters you've provided. If this setting is omitted
   * or set to false, then providers will receive only the parameters they support, and ignore the rest.
   */
  public val requireParameters: Boolean? = null,
  /**
   * The sorting strategy to use for this request, if "order" is not specified. When set, no load balancing is
   * performed.
   */
  public val sort: InlineProviderPreferencesSortXb01b2cde? = null,
  /**
   * Whether to restrict routing to only ZDR (Zero Data Retention) endpoints. When true, only endpoints that do not
   * retain prompts will be used.
   */
  public val zdr: Boolean? = null,
) {
  /**
   * List of provider slugs to ignore. If provided, this list is merged with your account-wide ignored provider settings
   * for this request.
   */
  public val ignore: List<InlineProviderPreferencesIgnoreItemXf930f0bc>? =
      ignore?.let { collection0 -> collection0.toList() }

  /**
   * List of provider slugs to allow. If provided, this list is merged with your account-wide allowed provider settings
   * for this request.
   */
  public val only: List<InlineProviderPreferencesOnlyItemX90100337>? =
      only?.let { collection0 -> collection0.toList() }

  /**
   * An ordered list of provider slugs. The router will attempt to use the first provider in the subset of this list
   * that supports your requested model, and fall back to the next if it is unavailable. If no providers are available,
   * the request will fail with an error message.
   */
  public val order: List<InlineProviderPreferencesOrderItemX6395b618>? =
      order?.let { collection0 -> collection0.toList() }

  /**
   * A list of quantization levels to filter the provider by.
   */
  public val quantizations: List<Quantization>? =
      quantizations?.let { collection0 -> collection0.toList() }

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
     * Data collection setting. If no available model provider meets the requirement, your request will return an error.
     * - allow: (default) allow providers which store user data non-transiently and may train on it
     *
     * - deny: use only providers which do not collect user data.
     */
    public var dataCollection: InlineProviderPreferencesDataCollectionXf42358aa? = null

    /**
     * Whether to restrict routing to only models that allow text distillation. When true, only models where the author
     * has allowed distillation will be used.
     */
    public var enforceDistillableText: Boolean? = null

    private var ignoreValue: List<InlineProviderPreferencesIgnoreItemXf930f0bc>? = null

    /**
     * List of provider slugs to ignore. If provided, this list is merged with your account-wide ignored provider
     * settings for this request.
     */
    public var ignore: List<InlineProviderPreferencesIgnoreItemXf930f0bc>?
      get() = ignoreValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        ignoreValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The object specifying the maximum price you want to pay for this request. USD price per million tokens, for
     * prompt and completion.
     */
    public var maxPrice: InlineProviderPreferencesMaxPriceX45bf6074? = null

    private var onlyValue: List<InlineProviderPreferencesOnlyItemX90100337>? = null

    /**
     * List of provider slugs to allow. If provided, this list is merged with your account-wide allowed provider
     * settings for this request.
     */
    public var only: List<InlineProviderPreferencesOnlyItemX90100337>?
      get() = onlyValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        onlyValue = value?.let { collection0 -> collection0.toList() }
      }

    private var orderValue: List<InlineProviderPreferencesOrderItemX6395b618>? = null

    /**
     * An ordered list of provider slugs. The router will attempt to use the first provider in the subset of this list
     * that supports your requested model, and fall back to the next if it is unavailable. If no providers are
     * available, the request will fail with an error message.
     */
    public var order: List<InlineProviderPreferencesOrderItemX6395b618>?
      get() = orderValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        orderValue = value?.let { collection0 -> collection0.toList() }
      }

    public var preferredMaxLatency: PreferredMaxLatency? = null

    public var preferredMinThroughput: PreferredMinThroughput? = null

    private var quantizationsValue: List<Quantization>? = null

    /**
     * A list of quantization levels to filter the provider by.
     */
    public var quantizations: List<Quantization>?
      get() = quantizationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        quantizationsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Whether to filter providers to only those that support the parameters you've provided. If this setting is omitted
     * or set to false, then providers will receive only the parameters they support, and ignore the rest.
     */
    public var requireParameters: Boolean? = null

    /**
     * The sorting strategy to use for this request, if "order" is not specified. When set, no load balancing is
     * performed.
     */
    public var sort: InlineProviderPreferencesSortXb01b2cde? = null

    /**
     * Whether to restrict routing to only ZDR (Zero Data Retention) endpoints. When true, only endpoints that do not
     * retain prompts will be used.
     */
    public var zdr: Boolean? = null

    public fun build(): ProviderPreferences = ProviderPreferences(
      allowFallbacks = allowFallbacks,
      dataCollection = dataCollection,
      enforceDistillableText = enforceDistillableText,
      ignore = ignore,
      maxPrice = maxPrice,
      only = only,
      order = order,
      preferredMaxLatency = preferredMaxLatency,
      preferredMinThroughput = preferredMinThroughput,
      quantizations = quantizations,
      requireParameters = requireParameters,
      sort = sort,
      zdr = zdr,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProviderPreferences = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProviderPreferences> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProviderPreferences {
      val jsonDecoder = decoder.requireJsonDecoder("ProviderPreferences")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProviderPreferences must be a JSON object")
      return ProviderPreferences(
        allowFallbacks = rawObject["allow_fallbacks"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        dataCollection = rawObject["data_collection"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineProviderPreferencesDataCollectionXf42358aa?>(element) },
        enforceDistillableText = rawObject["enforce_distillable_text"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        ignore = rawObject["ignore"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineProviderPreferencesIgnoreItemXf930f0bc>?>(element) },
        maxPrice = rawObject["max_price"]?.let { json.decodeFromJsonElement<InlineProviderPreferencesMaxPriceX45bf6074>(it) },
        only = rawObject["only"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineProviderPreferencesOnlyItemX90100337>?>(element) },
        order = rawObject["order"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineProviderPreferencesOrderItemX6395b618>?>(element) },
        preferredMaxLatency = rawObject["preferred_max_latency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<PreferredMaxLatency?>(element) },
        preferredMinThroughput = rawObject["preferred_min_throughput"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<PreferredMinThroughput?>(element) },
        quantizations = rawObject["quantizations"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<Quantization>?>(element) },
        requireParameters = rawObject["require_parameters"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        sort = rawObject["sort"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineProviderPreferencesSortXb01b2cde?>(element) },
        zdr = rawObject["zdr"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProviderPreferences) {
      val jsonEncoder = encoder.requireJsonEncoder("ProviderPreferences")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowFallbacks?.let { put("allow_fallbacks", json.encodeToJsonElement(it)) }
        value.dataCollection?.let { put("data_collection", json.encodeToJsonElement(it)) }
        value.enforceDistillableText?.let { put("enforce_distillable_text", json.encodeToJsonElement(it)) }
        value.ignore?.let { put("ignore", json.encodeToJsonElement(it)) }
        value.maxPrice?.let { put("max_price", json.encodeToJsonElement(it)) }
        value.only?.let { put("only", json.encodeToJsonElement(it)) }
        value.order?.let { put("order", json.encodeToJsonElement(it)) }
        value.preferredMaxLatency?.let { put("preferred_max_latency", json.encodeToJsonElement(it)) }
        value.preferredMinThroughput?.let { put("preferred_min_throughput", json.encodeToJsonElement(it)) }
        value.quantizations?.let { put("quantizations", json.encodeToJsonElement(it)) }
        value.requireParameters?.let { put("require_parameters", json.encodeToJsonElement(it)) }
        value.sort?.let { put("sort", json.encodeToJsonElement(it)) }
        value.zdr?.let { put("zdr", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun providerPreferences(block: ProviderPreferences.Builder.() -> Unit): ProviderPreferences = ProviderPreferences.build(block)
