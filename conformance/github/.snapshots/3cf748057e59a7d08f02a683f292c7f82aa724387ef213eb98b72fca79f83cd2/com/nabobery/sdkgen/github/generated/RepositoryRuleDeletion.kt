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
 * Only allow users with bypass permissions to delete matching refs.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-deletion
 */
@Serializable(with = RepositoryRuleDeletion.Serializer::class)
public class RepositoryRuleDeletion(
  public val type: InlineRepositoryRuleDeletionTypeXff5dcc76,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleDeletionTypeXff5dcc76? = null

    public var type: InlineRepositoryRuleDeletionTypeXff5dcc76
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RepositoryRuleDeletion {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleDeletion(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleDeletion = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleDeletion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleDeletion {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleDeletion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleDeletion must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleDeletionTypeXff5dcc76>(rawObject, "type")
      return RepositoryRuleDeletion(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleDeletion) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleDeletion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleDeletion(block: RepositoryRuleDeletion.Builder.() -> Unit): RepositoryRuleDeletion = RepositoryRuleDeletion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleDeletion is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
