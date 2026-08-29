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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1variables/post/requestBody/content/application~
 * 1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1variables/post/requestBody/content/application~
 * 1json/schema
 */
@Serializable(with = InlineReposAgentsVariablesPostRequestJsonXcbb2b262.Serializer::class)
public class InlineReposAgentsVariablesPostRequestJsonXcbb2b262(
  /**
   * The name of the variable.
   */
  public val name: String,
  /**
   * The value of the variable.
   */
  public val `value`: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineReposAgentsVariablesPostRequestJsonXcbb2b262 {
      check(nameValue != null) { "name is required" }
      check(valueValue != null) { "value is required" }
      return InlineReposAgentsVariablesPostRequestJsonXcbb2b262(
        name = name,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAgentsVariablesPostRequestJsonXcbb2b262 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposAgentsVariablesPostRequestJsonXcbb2b262> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAgentsVariablesPostRequestJsonXcbb2b262 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAgentsVariablesPostRequestJsonXcbb2b262")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAgentsVariablesPostRequestJsonXcbb2b262 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineReposAgentsVariablesPostRequestJsonXcbb2b262(
        name = name,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAgentsVariablesPostRequestJsonXcbb2b262) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAgentsVariablesPostRequestJsonXcbb2b262")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAgentsVariablesPostRequestJsonXcbb2b262(block: InlineReposAgentsVariablesPostRequestJsonXcbb2b262.Builder.() -> Unit): InlineReposAgentsVariablesPostRequestJsonXcbb2b262 = InlineReposAgentsVariablesPostRequestJsonXcbb2b262.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposAgentsVariablesPostRequestJsonXcbb2b262 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
