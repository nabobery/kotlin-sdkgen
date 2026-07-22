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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Only allow users with bypass permission to update matching refs.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-update
 */
@Serializable(with = RepositoryRuleUpdate.Serializer::class)
public class RepositoryRuleUpdate(
  public val type: InlineRepositoryRuleUpdateTypeX6cbd920c,
  public val parameters: InlineRepositoryRuleUpdateParametersX3840cb6d? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleUpdateTypeX6cbd920c? = null

    public var type: InlineRepositoryRuleUpdateTypeX6cbd920c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleUpdateParametersX3840cb6d? = null

    public fun build(): RepositoryRuleUpdate {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleUpdate(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleUpdate = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleUpdate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleUpdate must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleUpdateTypeX6cbd920c>(rawObject, "type")
      return RepositoryRuleUpdate(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleUpdateParametersX3840cb6d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleUpdate) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleUpdate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleUpdate(block: RepositoryRuleUpdate.Builder.() -> Unit): RepositoryRuleUpdate = RepositoryRuleUpdate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleUpdate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
