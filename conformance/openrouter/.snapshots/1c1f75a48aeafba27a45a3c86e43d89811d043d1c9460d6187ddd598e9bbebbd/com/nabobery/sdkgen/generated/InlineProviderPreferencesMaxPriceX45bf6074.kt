package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * The object specifying the maximum price you want to pay for this request. USD price per million tokens, for prompt
 * and completion.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences/properties/max_price
 */
@Serializable(with = InlineProviderPreferencesMaxPriceX45bf6074.Serializer::class)
public class InlineProviderPreferencesMaxPriceX45bf6074(
  /**
   * Maximum price in USD per audio unit
   */
  public val audio: String? = null,
  /**
   * Maximum price in USD per million completion tokens
   */
  public val completion: String? = null,
  /**
   * Maximum price in USD per image
   */
  public val image: String? = null,
  /**
   * Maximum price in USD per million prompt tokens
   */
  public val prompt: String? = null,
  /**
   * Maximum price in USD per request
   */
  public val request: String? = null,
) {
  public class Builder {
    /**
     * Maximum price in USD per audio unit
     */
    public var audio: String? = null

    /**
     * Maximum price in USD per million completion tokens
     */
    public var completion: String? = null

    /**
     * Maximum price in USD per image
     */
    public var image: String? = null

    /**
     * Maximum price in USD per million prompt tokens
     */
    public var prompt: String? = null

    /**
     * Maximum price in USD per request
     */
    public var request: String? = null

    public fun build(): InlineProviderPreferencesMaxPriceX45bf6074 = InlineProviderPreferencesMaxPriceX45bf6074(
      audio = audio,
      completion = completion,
      image = image,
      prompt = prompt,
      request = request,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProviderPreferencesMaxPriceX45bf6074 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProviderPreferencesMaxPriceX45bf6074> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProviderPreferencesMaxPriceX45bf6074 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProviderPreferencesMaxPriceX45bf6074")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProviderPreferencesMaxPriceX45bf6074 must be a JSON object")
      return InlineProviderPreferencesMaxPriceX45bf6074(
        audio = rawObject["audio"]?.let { json.decodeFromJsonElement<String>(it) },
        completion = rawObject["completion"]?.let { json.decodeFromJsonElement<String>(it) },
        image = rawObject["image"]?.let { json.decodeFromJsonElement<String>(it) },
        prompt = rawObject["prompt"]?.let { json.decodeFromJsonElement<String>(it) },
        request = rawObject["request"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProviderPreferencesMaxPriceX45bf6074) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProviderPreferencesMaxPriceX45bf6074")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.audio?.let { put("audio", it) }
        value.completion?.let { put("completion", it) }
        value.image?.let { put("image", it) }
        value.prompt?.let { put("prompt", it) }
        value.request?.let { put("request", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProviderPreferencesMaxPriceX45bf6074(block: InlineProviderPreferencesMaxPriceX45bf6074.Builder.() -> Unit): InlineProviderPreferencesMaxPriceX45bf6074 = InlineProviderPreferencesMaxPriceX45bf6074.build(block)
