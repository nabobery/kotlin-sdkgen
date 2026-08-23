package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1topics/put/requestBody/content/application~1json/schema
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1topics/put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposTopicsPutRequestJsonXe0f35d36.Serializer::class)
public class InlineReposTopicsPutRequestJsonXe0f35d36(
  names: List<String>,
) {
  /**
   * An array of topics to add to the repository. Pass one or more topics to _replace_ the set of existing topics. Send
   * an empty array (`[]`) to clear all topics from the repository. **Note:** Topic `names` will be saved as lowercase.
   */
  public val names: List<String> = names.toList()

  public class Builder {
    private var namesValue: List<String>? = null

    public var names: List<String>
      get() = requireNotNull(namesValue) { "names is required" }.toList()
      set(`value`) {
        namesValue = value.toList()
      }

    public fun build(): InlineReposTopicsPutRequestJsonXe0f35d36 {
      check(namesValue != null) { "names is required" }
      return InlineReposTopicsPutRequestJsonXe0f35d36(
        names = names,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposTopicsPutRequestJsonXe0f35d36 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposTopicsPutRequestJsonXe0f35d36> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposTopicsPutRequestJsonXe0f35d36 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposTopicsPutRequestJsonXe0f35d36")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposTopicsPutRequestJsonXe0f35d36 must be a JSON object")
      val names = json.decodeRequired<List<String>>(rawObject, "names")
      return InlineReposTopicsPutRequestJsonXe0f35d36(
        names = names,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposTopicsPutRequestJsonXe0f35d36) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposTopicsPutRequestJsonXe0f35d36")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("names", json.encodeToJsonElement(value.names))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposTopicsPutRequestJsonXe0f35d36(block: InlineReposTopicsPutRequestJsonXe0f35d36.Builder.() -> Unit): InlineReposTopicsPutRequestJsonXe0f35d36 = InlineReposTopicsPutRequestJsonXe0f35d36.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposTopicsPutRequestJsonXe0f35d36 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
