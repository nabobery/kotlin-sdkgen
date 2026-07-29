package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Parameters for a targeting a repository property
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset-conditions-repository-property-spec
 */
@Serializable(with = RepositoryRulesetConditionsRepositoryPropertySpec.Serializer::class)
public class RepositoryRulesetConditionsRepositoryPropertySpec(
  /**
   * The name of the repository property to target
   */
  public val name: String,
  propertyValues: List<String>,
  /**
   * The source of the repository property. Defaults to 'custom' if not specified.
   */
  public val source: InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340? = null,
) {
  /**
   * The values to match for the repository property
   */
  public val propertyValues: List<String> = propertyValues.toList()

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var propertyValuesValue: List<String>? = null

    public var propertyValues: List<String>
      get() = requireNotNull(propertyValuesValue) { "propertyValues is required" }.toList()
      set(`value`) {
        propertyValuesValue = value.toList()
      }

    /**
     * The source of the repository property. Defaults to 'custom' if not specified.
     */
    public var source: InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340? =
        null

    public fun build(): RepositoryRulesetConditionsRepositoryPropertySpec {
      check(nameValue != null) { "name is required" }
      check(propertyValuesValue != null) { "propertyValues is required" }
      return RepositoryRulesetConditionsRepositoryPropertySpec(
        name = name,
        propertyValues = propertyValues,
        source = source,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRulesetConditionsRepositoryPropertySpec = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRulesetConditionsRepositoryPropertySpec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRulesetConditionsRepositoryPropertySpec {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRulesetConditionsRepositoryPropertySpec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRulesetConditionsRepositoryPropertySpec must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val propertyValues = json.decodeRequired<List<String>>(rawObject, "property_values")
      return RepositoryRulesetConditionsRepositoryPropertySpec(
        name = name,
        propertyValues = propertyValues,
        source = rawObject["source"]?.let { json.decodeFromJsonElement<InlineRepositoryRulesetConditionsRepositoryPropertySpecSourceX2adce340>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRulesetConditionsRepositoryPropertySpec) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRulesetConditionsRepositoryPropertySpec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("property_values", json.encodeToJsonElement(value.propertyValues))
        value.source?.let { put("source", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRulesetConditionsRepositoryPropertySpec(block: RepositoryRulesetConditionsRepositoryPropertySpec.Builder.() -> Unit): RepositoryRulesetConditionsRepositoryPropertySpec = RepositoryRulesetConditionsRepositoryPropertySpec.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRulesetConditionsRepositoryPropertySpec is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
