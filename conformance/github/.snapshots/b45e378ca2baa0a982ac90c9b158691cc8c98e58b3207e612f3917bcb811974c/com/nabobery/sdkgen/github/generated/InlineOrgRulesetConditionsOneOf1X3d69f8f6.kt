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
 * Conditions to target repositories by name and refs by name
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-ruleset-conditions/oneOf/0
 */
@Serializable(with = InlineOrgRulesetConditionsOneOf1X3d69f8f6.Serializer::class)
public class InlineOrgRulesetConditionsOneOf1X3d69f8f6(
  public val repositoryName:
      InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818,
  public val refName: InlineRepositoryRulesetConditionsRefNameX4b3789e8? = null,
) {
  public class Builder {
    private var repositoryNameValue:
        InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818? = null

    public var repositoryName:
        InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818
      get() = requireNotNull(repositoryNameValue) { "repositoryName is required" }
      set(`value`) {
        repositoryNameValue = value
      }

    public var refName: InlineRepositoryRulesetConditionsRefNameX4b3789e8? = null

    public fun build(): InlineOrgRulesetConditionsOneOf1X3d69f8f6 {
      check(repositoryNameValue != null) { "repositoryName is required" }
      return InlineOrgRulesetConditionsOneOf1X3d69f8f6(
        repositoryName = repositoryName,
        refName = refName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgRulesetConditionsOneOf1X3d69f8f6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgRulesetConditionsOneOf1X3d69f8f6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgRulesetConditionsOneOf1X3d69f8f6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgRulesetConditionsOneOf1X3d69f8f6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgRulesetConditionsOneOf1X3d69f8f6 must be a JSON object")
      val repositoryName = json.decodeRequired<InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818>(rawObject, "repository_name")
      return InlineOrgRulesetConditionsOneOf1X3d69f8f6(
        repositoryName = repositoryName,
        refName = rawObject["ref_name"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetConditionsRefNameX4b3789e8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgRulesetConditionsOneOf1X3d69f8f6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgRulesetConditionsOneOf1X3d69f8f6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository_name", json.encodeToJsonElement(value.repositoryName))
        value.refName?.let { put("ref_name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgRulesetConditionsOneOf1X3d69f8f6(block: InlineOrgRulesetConditionsOneOf1X3d69f8f6.Builder.() -> Unit): InlineOrgRulesetConditionsOneOf1X3d69f8f6 = InlineOrgRulesetConditionsOneOf1X3d69f8f6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgRulesetConditionsOneOf1X3d69f8f6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
