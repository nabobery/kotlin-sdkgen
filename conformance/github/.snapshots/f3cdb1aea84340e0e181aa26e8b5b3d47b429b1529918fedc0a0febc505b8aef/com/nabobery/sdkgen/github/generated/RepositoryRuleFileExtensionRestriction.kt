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
 * Prevent commits that include files with specified file extensions from being pushed to the commit graph.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-extension-restriction
 */
@Serializable(with = RepositoryRuleFileExtensionRestriction.Serializer::class)
public class RepositoryRuleFileExtensionRestriction(
  public val type: InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22,
  public val parameters: InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22? = null

    public var type: InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6? = null

    public fun build(): RepositoryRuleFileExtensionRestriction {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleFileExtensionRestriction(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleFileExtensionRestriction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleFileExtensionRestriction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleFileExtensionRestriction {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleFileExtensionRestriction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleFileExtensionRestriction must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22>(rawObject, "type")
      return RepositoryRuleFileExtensionRestriction(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleFileExtensionRestriction) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleFileExtensionRestriction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleFileExtensionRestriction(block: RepositoryRuleFileExtensionRestriction.Builder.() -> Unit): RepositoryRuleFileExtensionRestriction = RepositoryRuleFileExtensionRestriction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleFileExtensionRestriction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
