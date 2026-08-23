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
 * Prevent commits that include file paths that exceed the specified character limit from being pushed to the commit
 * graph.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-path-length
 */
@Serializable(with = RepositoryRuleMaxFilePathLength.Serializer::class)
public class RepositoryRuleMaxFilePathLength(
  public val type: InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9,
  public val parameters: InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9? = null

    public var type: InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a? = null

    public fun build(): RepositoryRuleMaxFilePathLength {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleMaxFilePathLength(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleMaxFilePathLength = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleMaxFilePathLength> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleMaxFilePathLength {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleMaxFilePathLength")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleMaxFilePathLength must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9>(rawObject, "type")
      return RepositoryRuleMaxFilePathLength(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleMaxFilePathLength) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleMaxFilePathLength")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleMaxFilePathLength(block: RepositoryRuleMaxFilePathLength.Builder.() -> Unit): RepositoryRuleMaxFilePathLength = RepositoryRuleMaxFilePathLength.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleMaxFilePathLength is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
