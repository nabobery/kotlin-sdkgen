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
 * Only allow users with bypass permission to create matching refs.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-creation
 */
@Serializable(with = RepositoryRuleCreation.Serializer::class)
public class RepositoryRuleCreation(
  public val type: InlineRepositoryRuleCreationTypeX8824ca31,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleCreationTypeX8824ca31? = null

    public var type: InlineRepositoryRuleCreationTypeX8824ca31
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RepositoryRuleCreation {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleCreation(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleCreation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleCreation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleCreation {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleCreation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleCreation must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleCreationTypeX8824ca31>(rawObject, "type")
      return RepositoryRuleCreation(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleCreation) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleCreation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleCreation(block: RepositoryRuleCreation.Builder.() -> Unit): RepositoryRuleCreation = RepositoryRuleCreation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleCreation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
