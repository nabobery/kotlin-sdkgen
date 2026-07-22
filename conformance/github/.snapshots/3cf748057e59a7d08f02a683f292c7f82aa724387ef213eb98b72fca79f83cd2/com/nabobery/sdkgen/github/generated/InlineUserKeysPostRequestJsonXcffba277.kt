package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1user~1keys/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1keys/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUserKeysPostRequestJsonXcffba277.Serializer::class)
public class InlineUserKeysPostRequestJsonXcffba277(
  /**
   * The public SSH key to add to your GitHub account.
   */
  public val key: String,
  /**
   * A descriptive name for the new key.
   */
  public val title: String? = null,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    /**
     * A descriptive name for the new key.
     */
    public var title: String? = null

    public fun build(): InlineUserKeysPostRequestJsonXcffba277 {
      check(keyValue != null) { "key is required" }
      return InlineUserKeysPostRequestJsonXcffba277(
        key = key,
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserKeysPostRequestJsonXcffba277 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserKeysPostRequestJsonXcffba277> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserKeysPostRequestJsonXcffba277 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserKeysPostRequestJsonXcffba277")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserKeysPostRequestJsonXcffba277 must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      return InlineUserKeysPostRequestJsonXcffba277(
        key = key,
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserKeysPostRequestJsonXcffba277) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserKeysPostRequestJsonXcffba277")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserKeysPostRequestJsonXcffba277(block: InlineUserKeysPostRequestJsonXcffba277.Builder.() -> Unit): InlineUserKeysPostRequestJsonXcffba277 = InlineUserKeysPostRequestJsonXcffba277.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserKeysPostRequestJsonXcffba277 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
