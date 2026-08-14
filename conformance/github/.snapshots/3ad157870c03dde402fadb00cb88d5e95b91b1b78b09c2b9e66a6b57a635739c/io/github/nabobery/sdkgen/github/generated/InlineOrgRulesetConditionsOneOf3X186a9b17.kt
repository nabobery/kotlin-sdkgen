package io.github.nabobery.sdkgen.github.generated

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
 * Conditions to target repositories by property and refs by name
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-ruleset-conditions/oneOf/2
 */
@Serializable(with = InlineOrgRulesetConditionsOneOf3X186a9b17.Serializer::class)
public class InlineOrgRulesetConditionsOneOf3X186a9b17(
  public val repositoryProperty: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba,
  public val refName: InlineRepositoryRulesetConditionsRefNameX4b3789e8? = null,
) {
  public class Builder {
    private var repositoryPropertyValue: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba?
        = null

    public var repositoryProperty: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba
      get() = requireNotNull(repositoryPropertyValue) { "repositoryProperty is required" }
      set(`value`) {
        repositoryPropertyValue = value
      }

    public var refName: InlineRepositoryRulesetConditionsRefNameX4b3789e8? = null

    public fun build(): InlineOrgRulesetConditionsOneOf3X186a9b17 {
      check(repositoryPropertyValue != null) { "repositoryProperty is required" }
      return InlineOrgRulesetConditionsOneOf3X186a9b17(
        repositoryProperty = repositoryProperty,
        refName = refName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgRulesetConditionsOneOf3X186a9b17 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgRulesetConditionsOneOf3X186a9b17> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgRulesetConditionsOneOf3X186a9b17 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgRulesetConditionsOneOf3X186a9b17")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgRulesetConditionsOneOf3X186a9b17 must be a JSON object")
      val repositoryProperty = json.decodeRequired<InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba>(rawObject, "repository_property")
      return InlineOrgRulesetConditionsOneOf3X186a9b17(
        repositoryProperty = repositoryProperty,
        refName = rawObject["ref_name"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetConditionsRefNameX4b3789e8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgRulesetConditionsOneOf3X186a9b17) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgRulesetConditionsOneOf3X186a9b17")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository_property", json.encodeToJsonElement(value.repositoryProperty))
        value.refName?.let { put("ref_name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgRulesetConditionsOneOf3X186a9b17(block: InlineOrgRulesetConditionsOneOf3X186a9b17.Builder.() -> Unit): InlineOrgRulesetConditionsOneOf3X186a9b17 = InlineOrgRulesetConditionsOneOf3X186a9b17.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgRulesetConditionsOneOf3X186a9b17 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
