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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/provide
 * r.
 */
@Serializable(with = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider
  .Serializer::class)
public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider(
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
  public val dataCollection:
      InlineComponentsSchemasProviderPreferencesPropertiesDataCollection? = null,
  /**
   * Whether to restrict routing to only models that allow text distillation. When true, only models where the author
   * has allowed distillation will be used.
   */
  public val enforceDistillableText: Boolean? = null,
  /**
   * List of provider slugs to ignore. If provided, this list is merged with your account-wide ignored provider settings
   * for this request.
   */
  public val ignore: List<InlineComponentsSchemasProviderPreferencesPropertiesIgnoreItems>? = null,
  /**
   * The object specifying the maximum price you want to pay for this request. USD price per million tokens, for prompt
   * and completion.
   */
  public val maxPrice: InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice? = null,
  /**
   * List of provider slugs to allow. If provided, this list is merged with your account-wide allowed provider settings
   * for this request.
   */
  public val only: List<InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems>? = null,
  /**
   * An ordered list of provider slugs. The router will attempt to use the first provider in the subset of this list
   * that supports your requested model, and fall back to the next if it is unavailable. If no providers are available,
   * the request will fail with an error message.
   */
  public val order: List<InlineComponentsSchemasProviderPreferencesPropertiesOrderItems>? = null,
  public val preferredMaxLatency: PreferredMaxLatency? = null,
  public val preferredMinThroughput: PreferredMinThroughput? = null,
  /**
   * A list of quantization levels to filter the provider by.
   */
  public val quantizations: List<Quantization>? = null,
  /**
   * Whether to filter providers to only those that support the parameters you've provided. If this setting is omitted
   * or set to false, then providers will receive only the parameters they support, and ignore the rest.
   */
  public val requireParameters: Boolean? = null,
  /**
   * The sorting strategy to use for this request, if "order" is not specified. When set, no load balancing is
   * performed.
   */
  public val sort: InlineComponentsSchemasProviderPreferencesPropertiesSort? = null,
  /**
   * Whether to restrict routing to only ZDR (Zero Data Retention) endpoints. When true, only endpoints that do not
   * retain prompts will be used.
   */
  public val zdr: Boolean? = null,
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
     * Data collection setting. If no available model provider meets the requirement, your request will return an error.
     * - allow: (default) allow providers which store user data non-transiently and may train on it
     *
     * - deny: use only providers which do not collect user data.
     */
    public var dataCollection: InlineComponentsSchemasProviderPreferencesPropertiesDataCollection? =
        null

    /**
     * Whether to restrict routing to only models that allow text distillation. When true, only models where the author
     * has allowed distillation will be used.
     */
    public var enforceDistillableText: Boolean? = null

    /**
     * List of provider slugs to ignore. If provided, this list is merged with your account-wide ignored provider
     * settings for this request.
     */
    public var ignore: List<InlineComponentsSchemasProviderPreferencesPropertiesIgnoreItems>? = null

    /**
     * The object specifying the maximum price you want to pay for this request. USD price per million tokens, for
     * prompt and completion.
     */
    public var maxPrice: InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice? = null

    /**
     * List of provider slugs to allow. If provided, this list is merged with your account-wide allowed provider
     * settings for this request.
     */
    public var only: List<InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems>? = null

    /**
     * An ordered list of provider slugs. The router will attempt to use the first provider in the subset of this list
     * that supports your requested model, and fall back to the next if it is unavailable. If no providers are
     * available, the request will fail with an error message.
     */
    public var order: List<InlineComponentsSchemasProviderPreferencesPropertiesOrderItems>? = null

    public var preferredMaxLatency: PreferredMaxLatency? = null

    public var preferredMinThroughput: PreferredMinThroughput? = null

    /**
     * A list of quantization levels to filter the provider by.
     */
    public var quantizations: List<Quantization>? = null

    /**
     * Whether to filter providers to only those that support the parameters you've provided. If this setting is omitted
     * or set to false, then providers will receive only the parameters they support, and ignore the rest.
     */
    public var requireParameters: Boolean? = null

    /**
     * The sorting strategy to use for this request, if "order" is not specified. When set, no load balancing is
     * performed.
     */
    public var sort: InlineComponentsSchemasProviderPreferencesPropertiesSort? = null

    /**
     * Whether to restrict routing to only ZDR (Zero Data Retention) endpoints. When true, only endpoints that do not
     * retain prompts will be used.
     */
    public var zdr: Boolean? = null

    public fun build(): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider =
      InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider(
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
    public fun build(block: Builder.() ->
      Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider " +
          "must be a JSON object")
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider(
        allowFallbacks = raw["allow_fallbacks"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        dataCollection = raw["data_collection"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasProviderPreferencesPropertiesDataCollection?>(element) },
        enforceDistillableText = raw["enforce_distillable_text"]?.let { element ->
          if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        ignore = raw["ignore"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<InlineComponentsSchemasProviderPreferencesPropertiesIgnoreItems>?>(element) },
        maxPrice = raw["max_price"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice>(it) },
        only = raw["only"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems>?>(element) },
        order = raw["order"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<InlineComponentsSchemasProviderPreferencesPropertiesOrderItems>?>(element) },
        preferredMaxLatency = raw["preferred_max_latency"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<PreferredMaxLatency?>(element) },
        preferredMinThroughput = raw["preferred_min_throughput"]?.let { element ->
          if (element == JsonNull) null else json.decodeFromJsonElement<PreferredMinThroughput?>(element) },
        quantizations = raw["quantizations"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<Quantization>?>(element) },
        requireParameters = raw["require_parameters"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        sort = raw["sort"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasProviderPreferencesPropertiesSort?>(element) },
        zdr = raw["zdr"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider")
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

public fun inlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider(block: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider.Builder.() -> Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesProvider.build(block)
