package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information about the top provider for this model
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TopProviderInfo
 */
@Serializable(with = TopProviderInfo.Serializer::class)
public class TopProviderInfo(
  /**
   * Whether the top provider moderates content
   */
  public val isModerated: Boolean,
  /**
   * Context length from the top provider
   */
  public val contextLength: Int? = null,
  /**
   * Maximum completion tokens from the top provider
   */
  public val maxCompletionTokens: Int? = null,
) {
  public class Builder {
    private var isModeratedValue: Boolean? = null

    public var isModerated: Boolean
      get() = requireNotNull(isModeratedValue) { "isModerated is required" }
      set(`value`) {
        isModeratedValue = value
      }

    /**
     * Context length from the top provider
     */
    public var contextLength: Int? = null

    /**
     * Maximum completion tokens from the top provider
     */
    public var maxCompletionTokens: Int? = null

    public fun build(): TopProviderInfo {
      check(isModeratedValue != null) { "isModerated is required" }
      return TopProviderInfo(
        isModerated = isModerated,
        contextLength = contextLength,
        maxCompletionTokens = maxCompletionTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TopProviderInfo = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TopProviderInfo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TopProviderInfo {
      val jsonDecoder = decoder.requireJsonDecoder("TopProviderInfo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TopProviderInfo must be a JSON object")
      val isModerated = json.decodeRequired<Boolean>(rawObject, "is_moderated")
      return TopProviderInfo(
        isModerated = isModerated,
        contextLength = rawObject["context_length"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        maxCompletionTokens = rawObject["max_completion_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TopProviderInfo) {
      val jsonEncoder = encoder.requireJsonEncoder("TopProviderInfo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("is_moderated", json.encodeToJsonElement(value.isModerated))
        value.contextLength?.let { put("context_length", json.encodeToJsonElement(it)) }
        value.maxCompletionTokens?.let { put("max_completion_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun topProviderInfo(block: TopProviderInfo.Builder.() -> Unit): TopProviderInfo = TopProviderInfo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TopProviderInfo is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
