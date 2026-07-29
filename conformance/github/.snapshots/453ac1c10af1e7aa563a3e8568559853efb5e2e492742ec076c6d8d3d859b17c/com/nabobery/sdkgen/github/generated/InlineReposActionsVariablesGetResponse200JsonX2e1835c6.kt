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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1variables/get/responses/200/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1variables/get/responses/200/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineReposActionsVariablesGetResponse200JsonX2e1835c6.Serializer::class)
public class InlineReposActionsVariablesGetResponse200JsonX2e1835c6(
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
      get() = requireNotNull(variablesValue) { "variables is required" }.toList()
      set(`value`) {
        variablesValue = value.toList()
      }

    public fun build(): InlineReposActionsVariablesGetResponse200JsonX2e1835c6 {
      check(totalCountValue != null) { "totalCount is required" }
      check(variablesValue != null) { "variables is required" }
      return InlineReposActionsVariablesGetResponse200JsonX2e1835c6(
        totalCount = totalCount,
        variables = variables,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsVariablesGetResponse200JsonX2e1835c6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposActionsVariablesGetResponse200JsonX2e1835c6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsVariablesGetResponse200JsonX2e1835c6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsVariablesGetResponse200JsonX2e1835c6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsVariablesGetResponse200JsonX2e1835c6 must be a JSON object")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val variables = json.decodeRequired<List<ActionsVariable>>(rawObject, "variables")
      return InlineReposActionsVariablesGetResponse200JsonX2e1835c6(
        totalCount = totalCount,
        variables = variables,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsVariablesGetResponse200JsonX2e1835c6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsVariablesGetResponse200JsonX2e1835c6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("variables", json.encodeToJsonElement(value.variables))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsVariablesGetResponse200JsonX2e1835c6(block: InlineReposActionsVariablesGetResponse200JsonX2e1835c6.Builder.() -> Unit): InlineReposActionsVariablesGetResponse200JsonX2e1835c6 = InlineReposActionsVariablesGetResponse200JsonX2e1835c6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsVariablesGetResponse200JsonX2e1835c6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
