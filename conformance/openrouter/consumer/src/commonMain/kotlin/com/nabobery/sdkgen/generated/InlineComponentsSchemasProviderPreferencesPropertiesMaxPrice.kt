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
 */
@Serializable(with = InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice.Serializer::class)
public class InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice(
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

    public fun build(): InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice =
      InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice(
      audio = audio,
      completion = completion,
      image = image,
      prompt = prompt,
      request = request,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice must be a JSON " +
          "object")
      return InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice(
        audio = raw["audio"]?.let { json.decodeFromJsonElement<String>(it) },
        completion = raw["completion"]?.let { json.decodeFromJsonElement<String>(it) },
        image = raw["image"]?.let { json.decodeFromJsonElement<String>(it) },
        prompt = raw["prompt"]?.let { json.decodeFromJsonElement<String>(it) },
        request = raw["request"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice")
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

public fun inlineComponentsSchemasProviderPreferencesPropertiesMaxPrice(block: InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice.Builder.() -> Unit): InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice = InlineComponentsSchemasProviderPreferencesPropertiesMaxPrice.build(block)
