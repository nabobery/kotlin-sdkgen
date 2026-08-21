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
 * Gitignore Template
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gitignore-template
 */
@Serializable(with = GitignoreTemplate.Serializer::class)
public class GitignoreTemplate(
  public val name: String,
  public val source: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var sourceValue: String? = null

    public var source: String
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    public fun build(): GitignoreTemplate {
      check(nameValue != null) { "name is required" }
      check(sourceValue != null) { "source is required" }
      return GitignoreTemplate(
        name = name,
        source = source,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GitignoreTemplate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GitignoreTemplate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GitignoreTemplate {
      val jsonDecoder = decoder.requireJsonDecoder("GitignoreTemplate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GitignoreTemplate must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val source = json.decodeRequired<String>(rawObject, "source")
      return GitignoreTemplate(
        name = name,
        source = source,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GitignoreTemplate) {
      val jsonEncoder = encoder.requireJsonEncoder("GitignoreTemplate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("source", value.source)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gitignoreTemplate(block: GitignoreTemplate.Builder.() -> Unit): GitignoreTemplate = GitignoreTemplate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GitignoreTemplate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
