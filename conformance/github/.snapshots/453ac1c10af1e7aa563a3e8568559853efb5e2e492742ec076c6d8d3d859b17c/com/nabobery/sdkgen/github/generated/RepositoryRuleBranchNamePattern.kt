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
 * Parameters to be used for the branch_name_pattern rule
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-branch-name-pattern
 */
@Serializable(with = RepositoryRuleBranchNamePattern.Serializer::class)
public class RepositoryRuleBranchNamePattern(
  public val type: InlineRepositoryRuleBranchNamePatternTypeX1f68907f,
  public val parameters: InlineRepositoryRuleBranchNamePatternParametersX75220c8a? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleBranchNamePatternTypeX1f68907f? = null

    public var type: InlineRepositoryRuleBranchNamePatternTypeX1f68907f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleBranchNamePatternParametersX75220c8a? = null

    public fun build(): RepositoryRuleBranchNamePattern {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleBranchNamePattern(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleBranchNamePattern = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleBranchNamePattern> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleBranchNamePattern {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleBranchNamePattern")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleBranchNamePattern must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleBranchNamePatternTypeX1f68907f>(rawObject, "type")
      return RepositoryRuleBranchNamePattern(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleBranchNamePatternParametersX75220c8a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleBranchNamePattern) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleBranchNamePattern")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleBranchNamePattern(block: RepositoryRuleBranchNamePattern.Builder.() -> Unit): RepositoryRuleBranchNamePattern = RepositoryRuleBranchNamePattern.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleBranchNamePattern is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
