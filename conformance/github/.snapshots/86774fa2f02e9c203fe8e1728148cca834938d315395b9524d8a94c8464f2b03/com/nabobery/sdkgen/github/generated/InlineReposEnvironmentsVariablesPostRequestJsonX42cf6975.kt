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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1variables/post/reques
 * tBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1variables/post/reques
 * tBody/content/application~1json/schema
 */
@Serializable(with = InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975.Serializer::class)
public class InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975(
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

    public fun build(): InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975 {
      check(nameValue != null) { "name is required" }
      check(valueValue != null) { "value is required" }
      return InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975(
        name = name,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975(
        name = name,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsVariablesPostRequestJsonX42cf6975(block: InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975.Builder.() -> Unit): InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975 = InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposEnvironmentsVariablesPostRequestJsonX42cf6975 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
