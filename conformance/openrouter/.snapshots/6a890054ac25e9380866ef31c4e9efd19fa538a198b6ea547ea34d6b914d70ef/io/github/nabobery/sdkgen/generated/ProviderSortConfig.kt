package io.github.nabobery.sdkgen.generated

import kotlin.Unit
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

@Serializable
public data class ProviderSortConfigView(
  public val `by`: InlineProviderSortConfigByXf326e694? = null,
  public val partition: InlineProviderSortConfigPartitionX0929adee? = null,
)

/**
 * The provider sorting strategy (price, throughput, latency)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderSortConfig
 */
@Serializable(with = ProviderSortConfig.Serializer::class)
public class ProviderSortConfig(
  /**
   * The provider sorting strategy (price, throughput, latency)
   */
  public val `by`: InlineProviderSortConfigByXf326e694? = null,
  /**
   * Partitioning strategy for sorting: "model" (default) groups endpoints by model before sorting (fallback models
   * remain fallbacks), "none" sorts all endpoints together regardless of model.
   */
  public val partition: InlineProviderSortConfigPartitionX0929adee? = null,
) {
  public class Builder {
    /**
     * The provider sorting strategy (price, throughput, latency)
     */
    public var `by`: InlineProviderSortConfigByXf326e694? = null

    /**
     * Partitioning strategy for sorting: "model" (default) groups endpoints by model before sorting (fallback models
     * remain fallbacks), "none" sorts all endpoints together regardless of model.
     */
    public var partition: InlineProviderSortConfigPartitionX0929adee? = null

    public fun build(): ProviderSortConfig = ProviderSortConfig(
      by = by,
      partition = partition,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProviderSortConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProviderSortConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProviderSortConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ProviderSortConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProviderSortConfig must be a JSON object")
      return ProviderSortConfig(
        by = rawObject["by"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineProviderSortConfigByXf326e694?>(element) },
        partition = rawObject["partition"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineProviderSortConfigPartitionX0929adee?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProviderSortConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ProviderSortConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.by?.let { put("by", json.encodeToJsonElement(it)) }
        value.partition?.let { put("partition", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun providerSortConfig(block: ProviderSortConfig.Builder.() -> Unit): ProviderSortConfig = ProviderSortConfig.build(block)
