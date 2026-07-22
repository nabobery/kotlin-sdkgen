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
 * Prevent commits that include changes in specified file and folder paths from being pushed to the commit graph. This
 * includes absolute paths that contain file names.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-path-restriction
 */
@Serializable(with = RepositoryRuleFilePathRestriction.Serializer::class)
public class RepositoryRuleFilePathRestriction(
  public val type: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95,
  public val parameters: InlineRepositoryRuleFilePathRestrictionParametersX9758d294? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95? = null

    public var type: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleFilePathRestrictionParametersX9758d294? = null

    public fun build(): RepositoryRuleFilePathRestriction {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleFilePathRestriction(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleFilePathRestriction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleFilePathRestriction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleFilePathRestriction {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleFilePathRestriction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleFilePathRestriction must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95>(rawObject, "type")
      return RepositoryRuleFilePathRestriction(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleFilePathRestrictionParametersX9758d294>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleFilePathRestriction) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleFilePathRestriction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleFilePathRestriction(block: RepositoryRuleFilePathRestriction.Builder.() -> Unit): RepositoryRuleFilePathRestriction = RepositoryRuleFilePathRestriction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleFilePathRestriction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
