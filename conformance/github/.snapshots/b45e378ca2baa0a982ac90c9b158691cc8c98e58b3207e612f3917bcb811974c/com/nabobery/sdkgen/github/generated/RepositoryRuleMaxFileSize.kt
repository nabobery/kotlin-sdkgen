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
 * Prevent commits with individual files that exceed the specified limit from being pushed to the commit graph.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-size
 */
@Serializable(with = RepositoryRuleMaxFileSize.Serializer::class)
public class RepositoryRuleMaxFileSize(
  public val type: InlineRepositoryRuleMaxFileSizeTypeX8cf07814,
  public val parameters: InlineRepositoryRuleMaxFileSizeParametersX338e3dd0? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleMaxFileSizeTypeX8cf07814? = null

    public var type: InlineRepositoryRuleMaxFileSizeTypeX8cf07814
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleMaxFileSizeParametersX338e3dd0? = null

    public fun build(): RepositoryRuleMaxFileSize {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleMaxFileSize(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleMaxFileSize = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleMaxFileSize> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleMaxFileSize {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleMaxFileSize")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleMaxFileSize must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleMaxFileSizeTypeX8cf07814>(rawObject, "type")
      return RepositoryRuleMaxFileSize(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleMaxFileSizeParametersX338e3dd0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleMaxFileSize) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleMaxFileSize")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleMaxFileSize(block: RepositoryRuleMaxFileSize.Builder.() -> Unit): RepositoryRuleMaxFileSize = RepositoryRuleMaxFileSize.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleMaxFileSize is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
