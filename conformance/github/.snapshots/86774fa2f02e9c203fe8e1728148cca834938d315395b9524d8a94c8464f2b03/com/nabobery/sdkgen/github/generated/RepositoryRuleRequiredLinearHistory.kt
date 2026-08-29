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
 * Prevent merge commits from being pushed to matching refs.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-linear-history
 */
@Serializable(with = RepositoryRuleRequiredLinearHistory.Serializer::class)
public class RepositoryRuleRequiredLinearHistory(
  public val type: InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c? = null

    public var type: InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RepositoryRuleRequiredLinearHistory {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleRequiredLinearHistory(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleRequiredLinearHistory = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleRequiredLinearHistory> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleRequiredLinearHistory {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleRequiredLinearHistory")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleRequiredLinearHistory must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c>(rawObject, "type")
      return RepositoryRuleRequiredLinearHistory(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleRequiredLinearHistory) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleRequiredLinearHistory")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleRequiredLinearHistory(block: RepositoryRuleRequiredLinearHistory.Builder.() -> Unit): RepositoryRuleRequiredLinearHistory = RepositoryRuleRequiredLinearHistory.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleRequiredLinearHistory is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
