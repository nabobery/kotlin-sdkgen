package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1organization-variables/get/responses/200/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1organization-variables/get/responses/200/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa.Serializer::class)
public class InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa(
  public val totalCount: Int,
  variables: List<ActionsVariable>,
) {
  public val variables: List<ActionsVariable> = variables.toList()

  public class Builder {
    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var variablesValue: List<ActionsVariable>? = null

    public var variables: List<ActionsVariable>
      get() = requireNotNull(variablesValue) { "variables is required" }
      set(`value`) {
        variablesValue = value
      }

    public fun build(): InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa {
      check(totalCountValue != null) { "totalCount is required" }
      check(variablesValue != null) { "variables is required" }
      return InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa(
        totalCount = totalCount,
        variables = variables,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val variables = json.decodeRequired<List<ActionsVariable>>(rawObject, "variables")
      return InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa(
        totalCount = totalCount,
        variables = variables,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("variables", json.encodeToJsonElement(value.variables))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa(block: InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa.Builder.() -> Unit): InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa = InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
